package imp.model;

import javax.swing.ImageIcon;

public interface ElementoJogo {
	int posicaoX = 1;
	int posicaoY = 1;
	
	public char getTipo();
	public ImageIcon getIcone();
}
