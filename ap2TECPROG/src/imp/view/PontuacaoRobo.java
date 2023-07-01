package imp.view;

import java.awt.Image;

import javax.swing.ImageIcon;

public class PontuacaoRobo {
	private int pontuacaoRoboAndador;
	private int pontuacaoRoboBispo;
	private int pontuacaoRoboCavalo;
	private ImageIcon imagemAndador;
	private ImageIcon imagemBispo;
	private ImageIcon imagemCavalo;

	public PontuacaoRobo() {
		this.imagemAndador = new ImageIcon("imagens/blitzo full.png");
		imagemAndador.setImage(imagemAndador.getImage().getScaledInstance(60, 100, Image.SCALE_SMOOTH));
		this.imagemCavalo = new ImageIcon("imagens/millie full.png");
		imagemCavalo.setImage(imagemCavalo.getImage().getScaledInstance(60, 100, Image.SCALE_SMOOTH));
		this.imagemBispo = new ImageIcon("imagens/moxxie full.png");
		imagemBispo.setImage(imagemBispo.getImage().getScaledInstance(50, 100, Image.SCALE_SMOOTH));
	}

	public ImageIcon getImagemAndador() {
		return imagemAndador;
	}

	public ImageIcon getImagemBispo() {
		return imagemBispo;
	}

	public ImageIcon getImagemCavalo() {
		return imagemCavalo;
	}

	public int getPontuacaoRoboAndador() {
		return pontuacaoRoboAndador;
	}

	public int getPontuacaoRoboBispo() {
		return pontuacaoRoboBispo;
	}

	public int getPontuacaoRoboCavalo() {
		return pontuacaoRoboCavalo;
	}

	public void setPontuacaoRoboAndador(int pontuacaoRoboAndador) {
		this.pontuacaoRoboAndador = pontuacaoRoboAndador;
	}

	public void setPontuacaoRoboBispo(int pontuacaoRoboBispo) {
		this.pontuacaoRoboBispo = pontuacaoRoboBispo;
	}

	public void setPontuacaoRoboCavalo(int pontuacaoRoboCavalo) {
		this.pontuacaoRoboCavalo = pontuacaoRoboCavalo;
	}

}
