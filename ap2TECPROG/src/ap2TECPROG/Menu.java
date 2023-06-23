package ap2TECPROG;

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


	public class Menu extends JPanel{
		private JTextField nomeJogador;
		private JButton botaoJogar;
		private JButton botaoRelatorio;
		
		public Menu() {
			setLayout(new FlowLayout());
			
			JPanel menuSuperior = new JPanel();
			menuSuperior.setPreferredSize(new Dimension (1200, 40));
			menuSuperior.setBackground(Color.pink);
			//menuSuperior.setBorder(null);
			
			JLabel nomeUsuario = new JLabel("Nome do Jogador: ");
			nomeJogador = new JTextField(25);
			botaoJogar = new JButton("Jogar");
			botaoRelatorio = new JButton("Relatorio do Jogo");
			
			this.botaoJogar.setBackground(new Color(236, 71, 91));
			this.botaoRelatorio.setBackground(new Color(236, 71, 91));
			
			menuSuperior.add(nomeUsuario);
			menuSuperior.add(nomeJogador);
			menuSuperior.add(botaoJogar);
			menuSuperior.add(botaoRelatorio);
			
			nomeJogador.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String nome = nomeJogador.getText().trim();
					if(!nome.isEmpty()) 
						botaoJogar.setEnabled(true);
				}
			});
			add(menuSuperior, BorderLayout.NORTH);
		}
		
}
	