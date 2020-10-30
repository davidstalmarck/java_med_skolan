import se.lth.cs.pt.window.SimpleWindow;
public class SimpleWindowExample {
public static void main(String[] args) {
SimpleWindow w = new SimpleWindow(300, 300, "Drawing Window");
w.moveTo(100, 100);
w.lineTo(200, 100);
w.lineTo(200, 200);
w.lineTo(100, 200);
w.lineTo(100, 100);



}
}