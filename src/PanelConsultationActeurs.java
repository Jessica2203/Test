import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class PanelConsultationActeurs extends JPanel implements ActionListener{
	//Attributs

	private JLabel lblMsg1;
	private JButton btnValider;
	
	public PanelConsultationActeurs(){
		
		 Object[][] data = {
			      {Model.getActeur()}
			    };
		 
		 String  title[] = {"Prénom", "Nom", "Date de naissance"};
		    JTable tableau = new JTable(data, title);
		
		this.setBackground(Color.green);
		lblMsg1 = new JLabel("Consultation des acteurs");
		this.add(lblMsg1);
		
		btnValider = new JButton("Consulter");
		btnValider.addActionListener(this);
		
		this.add(btnValider);
		this.add(new JScrollPane(tableau));
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnValider){
			Model.getActeur();
		}
	}

}
