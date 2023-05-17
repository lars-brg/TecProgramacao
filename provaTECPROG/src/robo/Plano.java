package robo;
import java.util.ArrayList;

public class Plano {
	
	int tamanhoX;
	int tamanhoY;
	public ArrayList <Celula> listaCelulas;
	
	public Plano (int tamanhoX, int tamanhoY) {
		this.tamanhoX = tamanhoX;
		this.tamanhoY = tamanhoY;
	}
	
	public void MontarPlano() {
		listaCelulas = new ArrayList<Celula>();
		
		int contador = 1;
		for (int i = 0; i <= this.tamanhoX; i++) {
			for (int j = 0; j <= this.tamanhoY; j++) {
				Celula celula = new Celula(contador, i, j);
				listaCelulas.add(celula);
				contador ++;
			}
		}
	}
	
	//public void verificarRobo() {
	//	for (int i = 0; i < listaCelulas.size(); i++) {
	//		Celula aux = listaCelulas.get(i);
	//		if (listaCelulas.get(i).elemento != null) {
	//			System.out.println("Robo: " + aux.elemento.nome + "(" + aux.posicaoX + "," + aux.posicaoY + ")");
	//	}
	//	}
	//}
	
	public Celula retornarCelula(int x, int y) {
		for (int i = 0; i < listaCelulas.size(); i++) {
			if (listaCelulas.get(i).posicaoX == x && listaCelulas.get(i).posicaoY == y) {
				return listaCelulas.get(i);
			}
		}
		return null;
	}
	
	public void retornarCelulas() {
		for (int i = 0; i < listaCelulas.size(); i++) {
			System.out.println(listaCelulas.get(i).infos());
		}
	}
}
