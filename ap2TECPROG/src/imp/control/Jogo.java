package imp.control;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import imp.model.ElementoJogo;
import imp.view.InicioSuperior;
import imp.view.Menu;
import imp.view.MenuSecundario;
import imp.view.Tabuleiro;
import imp.view.TelaInicial;

public class Jogo extends JFrame {
	private Tabuleiro tabuleiro;
	private Menu menu;
	private MenuSecundario menuSecundario;
	private Gerenciador gerenciador;
	private TelaInicial telaInicial;
	private InicioSuperior inicioSuperior;
	private ElementoJogo elementoJogo;

	public Jogo() {
		super("Ilha de Java");
		Image icon = Toolkit.getDefaultToolkit().getImage("imagens/iconeJanela.png");
		setSize(900, 700);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(icon);

		JPanel painelPrincipal = new JPanel(new BorderLayout());

		tabuleiro = new Tabuleiro();
		menu = new Menu();
		telaInicial = new TelaInicial();
		menuSecundario = new MenuSecundario();
		menuSecundario.getBotaoMenuSecundario().getProxJogada().setEnabled(false);
		gerenciador = new Gerenciador(tabuleiro, menuSecundario, menu, telaInicial, this, inicioSuperior, elementoJogo);
		gerenciador.popularTabuleiro(tabuleiro);

		menu.setVisible(true);
		telaInicial.setVisible(true);
		tabuleiro.setVisible(false);
		menuSecundario.setVisible(false);

		painelPrincipal.add(menu, BorderLayout.NORTH);
		painelPrincipal.add(telaInicial, BorderLayout.CENTER);
		painelPrincipal.add(tabuleiro, BorderLayout.CENTER);
		painelPrincipal.add(menuSecundario, BorderLayout.EAST);

		add(painelPrincipal);
		setVisible(true);
	}
}
