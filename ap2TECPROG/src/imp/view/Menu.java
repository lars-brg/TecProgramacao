package imp.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField nomeJogador;
	private JButton botaoJogar;
	private JButton botaoRelatorio;

	public Menu() {
		setLayout(new FlowLayout());

		setPreferredSize(new Dimension(1200, 40));
		setBackground(Color.pink);

		JLabel nomeUsuario = new JLabel("Nome do Jogador: ");
		nomeJogador = new JTextField(25);
		botaoJogar = new Botao("Jogar", new Color(236, 71, 91), null);
		botaoRelatorio = new Botao("Gerar Relatório", new Color(236, 71, 91), null);

		add(nomeUsuario);
		add(nomeJogador);
		add(botaoJogar);
		add(botaoRelatorio);

		nomeJogador.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = nomeJogador.getText().trim();
				if (!nome.isEmpty())
					botaoJogar.setEnabled(true);
			}
		});
	}

}
