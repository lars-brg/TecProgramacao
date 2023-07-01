package imp.view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BoxLayout;

public class MenuSecundario extends JPanel {
	private RoboImagem roboImagem;
	private BotaoMenuSecundario botaoMenuSecundario;
	private InicioSuperior inicioSuperior;

	public MenuSecundario() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JPanel menuSecundario = new JPanel();
		menuSecundario.setPreferredSize(new Dimension(250, 400));
		menuSecundario.setBackground(Color.pink);

		this.botaoMenuSecundario = new BotaoMenuSecundario();
		this.inicioSuperior = new InicioSuperior();
		inicioSuperior.setPreferredSize(new Dimension(250, 330));
		this.roboImagem = new RoboImagem();
		roboImagem.setPreferredSize(new Dimension(280, 80));

		menuSecundario.add(inicioSuperior);
		menuSecundario.add(roboImagem);

		menuSecundario.add(botaoMenuSecundario);
		add(menuSecundario);
	}

	public BotaoMenuSecundario getBotaoMenuSecundario() {
		return botaoMenuSecundario;
	}

	public void setBotaoMenuSecundario(BotaoMenuSecundario botaoMenuSecundario) {
		this.botaoMenuSecundario = botaoMenuSecundario;
	}

	public InicioSuperior getInicioSuperior() {
		return inicioSuperior;
	}

	public void setInicioSuperior(InicioSuperior inicioSuperior) {
		this.inicioSuperior = inicioSuperior;
	}

	public RoboImagem getRoboImagem() {
		return roboImagem;
	}

	public void setRoboImagem(RoboImagem roboImagem) {
		this.roboImagem = roboImagem;
	}
}
