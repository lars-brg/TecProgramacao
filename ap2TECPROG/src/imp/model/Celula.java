package imp.model;

import java.util.ArrayList;
import javax.swing.JButton;

public class Celula {
	ArrayList<ElementoJogo> listaElementos;
	private JButton botao;
	private int id;

	public Celula(int id) {
		// super();
		this.listaElementos = listaElementos;
		botao = new JButton();
		this.id = id;
		
	}

	public ArrayList<ElementoJogo> getListaElementos() {
		return listaElementos;
	}

	public JButton getBotao() {
		return botao;
	}

	public int getId() {
		return id;
	}

}
