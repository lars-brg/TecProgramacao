package imp.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class BotaoMenuSecundario extends JPanel{
	public BotaoMenuSecundario() {
		setBackground(null);
		//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setPreferredSize(new Dimension(250, 200));
		setAlignmentX(JPanel.CENTER_ALIGNMENT);
		setAlignmentY(JPanel.BOTTOM_ALIGNMENT);
	}
	
}
