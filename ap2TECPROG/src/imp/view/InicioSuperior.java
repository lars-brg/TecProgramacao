package imp.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InicioSuperior extends JPanel {
	public InicioSuperior() {
		// setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setBackground(Color.pink);

		JPanel iconeQuantidade = new JPanel();
		iconeQuantidade.setPreferredSize(new Dimension(280, 50));
		iconeQuantidade.setBackground(Color.pink);
		iconeQuantidade.setBorder(BorderFactory.createEmptyBorder(-5, 0, 0, 0));

		JPanel painelImagens = new JPanel();
		painelImagens.setLayout(new BoxLayout(painelImagens, BoxLayout.X_AXIS));
		painelImagens.setBackground(Color.pink);
		painelImagens.setPreferredSize(new Dimension(215, 150));
		// painelImagens.setAlignmentY(TOP_ALIGNMENT);
		painelImagens.setBorder(BorderFactory.createEmptyBorder(-25, 0, 0, 0));

		ImageIcon abertura = new ImageIcon("imagens/imp.png");
		abertura.setImage(abertura.getImage().getScaledInstance(180, 130, Image.SCALE_SMOOTH));
		JLabel logo = new JLabel(abertura);
		JLabel pontuacao = new JLabel("Pontuação: ");

		ImageIcon Bug = new ImageIcon("imagens/striker icon.png");
		Bug.setImage(Bug.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		JLabel bugs = new JLabel(Bug);
		JLabel quantidadeBug = new JLabel(": 5");

		ImageIcon Aluno = new ImageIcon("imagens/stolas icon.png");
		Aluno.setImage(Aluno.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		JLabel alunos = new JLabel(Aluno);
		JLabel quantidadeAluno = new JLabel(": 10");

		ImageIcon andador = new ImageIcon("imagens/blitzo full.png");
		andador.setImage(andador.getImage().getScaledInstance(60, 100, Image.SCALE_SMOOTH));
		JLabel roboA = new JLabel(andador);
		JLabel pontA = new JLabel("10");

		ImageIcon cavalo = new ImageIcon("imagens/millie full.png");
		cavalo.setImage(cavalo.getImage().getScaledInstance(60, 100, Image.SCALE_SMOOTH));
		JLabel roboC = new JLabel(cavalo);
		JLabel pontC = new JLabel("-15");

		ImageIcon bispo = new ImageIcon("imagens/moxxie full.png");
		bispo.setImage(bispo.getImage().getScaledInstance(50, 100, Image.SCALE_SMOOTH));
		JLabel roboB = new JLabel(bispo);
		JLabel pontB = new JLabel("0");

		add(logo);
		add(pontuacao);
		// add(bugs);
		// add(quantidadeBug);
		// add(alunos);
		// add(quantidadeAluno);
		iconeQuantidade.add(bugs);
		iconeQuantidade.add(quantidadeBug);
		iconeQuantidade.add(alunos);
		iconeQuantidade.add(quantidadeAluno);
		painelImagens.add(roboA);
		painelImagens.add(pontA);
		painelImagens.add(roboC);
		painelImagens.add(pontC);
		painelImagens.add(roboB);
		painelImagens.add(pontB);

		setLayout(new FlowLayout());
		add(iconeQuantidade);
		add(painelImagens);
	}

}
