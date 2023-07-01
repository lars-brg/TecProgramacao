package imp.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Andador extends Robo {
	private ImageIcon iconeAndador;

	public Andador() {
		super();
		this.nome = "Andador";
		this.icone = new ImageIcon("imagens/blitzo icon.png");
		icone.setImage(icone.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));

	}

	public ImageIcon getIconeAndador() {
		return iconeAndador;
	}
	
}
