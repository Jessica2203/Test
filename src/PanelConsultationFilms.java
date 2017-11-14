import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PanelConsultationFilms extends JPanel implements ActionListener{
	//Attributs

	private JLabel lblMsg1;
	private JButton btnValider;

	public PanelConsultationFilms(){
		
		this.setBackground(Color.cyan);
		lblMsg1 = new JLabel("Consultation des films");
		this.add(lblMsg1);
		
		btnValider = new JButton("Consulter");
		btnValider.addActionListener(this);
		
		this.add(btnValider);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnValider){
			Model.affFilm();
		}
	}
	

}
