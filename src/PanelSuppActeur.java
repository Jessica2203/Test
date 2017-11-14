import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class PanelSuppActeur extends JPanel implements ActionListener{
	
	//Attributs

	private JLabel lblMsg1;
	private JTextField jtfNom;
	private JTextField jtfPrenom;
	private JTextField jtfDate;
	private JButton btnValider;
	
	public PanelSuppActeur(){
		
		this.setLayout(new FlowLayout());
		this.setBackground(Color.green);
		lblMsg1 = new JLabel("Suppression d'un acteur");
		this.add(lblMsg1);
		
		
		btnValider = new JButton("Supprimer");
		btnValider.addActionListener(this);
	
		jtfNom = new JTextField("Nom");
		jtfPrenom = new JTextField("Prénom");
		jtfDate = new JTextField("AAAA-MM-JJ");
		jtfNom.setPreferredSize(new Dimension(150, 30));
		jtfPrenom.setPreferredSize(new Dimension(150, 30));
		jtfDate.setPreferredSize(new Dimension(150, 30));
		
		this.add(jtfNom);
		this.add(jtfPrenom);
		this.add(jtfDate);
		this.add(btnValider);
	
	}

	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnValider){
			LocalDate localDate = LocalDate.parse(jtfDate.getText());
			Model.suppActeur(jtfNom.getText(), jtfPrenom.getText(), localDate);
		}
	}

}