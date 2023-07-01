package imp.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Cavalo extends Robo{

	public Cavalo() {
		super();
		this.nome = "Cavalo";
		this.icone = new ImageIcon("imagens/moxxie icon.png");
		icone.setImage(icone.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
	}

}
