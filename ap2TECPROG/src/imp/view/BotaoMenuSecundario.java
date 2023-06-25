package imp.view;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class BotaoMenuSecundario extends JPanel{

	public BotaoMenuSecundario() {
		setBackground(null);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setAlignmentX(JPanel.CENTER_ALIGNMENT);
	}
	
}
