import java.awt.Color;

import se.lth.cs.pt.window.SimpleWindow;

public class LineDrawing {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "LineDrawing");
		Color myColor = new Color(255,200,200);
		w.setLineColor(myColor);
		w.moveTo(0, 0);
		while (true) {
			// vänta tills användaren klickar på en musknapp
			w.waitForMouseClick();
			int x = w.getClickedX();
			int y = w.getClickedY();
			// rita en linje till den punkt där användaren klickade
			w.lineTo(x, y);
		}
	}

}
