import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class DrawThreeSquares {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare");
		while (true) {
			w.waitForMouseClick();
			int x = w.getClickedX();
			int y = w.getClickedY();
			Square sq1 = new Square(x, y, 100);
			Square sq2 = new Square(x-50, y+25, 100);
			Square sq3 = new Square(x-25, y+50, 100);
			//Square sq4 = null;
			sq1.draw(w);
			sq2.draw(w);
			sq3.draw(w);
			//sq4.draw(w);
		}
	}
}
