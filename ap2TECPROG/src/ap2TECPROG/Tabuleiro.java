package ap2TECPROG;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

	class Tabuleiro extends JPanel{
		public Tabuleiro() {
			super(new GridLayout(8, 8));
			gerarBotoes();
		}
		
		private void gerarBotoes() {
			for (int linha = 1; linha <= 8; linha++) {
				for (int coluna = 1; coluna <= 8; coluna++) {
					
					JButton botao = new JButton();
					botao.setPreferredSize(new Dimension(50, 50));
					botao.setBorderPainted(false);
					botao.setBorder(null);
					
					if((linha + coluna) % 2 == 0) {
						botao.setBackground(Color.pink);
					} else {
						botao.setBackground(Color.RED);
					}
					add(botao);
				}
			}
		}
}
		