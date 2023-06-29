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

import imp.model.Aluno;
import imp.model.Andador;
import imp.model.Bispo;
import imp.model.Bug;
import imp.model.Cavalo;

public class InicioSuperior extends JPanel {
	private JPanel iconeQuantidade;
	private JPanel painelImagens;
	private JLabel pontuacao;
	private int quantidadeAluno = 0;
	private int quantidadeBug = 0;
	private int pontosAndador = 0;
	private int pontosBispo = 0;
	private int pontosCavalo = 0;
	private int pontosTotais = pontosAndador + pontosBispo + pontosCavalo;

	public InicioSuperior() {
		setBackground(Color.pink);

		// Cria o painel de ícones da lateral (Alunos e Bugs)
		iconeQuantidade = new JPanel();
		iconeQuantidade.setPreferredSize(new Dimension(280, 50));
		iconeQuantidade.setBackground(Color.pink);
		iconeQuantidade.setBorder(BorderFactory.createEmptyBorder(-5, 0, 0, 0));

		// Cria o painel dos robôs da lateral e suas respectivas pontuações (Andador,
		// Bispo e Cavalo)
		painelImagens = new JPanel();
		painelImagens.setLayout(new BoxLayout(painelImagens, BoxLayout.X_AXIS));
		painelImagens.setBackground(Color.pink);
		painelImagens.setPreferredSize(new Dimension(215, 150));
		painelImagens.setBorder(BorderFactory.createEmptyBorder(-25, 0, 0, 0));

		ImageIcon abertura = new ImageIcon("imagens/imp.png");
		abertura.setImage(abertura.getImage().getScaledInstance(180, 130, Image.SCALE_SMOOTH));
		JLabel logo = new JLabel(abertura);
		pontuacao = new JLabel("Pontuação: ");
		JLabel quantidadePontos = new JLabel(String.valueOf(pontosTotais));

		JLabel bugs = new JLabel(new Bug().getIcone());
		// JLabel quantidadeBug = new JLabel(": 8");

		JLabel alunos = new JLabel(new Aluno().getIcone());
		// quantidadeAluno = new JLabel(": 8");

		ImageIcon andador = new ImageIcon("imagens/blitzo full.png");
		andador.setImage(andador.getImage().getScaledInstance(60, 100, Image.SCALE_SMOOTH));
		JLabel roboA = new JLabel(andador);
		// pontosAndador = new JLabel("10");

		ImageIcon cavalo = new ImageIcon("imagens/millie full.png");
		cavalo.setImage(cavalo.getImage().getScaledInstance(60, 100, Image.SCALE_SMOOTH));
		JLabel roboC = new JLabel(cavalo);
		// JLabel pontC = new JLabel("-15");

		ImageIcon bispo = new ImageIcon("imagens/moxxie full.png");
		bispo.setImage(bispo.getImage().getScaledInstance(50, 100, Image.SCALE_SMOOTH));
		JLabel roboB = new JLabel(bispo);
		// pontosBispo = new JLabel("0");

		add(logo);
		add(pontuacao);
		iconeQuantidade.add(alunos);
		iconeQuantidade.add(new JLabel(String.valueOf(this.quantidadeAluno)));
		iconeQuantidade.add(bugs);
		iconeQuantidade.add(new JLabel(String.valueOf(this.quantidadeBug)));
		painelImagens.add(roboA);
		painelImagens.add(new JLabel(String.valueOf(this.pontosAndador)));
		painelImagens.add(roboC);
		painelImagens.add(new JLabel(String.valueOf(this.pontosCavalo)));
		painelImagens.add(roboB);
		painelImagens.add(new JLabel(String.valueOf(this.pontosBispo)));

		setLayout(new FlowLayout());
		add(iconeQuantidade);
		add(painelImagens);
	}

	public int getQuantidadeAluno() {
		return quantidadeAluno;
	}

	public void setQuantidadeAluno(int quantidadeAluno) {
		this.quantidadeAluno = quantidadeAluno;
	}

	public int getQuantidadeBug() {
		return quantidadeBug;
	}

	public void setQuantidadeBug(int quantidadeBug) {
		this.quantidadeBug = quantidadeBug;
	}

	public int getPontosAndador() {
		return pontosAndador;
	}

	public void setPontosAndador(int pontosAndador) {
		this.pontosAndador = pontosAndador;
	}

	public int getPontosBispo() {
		return pontosBispo;
	}

	public void setPontosBispo(int pontosBispo) {
		this.pontosBispo = pontosBispo;
	}

	public int getPontosCavalo() {
		return pontosCavalo;
	}

	public void setPontosCavalo(int pontosCavalo) {
		this.pontosCavalo = pontosCavalo;
	}

	public int getPontosTotais() {
		return pontosTotais;
	}

	public void setPontosTotais(int pontosTotais) {
		this.pontosTotais = pontosTotais;
	}

	public void resgatarAluno() {
		this.quantidadeAluno += 1;
	}
	public void encontrarBug() {
		this.quantidadeBug += 1;
	}
	public void atualizarValores(int quantidadeAluno, int quantidadeBug, int pontosAndador, int pontosBispo, int pontosCavalo) {
		this.quantidadeAluno = quantidadeAluno;
		this.quantidadeBug = quantidadeBug;
		this.pontosAndador = pontosAndador;
		this.pontosBispo = pontosBispo;
		this.pontosCavalo = pontosCavalo;
		
		pontosTotais = this.pontosAndador + this.pontosBispo + this.pontosCavalo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
