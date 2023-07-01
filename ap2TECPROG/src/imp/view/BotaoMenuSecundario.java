package imp.view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class BotaoMenuSecundario extends JPanel {
	private Botao verificar;
	private Botao proxJogada;
	private Botao sair;

	public BotaoMenuSecundario() {
		setBackground(null);
		setPreferredSize(new Dimension(250, 200));
		setAlignmentX(JPanel.CENTER_ALIGNMENT);
		setAlignmentY(JPanel.BOTTOM_ALIGNMENT);

		this.verificar = new Botao("Verificar", new Color(249, 32, 52), null);
		verificar.setPreferredSize(new Dimension(200, 50));
		this.proxJogada = new Botao("Próxima Jogada", new Color(249, 32, 52), null);
		proxJogada.setPreferredSize(new Dimension(200, 50));
		this.sair = new Botao("Sair", new Color(249, 32, 52), null);
		sair.setPreferredSize(new Dimension(200, 50));

		add(verificar);
		add(proxJogada);
		add(sair);
	}

	public Botao getVerificar() {
		return verificar;
	}

	public void setVerificar(Botao verificar) {
		this.verificar = verificar;
	}

	public Botao getProxJogada() {
		return proxJogada;
	}

	public void setProxJogada(Botao proxJogada) {
		this.proxJogada = proxJogada;
	}

	public Botao getSair() {
		return sair;
	}

	public void setSair(Botao sair) {
		this.sair = sair;
	}

}
