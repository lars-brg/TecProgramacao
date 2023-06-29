package imp.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Aluno implements ElementoJogo{
	private ImageIcon iconeAluno;
	public Aluno() {
		this.iconeAluno = new ImageIcon("imagens/stolas icon.png");
		iconeAluno.setImage(iconeAluno.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
	}

	@Override
	public char getTipo() {
		
		return 'A';
	}

	@Override
	public ImageIcon getIcone() {
		// TODO Auto-generated method stub
		return iconeAluno;
	}
	
	
}
