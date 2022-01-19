package capitulo04.bloque02Herencia.ventanaConCanvas;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Cuadro {

	public static void main(String[] args) {
		
		JFrame Cuadro = new JFrame();
		Cuadro.setBounds(0, 0,700, 700);
		Cuadro.getContentPane().setLayout(new BorderLayout());
		
		MiCanvas dibujo = new MiCanvas();
		dibujo.setBackground(Color.WHITE);
		
		Cuadro.getContentPane().add(dibujo, borderLayout.CENTER);
		Cuadro.setVisible(true);
		
	}

}
