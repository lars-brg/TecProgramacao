package imp.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Menu extends JPanel {
	private ImageIcon logoInicio;
	private JTextField nomeJogador;
	private JButton botaoJogar;
	private JButton botaoRelatorio;

	public Menu() {
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(900, 40));
		setBackground(Color.pink);

		logoInicio = new ImageIcon("imagens/imp.png");
		logoInicio.setImage(logoInicio.getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH));
		JLabel icone = new JLabel(logoInicio);

		JLabel nomeUsuario = new JLabel("Nome do Jogador: ");
		this.nomeJogador = new JTextField(25);
		this.botaoJogar = new Botao("Jogar", new Color(249, 32, 52), null);
		this.botaoRelatorio = new Botao("Gerar Relatório", new Color(249, 32, 52), null);
		this.botaoRelatorio.setEnabled(true);

		add(icone);
		add(nomeUsuario);
		add(nomeJogador);
		add(botaoJogar);
		add(botaoRelatorio);
	}

	public JTextField getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(JTextField nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public JButton getBotaoJogar() {
		return botaoJogar;
	}

	public void setBotaoJogar(JButton botaoJogar) {
		this.botaoJogar = botaoJogar;
	}

	public JButton getBotaoRelatorio() {
		return botaoRelatorio;
	}

	public void setBotaoRelatorio(JButton botaoRelatorio) {
		this.botaoRelatorio = botaoRelatorio;
	}
}
