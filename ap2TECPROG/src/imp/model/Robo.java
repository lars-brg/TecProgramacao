package imp.model;

import javax.swing.ImageIcon;

public abstract class Robo {
	private int posicaoX = 1;
	private int posicaoY = 1;
	private Celula celulaLocalizada;
	private ImageIcon icone;

	public Robo(int posicaoX, int posicaoY, Celula celulaLocalizada, ImageIcon icone) {
		super();
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.celulaLocalizada = celulaLocalizada;
		this.icone = icone;
	}

}
