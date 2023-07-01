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
import imp.model.Bug;

public class InicioSuperior extends JPanel {
	private JPanel iconeQuantidade;
	private JPanel painelImagens;
	
	private JLabel pontuacao;
	private JLabel Aluno;
	private JLabel valoresAluno;
	private JLabel Bug;
	private JLabel valoresBug;
	private JLabel Andador;
	private JLabel pontosAndador;
	private JLabel Cavalo;
	private JLabel pontosCavalo;
	private JLabel Bispo;
	private JLabel pontosBispo;
	
	private int quantidadeAluno = 0;
	private int quantidadeBug = 0;
	private int pontuacaoAndador = 0;
	private int pontuacaoBispo = 0;
	private int pontuacaoCavalo = 0;
	private int pontuacaoTotal = pontuacaoAndador + pontuacaoBispo + pontuacaoCavalo;

	public InicioSuperior() {
		setBackground(Color.pink);

		iconeQuantidade = new JPanel();
		iconeQuantidade.setPreferredSize(new Dimension(280, 50));
		iconeQuantidade.setBackground(Color.pink);
		iconeQuantidade.setBorder(BorderFactory.createEmptyBorder(-5, 0, 0, 0));

		painelImagens = new JPanel();
		painelImagens.setLayout(new BoxLayout(painelImagens, BoxLayout.X_AXIS));
		painelImagens.setBackground(Color.pink);
		painelImagens.setPreferredSize(new Dimension(215, 150));
		painelImagens.setBorder(BorderFactory.createEmptyBorder(-35, 0, 0, 0));

		ImageIcon abertura = new ImageIcon("imagens/imp.png");
		abertura.setImage(abertura.getImage().getScaledInstance(180, 130, Image.SCALE_SMOOTH));
		JLabel logo = new JLabel(abertura);
		pontuacao = new JLabel("Pontuação: " + String.valueOf(pontuacaoTotal));
		
		this.pontuacaoTotal = pontuacaoTotal;

		this.Bug = new JLabel(new Bug().getIcone());
		valoresBug = new JLabel(String.valueOf(quantidadeBug));

		this.Aluno = new JLabel(new Aluno().getIcone());
		valoresAluno = new JLabel(String.valueOf(quantidadeAluno));

		this.Andador = new JLabel(new PontuacaoRobo().getImagemAndador());
		pontosAndador = new JLabel(String.valueOf(pontuacaoAndador));

		this.Cavalo = new JLabel(new PontuacaoRobo().getImagemCavalo());
		pontosCavalo = new JLabel(String.valueOf(pontuacaoCavalo));

		this.Bispo = new JLabel(new PontuacaoRobo().getImagemBispo());
		pontosBispo = new JLabel(String.valueOf(pontuacaoBispo));

		add(logo);
		add(pontuacao);

		iconeQuantidade.add(Aluno);
		iconeQuantidade.add(valoresAluno);
		iconeQuantidade.add(Bug);
		iconeQuantidade.add(valoresBug);
		painelImagens.add(createRoboPanel(Andador, pontosAndador));
		painelImagens.add(createRoboPanel(Cavalo, pontosCavalo));
		painelImagens.add(createRoboPanel(Bispo, pontosBispo));

		setLayout(new FlowLayout());
		add(iconeQuantidade);
		add(painelImagens);
	}

	private JPanel createRoboPanel(JLabel roboLabel, JLabel pontosLabel) {
		JPanel roboPanel = new JPanel();
		roboPanel.setLayout(new BoxLayout(roboPanel, BoxLayout.Y_AXIS));
		roboPanel.setBackground(Color.pink);
		roboPanel.setPreferredSize(new Dimension(70, 100));
		roboPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 10));

		roboPanel.add(roboLabel);
		roboPanel.add(pontosLabel);

		return roboPanel;
	}

	public JLabel getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(JLabel pontuacao) {
		this.pontuacao = pontuacao;
	}

	public JLabel getValoresBug() {
		return valoresBug;
	}

	public void setValoresBug(JLabel valoresBug) {
		this.valoresBug = valoresBug;
	}

	public JLabel getValoresAluno() {
		return valoresAluno;
	}

	public void setValoresAluno(JLabel valoresAluno) {
		this.valoresAluno = valoresAluno;
	}

	public JLabel getPontosAndador() {
		return pontosAndador;
	}

	public void setPontosAndador(JLabel pontosAndador) {
		this.pontosAndador = pontosAndador;
	}

	public JLabel getPontosCavalo() {
		return pontosCavalo;
	}

	public void setPontosCavalo(JLabel pontosCavalo) {
		this.pontosCavalo = pontosCavalo;
	}

	public JLabel getPontosBispo() {
		return pontosBispo;
	}

	public void setPontosBispo(JLabel pontosBispo) {
		this.pontosBispo = pontosBispo;
	}

	public void resgatarAluno() {
		this.quantidadeAluno += 1;
	}

	public void encontrarBug() {
		this.quantidadeBug += 1;
	}
	
	public void alterarValor(String valor) {
		pontosAndador.setText(valor);
	}

	public int getPontuacaoTotal() {
		return pontuacaoTotal;
	}

	public void setPontuacaoTotal(int pontuacaoTotal) {
		this.pontuacaoTotal = pontuacaoTotal;
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
	
}
