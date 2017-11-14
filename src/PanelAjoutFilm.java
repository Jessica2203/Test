import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class PanelAjoutFilm extends JPanel implements ActionListener{
	//Attributs

	private JLabel lblMsg1;
	private JTextField jtfTitre;
	private JTextField jtfDuree;
	private JRadioButton jr2d;
	private JRadioButton jr3d;
	private ButtonGroup but;
	private JTextField jtfNbPlace;
	private JButton btnValider;
	
	public PanelAjoutFilm(){
		
		this.setLayout(new FlowLayout());
		this.setBackground(Color.cyan);
		lblMsg1 = new JLabel("Insertion d'un film");
		this.add(lblMsg1);
		
		jr2d = new JRadioButton("2D");
		jr3d = new JRadioButton("3D");
		but = new ButtonGroup();
		btnValider = new JButton("Ajouter");
		btnValider.addActionListener(this);
		
		but.add(jr2d);
		but.add(jr3d);
		
		jtfTitre = new JTextField("Titre");
		jtfDuree = new JTextField("Duree (en min)");
		jtfNbPlace = new JTextField("Nombre de places disponibles");
		jtfTitre.setPreferredSize(new Dimension(150, 30));
		jtfDuree.setPreferredSize(new Dimension(150, 30));
		jtfNbPlace.setPreferredSize(new Dimension(200, 30));
		
		this.add(jtfTitre);
		this.add(jtfDuree);
		this.add(jtfNbPlace);
		this.add(jr2d);
		this.add(jr3d);
		this.add(btnValider);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnValider){
			Model.insertFilm(jtfTitre.getText(),Integer.parseInt(jtfDuree.getText()),Integer.parseInt(jtfNbPlace.getText()),jr2d.isSelected(),jr3d.isSelected());
		}
		
	}

}

