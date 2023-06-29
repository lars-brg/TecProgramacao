package imp.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

import imp.model.Robo;

public class RoboImagem extends JPanel {
	private int roboEscolhido;
	private ImageIcon backgroundIcon;

	public RoboImagem() {
		setBackground(Color.pink);

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

		iconeA.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setRoboEscolhido(1);
			}
		});

		iconeB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setRoboEscolhido(2);

			}
		});

		iconeC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setRoboEscolhido(3);

			}
		});
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

	public int getRoboEscolhido() {
		return roboEscolhido;
	}

	public void setRoboEscolhido(int roboEscolhido) {
		this.roboEscolhido = roboEscolhido;
		System.out.println(this.getRoboEscolhido());
	}

}
