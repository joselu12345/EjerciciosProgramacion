package capitulo04.bloque02Herencia.ventanaConCanvas;

import java.awt.Canvas;

public class MiCanvas extends Canvas {
	
	public void paint(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillRect(500, 500, 100, 50);
		
		g.setColor(Color.GREEN);
		g.fillOval(100, 100, 40, 40);
		
		g.setColor(Color.BLUE);
		int [] x = {250, 300, 200};
		int [] y = {200, 300, 300};
		g.fillPolygon(x, y, 3);
		
	}

}
