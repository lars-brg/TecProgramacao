package imp.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

public class RoboImagem extends JPanel {
	private ImageIcon backgroundIcon;
	public RoboImagem() {
		//setLayout(new OverlayLayout(this));
		setBackground(Color.pink);
		
		//ImageIcon logoBG = new ImageIcon("logoModel.png");
		backgroundIcon = new ImageIcon("imagens/logoModel.png");
		backgroundIcon.setImage(backgroundIcon.getImage().getScaledInstance(200, 70, Image.SCALE_SMOOTH));

		ImageIcon iconeAndador = new ImageIcon("imagens/blitzo icon.png");
		iconeAndador.setImage(iconeAndador.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
		Botao iconeA = new Botao("", null, iconeAndador);
		iconeA.setPreferredSize(new Dimension(75, 65));
		iconeA.setOpaque(false);
		
		ImageIcon iconeCavalo = new ImageIcon("imagens/moxxie icon.png");
		iconeCavalo.setImage(iconeCavalo.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
		Botao iconeC = new Botao("", null, iconeCavalo);
		iconeC.setPreferredSize(new Dimension(75, 65));
		iconeC.setOpaque(false);
		
		ImageIcon iconeBispo = new ImageIcon("imagens/millie icon.png");
		iconeBispo.setImage(iconeBispo.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
		Botao iconeB = new Botao("", null, iconeBispo);
		iconeB.setPreferredSize(new Dimension(75, 65));
		iconeB.setOpaque(false);

		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		add(iconeA);
		add(iconeB);
		add(iconeC);
	}
	 @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        if (backgroundIcon != null) {
	            Image image = backgroundIcon.getImage();
	            int x = (getWidth() - image.getWidth(null)) / 2;
	            int y = (getHeight() - image.getHeight(null)) / 2;
	            g.drawImage(image, x, y, null);
	        }
	    }
}
