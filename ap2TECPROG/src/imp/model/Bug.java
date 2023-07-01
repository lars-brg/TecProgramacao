package imp.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bug implements ElementoJogo{
	private ImageIcon iconeBug;
	public Bug() {
		this.iconeBug = new ImageIcon("imagens/striker icon.png");
		iconeBug.setImage(iconeBug.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
	}

	@Override
	public char getTipo() {
		
		return 'B';
	}

	@Override
	public ImageIcon getIcone() {
		// TODO Auto-generated method stub
		return iconeBug;
	}
}
