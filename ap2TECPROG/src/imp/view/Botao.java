package imp.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Botao extends JButton{
	private static final long serialVersionUID = 1L;

	public Botao(String txt, Color color, Icon icon) {
		setText(txt);
		setBackground(color);
		setBorderPainted(false);
		setIcon(icon);
		
		
	}
}
