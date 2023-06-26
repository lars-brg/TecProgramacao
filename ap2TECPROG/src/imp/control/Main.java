package imp.control;
import imp.view.*;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Main {
	public static void main(String[] args) {
		JFrame janela = new JFrame("Ilha de Java");
		Image icon = Toolkit.getDefaultToolkit().getImage("iconeJanela.png");
		janela.setSize(900, 700);
		janela.setResizable(false);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setIconImage(icon);

		JPanel painelPrincipal = new JPanel(new BorderLayout());

		Tabuleiro tabuleiro = new Tabuleiro();
		Menu menu = new Menu();
		MenuSecundario menuSecundario = new MenuSecundario();
		//ImgBackground imagemFundo = new ImgBackground();
		//imagemFundo.setSize(900, 700);

		painelPrincipal.add(tabuleiro, BorderLayout.CENTER);
		painelPrincipal.add(menu, BorderLayout.NORTH);
		painelPrincipal.add(menuSecundario, BorderLayout.EAST);
		//painelPrincipal.add(imagemFundo);

		janela.add(painelPrincipal);
		janela.setVisible(true);
	}

}