package robo;

public class Celula {
	
	public int posicaoX;
	public int posicaoY;
	public int id;
	public ElementosJogo elemento;
	
	public Celula(int id, int x, int y) {
		
		posicaoX = x;
		posicaoY = y;
		this.id = id;
		elemento = null;
		
	}
	
	public void OcuparCom(ElementosJogo elemento) {
		this.elemento = elemento;
	}
	
	public String infos() {
		return "Celula: " + id + " x: " + posicaoX + " y: " + posicaoY;
	}
}
