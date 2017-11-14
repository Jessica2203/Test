import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelAccueil extends JPanel {
	//Attributs

	private JLabel msg;
	
	public PanelAccueil(){
		
		this.setLayout(new FlowLayout());
		this.setSize(400,300);
		this.setBackground(Color.magenta);
		msg = new JLabel("Bienvenue au cinéma !");
		this.add(msg);
	}

	

	

}
