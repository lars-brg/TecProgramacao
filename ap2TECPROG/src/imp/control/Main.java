package imp.control;
import imp.view.*;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		JFrame janela = new JFrame("Ilha de Java");
		janela.setSize(900, 700);
		janela.setResizable(false);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel painelPrincipal = new JPanel(new BorderLayout());

		Tabuleiro tabuleiro = new Tabuleiro();
		Menu menu = new Menu();
		MenuSecundario menuSecundario = new MenuSecundario();

		painelPrincipal.add(tabuleiro, BorderLayout.CENTER);
		painelPrincipal.add(menu, BorderLayout.NORTH);
		painelPrincipal.add(menuSecundario, BorderLayout.EAST);

		janela.add(painelPrincipal);
		janela.setVisible(true);
	}

}
