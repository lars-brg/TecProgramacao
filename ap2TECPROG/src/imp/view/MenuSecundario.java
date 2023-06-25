package imp.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuSecundario extends JPanel {
	private static final long serialVersionUID = 1L;

	public MenuSecundario() {
		setLayout(new BorderLayout());

		JPanel menuSecundario = new JPanel();
		menuSecundario.setPreferredSize(new Dimension(250, 700));
		menuSecundario.setBackground(Color.pink);
		
		BotaoMenuSecundario botaoVertical = new BotaoMenuSecundario(); 
		
		ImageIcon abertura = new ImageIcon("C:\\Users\\abreu\\eclipse-workspace\\ap2TECPROG\\src\\ap2TECPROG\\img\\imp.png");
		abertura.setImage(abertura.getImage().getScaledInstance(250, 150, Image.SCALE_SMOOTH));
		JLabel logo = new JLabel(abertura);
		logo.setAlignmentX(CENTER_ALIGNMENT);

		ImageIcon andador = new ImageIcon(
				"C:\\Users\\abreu\\eclipse-workspace\\ap2TECPROG\\src\\ap2TECPROG\\img\\blitzo full.png");
		andador.setImage(andador.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		JLabel imagem1 = new JLabel(andador);

		ImageIcon cavalo = new ImageIcon(
				"C:\\Users\\abreu\\eclipse-workspace\\ap2TECPROG\\src\\ap2TECPROG\\img\\millie full.png");
		cavalo.setImage(cavalo.getImage().getScaledInstance(60, 100, Image.SCALE_SMOOTH));
		JLabel imagem2 = new JLabel(cavalo);

		ImageIcon bispo = new ImageIcon(
				"C:\\Users\\abreu\\eclipse-workspace\\ap2TECPROG\\src\\ap2TECPROG\\img\\moxxie full.png");
		bispo.setImage(bispo.getImage().getScaledInstance(50, 100, Image.SCALE_SMOOTH));
		JLabel imagem3 = new JLabel(bispo);

		ImageIcon iconeAndador = new ImageIcon(
				"C:\\Users\\abreu\\eclipse-workspace\\ap2TECPROG\\src\\ap2TECPROG\\img\\blitzo icon.png");
		iconeAndador.setImage(iconeAndador.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		Botao iconeA = new Botao("", Color.WHITE, iconeAndador);

		ImageIcon iconeCavalo = new ImageIcon(
				"C:\\Users\\abreu\\eclipse-workspace\\ap2TECPROG\\src\\ap2TECPROG\\img\\millie icon.png");
		iconeCavalo.setImage(iconeCavalo.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		Botao iconeC = new Botao("", Color.WHITE, iconeCavalo);

		ImageIcon iconeBispo = new ImageIcon(
				"C:\\Users\\abreu\\eclipse-workspace\\ap2TECPROG\\src\\ap2TECPROG\\img\\moxxie icon.png");
		iconeBispo.setImage(iconeBispo.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		Botao iconeB = new Botao("", Color.WHITE, iconeBispo);
		
		Botao verificar = new Botao("Verificar", Color.red, null);
		verificar.setSize(new Dimension(170, 100));
		verificar.setAlignmentX(CENTER_ALIGNMENT);
		//verificar.setLayout(BorderLayout.PAGE_END);
		Botao proxJogada = new Botao("Próxima Jogada", Color.red, null);
		proxJogada.setSize(new Dimension(170, 100));
		proxJogada.setAlignmentX(CENTER_ALIGNMENT);
		Botao sair = new Botao("Sair", Color.red, null);
		sair.setSize(new Dimension(190, 120));
		sair.setAlignmentX(CENTER_ALIGNMENT);
		
		menuSecundario.add(logo, BorderLayout.BEFORE_FIRST_LINE);

		menuSecundario.add(imagem1, BorderLayout.NORTH);
		menuSecundario.add(imagem2, BorderLayout.NORTH);
		menuSecundario.add(imagem3, BorderLayout.NORTH);
		
		menuSecundario.add(iconeA, BorderLayout.CENTER);
		menuSecundario.add(iconeB, BorderLayout.CENTER);
		menuSecundario.add(iconeC, BorderLayout.CENTER);
		
		botaoVertical.add(verificar, BorderLayout.PAGE_END);
		botaoVertical.add(proxJogada, BorderLayout.PAGE_END);
		botaoVertical.add(sair, BorderLayout.PAGE_END);
		
		menuSecundario.add(botaoVertical);
		add(menuSecundario);
	}
}
