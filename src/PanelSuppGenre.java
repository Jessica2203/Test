import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class PanelSuppGenre extends JPanel implements ActionListener{
	
	//Attributs
	private JLabel lblMsg1;
	private JTextField jtfLibelle;
	private JButton btnValider;
	
	public PanelSuppGenre(){
		
		this.setLayout(new FlowLayout());
		this.setBackground(Color.pink);
		lblMsg1 = new JLabel("Suppression d'un genre");
		this.add(lblMsg1);
		
		btnValider = new JButton("Supprimer");
		btnValider.addActionListener(this);
		
		jtfLibelle = new JTextField("Libellé");
		jtfLibelle.setPreferredSize(new Dimension(150, 30));
		
		this.add(jtfLibelle);
		this.add(btnValider);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnValider){
			Model.suppGenre(jtfLibelle.getText());
		}
		
	}

}
