package imp.model;

import javax.swing.ImageIcon;

public abstract class Robo {
	private int id;
	protected String nome;
	private Celula celulaLocalizada;
	private int pontos;
	protected ImageIcon icone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Celula getCelulaLocalizada() {
		return celulaLocalizada;
	}

	public void setCelulaLocalizada(Celula celulaLocalizada) {
		this.celulaLocalizada = celulaLocalizada;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public void ganharPontos() {
		pontos += 10;
	}

	public void perderPontos() {
		pontos -= 15;
	}

	public ImageIcon getIcone() {
		return icone;
	}

	public void setIcone(ImageIcon icone) {
		this.icone = icone;
	}

}
