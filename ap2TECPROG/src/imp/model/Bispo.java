package imp.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bispo extends Robo {

	public Bispo() {
		super();
		this.nome = "Bispo";
		this.icone = new ImageIcon("imagens/millie icon.png");
		icone.setImage(icone.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
	}

}
