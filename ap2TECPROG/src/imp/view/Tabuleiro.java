package imp.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import imp.model.*;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.Icon;
import javax.swing.JButton;

	public class Tabuleiro extends JPanel{
		JPanel Plano;
		
		//private static final long serialVersionUID = 1L;

		public Tabuleiro() {
			super(new GridLayout(8, 8));
			gerarBotoes();
			//setLayout(new FlowLayout());
		}
		
		public void gerarBotoes() {
			for (int linha = 1, id = 1; linha <= 8; linha++) {
				for (int coluna = 1; coluna <= 8; coluna++, id ++) {
					
					Celula celula = new Celula(id);
					//JButton botao = new JButton();
					//Image iconLogo = Toolkit.getDefaultToolkit().getImage("logoModel.png");
					celula.getBotao().setPreferredSize(new Dimension(50, 50));
					celula.getBotao().setBorderPainted(false);
					//botao.setIcon((Icon) iconLogo);
					
					if((linha + coluna) % 2 == 0) {
						celula.getBotao().setBackground(new Color(249, 32, 52));
					} else {
						celula.getBotao().setBackground(Color.black);
					}
					add(celula.getBotao());
				}
			}
		}
}
		