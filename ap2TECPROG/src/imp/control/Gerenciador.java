package imp.control;

import java.util.Random;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Font;

import imp.view.BotaoMenuSecundario;
import imp.view.InicioSuperior;
import imp.view.Menu;
import imp.view.MenuSecundario;
import imp.view.PontuacaoRobo;
import imp.view.Tabuleiro;
import imp.view.TelaInicial;
import imp.model.*;
import imp.view.*;

public class Gerenciador {
	public String nomeJogador;
	public int qtdRodadas = 0;
	public int numeroAluno = 5;
	public int numeroBug = 5;
	public int qtdCelulasVazias = 0;
	private TelaInicial telaInicial;
	private Menu menu;
	private Tabuleiro tabuleiro;
	private MenuSecundario menuSecundario;
	private BotaoMenuSecundario botaoMenuSecundario;
	private JFrame Jogo;
	private InicioSuperior inicioSuperior;
	private ElementoJogo elementoJogo;

	private Aluno aluno;
	private Bug bug;
	private Andador andador;
	private Bispo bispo;
	private Cavalo cavalo;

	public Gerenciador(Tabuleiro tabuleiro, MenuSecundario menuSecundario, Menu menu, TelaInicial telaInicial,
			JFrame jogo, InicioSuperior inicioSuperiorRecebido, ElementoJogo elementoJogo) {
		andador = new Andador();
		bispo = new Bispo();
		cavalo = new Cavalo();
		
		
		this.tabuleiro = tabuleiro;
		this.menuSecundario = menuSecundario;
		this.menu = menu;
		this.telaInicial = telaInicial;
		this.Jogo = jogo;
		this.inicioSuperior = inicioSuperiorRecebido;
		
		
		this.elementoJogo = elementoJogo;
		for (int i = 1; i <= 64; i++) {
			final int id = i;

			tabuleiro.getCelula(id).getBotao().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					switch (menuSecundario.getRoboImagem().getRoboEscolhido()) {
					case 1:
						andador.setCelulaLocalizada(tabuleiro.getCelula(id));
						tabuleiro.getCelula(id).getBotao().setIcon(andador.getIcone());

						if (tabuleiro.getCelula(id).getContent() != null) {
							if (tabuleiro.getCelula(id).getContent().getTipo() == 'A') {
								andador.ganharPontos();
								menuSecundario.getInicioSuperior().resgatarAluno();
								System.out.println("ganhou");

							} else if (tabuleiro.getCelula(id).getContent().getTipo() == 'B') {
								andador.perderPontos();
								menuSecundario.getInicioSuperior().encontrarBug();
								System.out.println("perdeu");

							}
						}
						break;
					case 2:
						bispo.setCelulaLocalizada(tabuleiro.getCelula(id));
						tabuleiro.getCelula(id).getBotao().setIcon(bispo.getIcone());
						if (tabuleiro.getCelula(id).getContent() != null) {
							if (tabuleiro.getCelula(id).getContent().getTipo() == 'A') {
								bispo.ganharPontos();
								menuSecundario.getInicioSuperior().resgatarAluno();
								System.out.println("ganhou");
							} else if (tabuleiro.getCelula(id).getContent().getTipo() == 'B') {
								bispo.perderPontos();
								menuSecundario.getInicioSuperior().encontrarBug();
								System.out.println("perdeu");
							}
						}
						break;
					case 3:
						cavalo.setCelulaLocalizada(tabuleiro.getCelula(id));
						tabuleiro.getCelula(id).getBotao().setIcon(cavalo.getIcone());
						if (tabuleiro.getCelula(id).getContent() != null) {
							if (tabuleiro.getCelula(id).getContent().getTipo() == 'A') {
								cavalo.ganharPontos();
								menuSecundario.getInicioSuperior().resgatarAluno();
								System.out.println("ganhou");
							} else if (tabuleiro.getCelula(id).getContent().getTipo() == 'B') {
								cavalo.perderPontos();
								menuSecundario.getInicioSuperior().encontrarBug();
								System.out.println("perdeu");
							}
						}
						break;

					}
					menuSecundario.getRoboImagem().setRoboEscolhido(0);

				}
			});

			menuSecundario.getBotaoMenuSecundario().getVerificar().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if (!menuSecundario.getRoboImagem().getBotaoAndador().isEnabled()
							&& !menuSecundario.getRoboImagem().getBotaoBispo().isEnabled()
							&& !menuSecundario.getRoboImagem().getBotaoCavalo().isEnabled()) {

						atualizarValores();
						menuSecundario.getBotaoMenuSecundario().getProxJogada().setEnabled(true);
						menuSecundario.getBotaoMenuSecundario().getVerificar().setEnabled(false);

					}

				}
			});
			menuSecundario.getBotaoMenuSecundario().getProxJogada().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					qtdRodadas+=1;
					proximaRodada();

					menuSecundario.getBotaoMenuSecundario().getProxJogada().setEnabled(false);
					menuSecundario.getBotaoMenuSecundario().getVerificar().setEnabled(true);
				}
			});
			

		}
		menuSecundario.getBotaoMenuSecundario().getSair().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int confirm = JOptionPane.showConfirmDialog(null, "Você realmente quer sair do jogo?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    jogo.dispose();
                    mostrarRelatorio();
                }
			}
		});
		menu.getBotaoJogar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!menu.getNomeJogador().getText().isEmpty()) {
					tabuleiro.setVisible(true);
					menuSecundario.setVisible(true);
					menu.setVisible(true);
					nomeJogador = menu.getNomeJogador().getText();
					
				} else {
					// Botao sem bug
					JOptionPane.showMessageDialog(null, "Por favor, insira seu nome!");
				}

			}
		});
		
		menu.getBotaoRelatorio().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarRelatorio();
			}
		});

	}
	public void mostrarRelatorio() {
		String nome = nomeJogador;
		int pontuacao = andador.getPontos() + bispo.getPontos() + cavalo.getPontos();
		int qtdRodadasTotais = qtdRodadas/64;
		int qtdAlunos =  menuSecundario.getInicioSuperior().getQuantidadeAluno();
		int qtdBug = menuSecundario.getInicioSuperior().getQuantidadeBug();
		int qtdCelulasVazias = ((qtdRodadasTotais * 3) - qtdAlunos - qtdBug);
		int pontosAndador = andador.getPontos();
		int pontosBispo = bispo.getPontos();
		int pontosCavalo = cavalo.getPontos();
		

        // Definir os nomes das variáveis
        String[] colunas = {"Jogador", "Rodadas", "Celulas Vazias","Pontuação",  "Qtd. Alunos", "Qtd. Bugs",
                "Andador", "Bispo", "Cavalo"};

        // Criar uma matriz com os valores das variáveis
        Object[][] data = {
                {nome, qtdRodadasTotais, qtdCelulasVazias, pontuacao,  qtdAlunos, qtdBug, pontosAndador, pontosBispo, pontosCavalo}
        };

        // Criar o modelo de tabela com os dados
        DefaultTableModel model = new DefaultTableModel(data, colunas) {
            @Override
            public int getRowCount() {
                return 1; // Retorna apenas 1 para exibir apenas a primeira linha
            }
        };

     // Criar a tabela com o modelo
        JTable table = new JTable(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        // Criar o JScrollPane com a tabela
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new java.awt.Dimension(400, 70)); // Definir a altura preferida do JScrollPane

        // Exibir a tabela em uma caixa de diálogo JOptionPane
        JOptionPane.showMessageDialog(null, scrollPane);
        // Exibir a tabela em uma caixa de diálogo JOptionPane
        
	}
	public void atualizarValores() {
		menuSecundario.getInicioSuperior().getPontuacao()
				.setText("Pontuaçao: " + String.valueOf(andador.getPontos() + bispo.getPontos() + cavalo.getPontos()));
		menuSecundario.getInicioSuperior().getValoresAluno()
				.setText(String.valueOf(menuSecundario.getInicioSuperior().getQuantidadeAluno()));
		menuSecundario.getInicioSuperior().getValoresBug()
				.setText(String.valueOf(menuSecundario.getInicioSuperior().getQuantidadeBug()));
		menuSecundario.getInicioSuperior().getPontosAndador().setText(String.valueOf(andador.getPontos()));
		menuSecundario.getInicioSuperior().getPontosBispo().setText(String.valueOf(bispo.getPontos()));
		menuSecundario.getInicioSuperior().getPontosCavalo().setText(String.valueOf(cavalo.getPontos()));
	}

	public void proximaRodada() {
		ImageIcon celulaDesabilitada = new ImageIcon("imagens/logoModel.png");
		celulaDesabilitada.setImage(celulaDesabilitada.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));

		if(andador.getCelulaLocalizada().getContent()!=null) {
			andador.getCelulaLocalizada().getBotao().setIcon(andador.getCelulaLocalizada().getContent().getIcone());
		}else {
			andador.getCelulaLocalizada().getBotao().setIcon(celulaDesabilitada);
		}
		
		
		if(bispo.getCelulaLocalizada().getContent()!=null) {
			bispo.getCelulaLocalizada().getBotao().setIcon(bispo.getCelulaLocalizada().getContent().getIcone());
		}else {
			bispo.getCelulaLocalizada().getBotao().setIcon(celulaDesabilitada);
		}
		
		
		if(cavalo.getCelulaLocalizada().getContent()!=null) {
			cavalo.getCelulaLocalizada().getBotao().setIcon(cavalo.getCelulaLocalizada().getContent().getIcone());
		}else {
			cavalo.getCelulaLocalizada().getBotao().setIcon(celulaDesabilitada);
		}
		
		tabuleiro.getCelula(andador.getCelulaLocalizada().getId()).getBotao().setEnabled(false);
		tabuleiro.getCelula(bispo.getCelulaLocalizada().getId()).getBotao().setEnabled(false);
		tabuleiro.getCelula(cavalo.getCelulaLocalizada().getId()).getBotao().setEnabled(false);

		menuSecundario.getRoboImagem().getBotaoAndador().setEnabled(true);
		menuSecundario.getRoboImagem().getBotaoBispo().setEnabled(true);
		menuSecundario.getRoboImagem().getBotaoCavalo().setEnabled(true);
		
		
	}

	public int randomizarElemento(int min, int max) {
		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;
	}

	public void popularTabuleiro(Tabuleiro tabuleiro) {
		ArrayList<Integer> idsAleatorios = new ArrayList<>();

		for (int i = 1; i <= this.numeroAluno + this.numeroBug; i++) {
			int idAleatorio;
			boolean mesmoId;
			do {
				idAleatorio = randomizarElemento(1, 64);
				mesmoId = idsAleatorios.contains(idAleatorio);
			} while (mesmoId);

			idsAleatorios.add(idAleatorio);

			int alvoEscolhido = (i <= this.numeroAluno) ? 1 : 2;

			if (alvoEscolhido == 1) {
				Aluno novoAluno = new Aluno();
				tabuleiro.getCelula(idAleatorio).setContent(novoAluno);
				tabuleiro.getCelula(idAleatorio).getBotao().setIcon(null);

			} else if (alvoEscolhido == 2) {
				Bug novoBug = new Bug();
				tabuleiro.getCelula(idAleatorio).setContent(novoBug);
				tabuleiro.getCelula(idAleatorio).getBotao().setIcon(null);
			}
		}
	}

}
