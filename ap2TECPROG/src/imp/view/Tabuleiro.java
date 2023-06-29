package imp.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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

public class Tabuleiro extends JPanel {
	JPanel Plano;

	public Tabuleiro() {
		super(new GridLayout(8, 8));
		gerarBotoes();
	}

	public void gerarBotoes() {
		for (int linha = 1, id = 1; linha <= 8; linha++) {
			for (int coluna = 1; coluna <= 8; coluna++, id++) {
				Celula celula = new Celula(id);
				JButton botao = new JButton();

				botao.setPreferredSize(new Dimension(50, 50));
				botao.setBorderPainted(false);

				if ((linha + coluna) % 2 == 0) {
					botao.setBackground(new Color(249, 32, 52));
				} else {
					botao.setBackground(Color.pink);
				}

				celula.setBotao(botao);
				botao.putClientProperty("celula", celula);

				add(botao);
			}
		}
	}

	public Celula getCelula(int id) {
		Component[] components = getComponents();
		for (Component component : components) {
			if (component instanceof JButton) {
				JButton botao = (JButton) component;
				Celula celula = (Celula) botao.getClientProperty("celula");
				if (celula.getId() == id)
					return celula;
			}
		}
		return null;
	}

}