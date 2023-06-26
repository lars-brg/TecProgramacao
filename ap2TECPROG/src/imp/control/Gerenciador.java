package imp.control;

import java.util.Random;

import imp.view.Tabuleiro;

public class Gerenciador {
	private Tabuleiro tabuleiro;
	
	public int randomizarElemento(int num1, int num2){
		Random random = new Random();
		return random.nextInt((num1 - num2) + 1) + num1;
	}
	
	public void popularTabuleiro() {
	}
}
