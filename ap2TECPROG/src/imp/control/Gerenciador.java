package imp.control;

import java.util.Random;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import imp.view.BotaoMenuSecundario;
import imp.view.Menu;
import imp.view.MenuSecundario;
import imp.view.Tabuleiro;
import imp.view.TelaInicial;
import imp.model.*;

public class Gerenciador {
	public int numeroAluno = 5;
	public int numeroBug = 5;
	private TelaInicial telaInicial;
	private Menu menu;
	private Tabuleiro tabuleiro;
	private MenuSecundario menuSecundario;
	private BotaoMenuSecundario botaoMenuSecundario;
	private JFrame Jogo;

	private Andador andador;
	private Bispo bispo;
	private Cavalo cavalo;

	public Gerenciador(Tabuleiro tabuleiro, MenuSecundario menuSecundario, Menu menu, TelaInicial telaInicial,
			JFrame jogo) {
		andador = new Andador();
		bispo = new Bispo();
		cavalo = new Cavalo();

		this.tabuleiro = tabuleiro;
		this.menuSecundario = menuSecundario;
		this.menu = menu;
		this.telaInicial = telaInicial;
		this.Jogo = jogo;
		for (int i = 1; i <= 64; i++) {
			final int id = i;

			tabuleiro.getCelula(id).getBotao().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					switch (menuSecundario.getRoboImagem().getRoboEscolhido()) {
					case 1:
						tabuleiro.getCelula(id).getBotao().setIcon(andador.getIcone());
						break;
					case 2:
						tabuleiro.getCelula(id).getBotao().setIcon(bispo.getIcone());
						break;
					case 3:
						tabuleiro.getCelula(id).getBotao().setIcon(cavalo.getIcone());
						break;
					}
				}
			});

		}
		menu.getBotaoJogar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tabuleiro.setVisible(true);
				menuSecundario.setVisible(true);
				menu.setVisible(true);
			}
		});
		//if (menu.getNomeJogador().getText().isEmpty()) {
			//menu.getBotaoJogar().setEnabled(false);
		//} else if(menu.getNomeJogador().getText() != null){
			//menu.getBotaoJogar().setEnabled(true);
		//}

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
				tabuleiro.getCelula(idAleatorio).getBotao().setIcon(novoAluno.getIcone());
			} else if (alvoEscolhido == 2) {
				Bug novoBug = new Bug();
				tabuleiro.getCelula(idAleatorio).setContent(novoBug);
				tabuleiro.getCelula(idAleatorio).getBotao().setIcon(novoBug.getIcone());
			}
		}
	}
	public int verificarElementoCelula(Robo robo) {
		if (robo.getCelulaLocalizada().getContent() != null)
			return robo.getCelulaLocalizada().getContent().getTipo();	
		
		return 0;
		}
	
	public String analisarRodada(Robo robo) {
		return "";
	}

}
