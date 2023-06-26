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
	private static final long serialVersionUID = 1L;

	public MenuSecundario() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JPanel menuSecundario = new JPanel();
		menuSecundario.setPreferredSize(new Dimension(250, 400));
		menuSecundario.setBackground(Color.pink);
		
		//JPanel botoesInferiores = new JPanel();
		//botoesInferiores.setPreferredSize(new Dimension(200, 150));
		//botoesInferiores.setBackground(Color.pink);

		BotaoMenuSecundario botaoVertical = new BotaoMenuSecundario();
		InicioSuperior superior = new InicioSuperior();
		superior.setPreferredSize(new Dimension(250, 330));
		RoboImagem imagemRobo = new RoboImagem();
		imagemRobo.setPreferredSize(new Dimension(280, 80));

		Botao verificar = new Botao("Verificar", new Color(249, 32, 52), null);
		verificar.setPreferredSize(new Dimension(200, 50));
		//verificar.setAlignmentX(CENTER_ALIGNMENT);
		Botao proxJogada = new Botao("Próxima Jogada", new Color(249, 32, 52), null);
		proxJogada.setPreferredSize(new Dimension(200, 50));
		//proxJogada.setAlignmentX(CENTER_ALIGNMENT);
		Botao sair = new Botao("Sair", new Color(249, 32, 52), null);
		sair.setPreferredSize(new Dimension(200, 50));
		//sair.setAlignmentX(CENTER_ALIGNMENT);

		menuSecundario.add(superior);
		menuSecundario.add(imagemRobo);
		botaoVertical.add(verificar);
		botaoVertical.add(proxJogada);
		botaoVertical.add(sair);

		
		menuSecundario.add(botaoVertical);
		add(menuSecundario);
	}
}
