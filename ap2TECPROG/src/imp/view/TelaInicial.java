package imp.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class TelaInicial extends JPanel {
	public TelaInicial() {
		setSize(900, 670);
		setBorder(BorderFactory.createEmptyBorder(-5, 0, 0, 0));
		ImageIcon telaInicio = new ImageIcon("imagens/TelaInicial.jpg");
		telaInicio.setImage(telaInicio.getImage().getScaledInstance(900, 670, Image.SCALE_SMOOTH));
		JLabel telaInicial = new JLabel(telaInicio);
		telaInicial.setSize(900, 670);
		
		
		
		add(telaInicial);
	}
}
