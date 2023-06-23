package ap2TECPROG;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


	public class MenuSecundario extends JPanel{
		private JButton botaoVerificar;
		private JButton botaoProxJogada;
		private JButton botaoSair;
		
		public MenuSecundario() {
			setLayout(new FlowLayout());
			
			JPanel menuSecundario = new JPanel();
			menuSecundario.setPreferredSize(new Dimension (250, 700));
			menuSecundario.setBackground(Color.pink);
			
			/*botaoVerificar = new JButton("Verificar");
			botaoVerificar.setBackground(Color.red);
			botaoProxJogada = new JButton("Próxima Jogada");
			botaoProxJogada.setBackground(Color.red);
			botaoSair = new JButton("Sair do Jogo");
			botaoSair.setBackground(Color.red);
			
			add(botaoVerificar);
			add(botaoProxJogada);
			add(botaoSair);*/
			
			ImageIcon icone = new ImageIcon("/ap2TECPROG/src/ap2TECPROG/img/blitzo.png");
			icone.setImage(icone.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
			JLabel imagem = new JLabel(icone);
			
			menuSecundario.add(imagem, BorderLayout.SOUTH);
			add(menuSecundario);
		}
}
