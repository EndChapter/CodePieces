import java.applet.Applet;
import java.awt.*;

@SuppressWarnings("serial")
public class SimpleApplet extends Applet {
	public void paint(Graphics g) {
		g.drawString("A simple Applet", 20, 20);
	}
}
