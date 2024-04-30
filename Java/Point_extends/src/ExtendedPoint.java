import java.awt.Color;

import javax.swing.JOptionPane;

public class ExtendedPoint extends Point {
	private Color color;

	public ExtendedPoint() {
	}

	public ExtendedPoint(int x, int y, Color color) {
//		setX(x);
//		setY(y);
//		super(x, y);
		// Mettre x et y protected
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public String toString() {
		return "ExtendedPoint [x=" + x + ", y=" + y + ", color=" + color + "]";
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void afficher() {
		JOptionPane.showMessageDialog(null, "ExtendedPoint [x=" + x + ", y=" + y + ", color=" + color + "]");
	}

}
