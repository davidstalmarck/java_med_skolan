import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class MoveableSquare {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "MoveableSquares");
		int oldX = 0; // x-koordinaten för "förra punkten"
		int oldY = 0; // y-koordinaten
		while (true) {
			int x = w.getClickedX();
			int y = w.getClickedY();
			w.moveTo(x, y);
			int xDist = x - oldX;
			int yDist = y - oldY;
			int Dist = ((int) Math.round(Math.sqrt(xDist * xDist + yDist * yDist)))/5;
			Square[] squareArray;
			squareArray = new Square[Dist];
			for (int i=0; i<Dist; i+=1) {
				SimpleWindow.delay(15);
				int moveX = oldX + (xDist/Dist)*i;
				int moveY = oldY + (yDist/Dist)*i;
				squareArray[i] = new Square(moveX, moveY, 100);
				squareArray[i].draw(w);
			}
			SimpleWindow.delay(15);
			Square sq = new Square(x, y, 100);
			sq.draw(w);
			oldX = x;
			oldY = y;
			w.waitForMouseClick();
			sq.erase(w);
			for (int i=0; i<Dist; i+=1) {					
				SimpleWindow.delay(15);
				squareArray[i].erase(w);
			}

		
		}
	}
}