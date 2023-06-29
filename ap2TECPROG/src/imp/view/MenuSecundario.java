package imp.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuSecundario extends JPanel {
	private RoboImagem roboImagem;

	public RoboImagem getRoboImagem() {
		return roboImagem;
	}

	public void setRoboImagem(RoboImagem roboImagem) {
		this.roboImagem = roboImagem;
	}

	public MenuSecundario() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JPanel menuSecundario = new JPanel();
		menuSecundario.setPreferredSize(new Dimension(250, 400));
		menuSecundario.setBackground(Color.pink);

		BotaoMenuSecundario botaoVertical = new BotaoMenuSecundario();
		InicioSuperior superior = new InicioSuperior();
		superior.setPreferredSize(new Dimension(250, 330));
		this.roboImagem = new RoboImagem();
		roboImagem.setPreferredSize(new Dimension(280, 80));

		menuSecundario.add(superior);
		menuSecundario.add(roboImagem);

		
		menuSecundario.add(botaoVertical);
		add(menuSecundario);
	}
}
