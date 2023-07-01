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

public class RoboImagem extends JPanel {
	private int roboEscolhido;
	private ImageIcon backgroundIcon;
	private ImageIcon iconeAndador;
	private ImageIcon iconeBispo;
	private ImageIcon iconeCavalo;
	private Botao botaoAndador;
	private Botao botaoBispo;
	private Botao botaoCavalo;

	public RoboImagem() {
		setBackground(Color.pink);

		backgroundIcon = new ImageIcon("imagens/logoModel.png");
		backgroundIcon.setImage(backgroundIcon.getImage().getScaledInstance(200, 70, Image.SCALE_SMOOTH));

		iconeAndador = new ImageIcon("imagens/blitzo icon.png");
		iconeAndador.setImage(iconeAndador.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
		botaoAndador = new Botao("", null, iconeAndador);
		botaoAndador.setPreferredSize(new Dimension(75, 65));
		botaoAndador.setOpaque(false);

		iconeCavalo = new ImageIcon("imagens/moxxie icon.png");
		iconeCavalo.setImage(iconeCavalo.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
		botaoCavalo = new Botao("", null, iconeCavalo);
		botaoCavalo.setPreferredSize(new Dimension(75, 65));
		botaoCavalo.setOpaque(false);

		iconeBispo = new ImageIcon("imagens/millie icon.png");
		iconeBispo.setImage(iconeBispo.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
		botaoBispo = new Botao("", null, iconeBispo);
		botaoBispo.setPreferredSize(new Dimension(75, 65));
		botaoBispo.setOpaque(false);

		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		add(botaoAndador);
		add(botaoBispo);
		add(botaoCavalo);

		botaoAndador.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				botaoAndador.setEnabled(false);
				setRoboEscolhido(1);
			}
		});

		botaoBispo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				botaoBispo.setEnabled(false);
				setRoboEscolhido(2);

			}
		});

		botaoCavalo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				botaoCavalo.setEnabled(false);
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

	public Botao getBotaoAndador() {
		return botaoAndador;
	}

	public void setBotaoAndador(Botao botaoAndador) {
		this.botaoAndador = botaoAndador;
	}

	public Botao getBotaoBispo() {
		return botaoBispo;
	}

	public void setBotaoBispo(Botao botaoBispo) {
		this.botaoBispo = botaoBispo;
	}

	public Botao getBotaoCavalo() {
		return botaoCavalo;
	}

	public void setBotaoCavalo(Botao botaoCavalo) {
		this.botaoCavalo = botaoCavalo;
	}

}
