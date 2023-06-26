/*package imp.view;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.geom.AffineTransform;

public class ImgBackground extends JPanel {
	private Image backgroundImage;

	public ImgBackground() {

		backgroundImage = Toolkit.getDefaultToolkit()
				.createImage("C:\\Users\\abreu\\eclipse-workspace\\ap2TECPROG\\src\\ap2TECPROG\\img\\imp.png");
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.75f));
		g2d.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
		g2d.dispose();
	}
}
*/