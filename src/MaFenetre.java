import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class MaFenetre extends JFrame implements ActionListener{
	//Attributs

	private JMenuBar menuBar;
	
	private JMenu menuConsultation;
	private JMenu menuInsertion;
	private JMenu menuSuppr;
	
	private JMenuItem itemFilms;
	private JMenuItem itemActeurs;
	private JMenuItem itemGenre;
	private JMenuItem itemQuitter;
	
	private JMenuItem itemAjoutFilms;
	private JMenuItem itemAjoutActeurs;
	private JMenuItem itemAjoutGenre;
	
	private JMenuItem itemSuppFilms;
	private JMenuItem itemSuppActeurs;
	private JMenuItem itemSuppGenre;
	
	
	public MaFenetre(){
		
		this.setSize(400,300);
		
		menuBar  = new JMenuBar();
		
		menuConsultation  = new JMenu("Consultations");
		menuInsertion  = new JMenu("Insertion");
		menuSuppr = new JMenu("Suppression");
		
		
		itemFilms  = new JMenuItem("Films");
		itemActeurs = new JMenuItem("Acteurs");
		itemGenre = new JMenuItem("Genre");
		itemQuitter = new JMenuItem("Quitter");
		
		itemAjoutFilms  = new JMenuItem("Films");
		itemAjoutActeurs = new JMenuItem("Acteurs");
		itemAjoutGenre = new JMenuItem("Genre");
		
		itemSuppFilms = new JMenuItem("Films");
		itemSuppActeurs = new JMenuItem("Acteurs");
		itemSuppGenre = new JMenuItem("Genre");
        
        itemFilms.addActionListener(this);
        itemActeurs.addActionListener(this);
        itemGenre.addActionListener(this);
		itemQuitter.addActionListener(this);
		
		itemAjoutFilms.addActionListener(this);
        itemAjoutActeurs.addActionListener(this);
        itemAjoutGenre.addActionListener(this);
        
        itemSuppFilms.addActionListener(this);
        itemSuppActeurs.addActionListener(this);
        itemSuppGenre.addActionListener(this);
		
		menuConsultation.add(itemFilms);
		menuConsultation.add(itemActeurs);
		menuConsultation.add(itemGenre);
		
		menuInsertion.add(itemAjoutFilms);
		menuInsertion.add(itemAjoutActeurs);
		menuInsertion.add(itemAjoutGenre);
		
		menuSuppr.add(itemSuppFilms);
		menuSuppr.add(itemSuppActeurs);
		menuSuppr.add(itemSuppGenre);

		menuBar.add(menuConsultation);
		menuBar.add(menuInsertion);
		menuBar.add(menuSuppr);
		menuBar.add(itemQuitter);
		
		setJMenuBar(menuBar);
		
		PanelAccueil panelAccueil = new PanelAccueil();
		this.getContentPane().add(panelAccueil);	
		
		this.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == itemFilms){
			
			PanelConsultationFilms monPanelFilm = new PanelConsultationFilms();
			
			this.setContentPane(monPanelFilm);
			
			this.getContentPane().revalidate();
			
		}
		
		if(e.getSource() == itemActeurs){
			
			
			PanelConsultationActeurs monPanelActeur = new PanelConsultationActeurs();
			
			this.setContentPane(monPanelActeur);
			
			this.getContentPane().revalidate();
			
		}
		
		if(e.getSource() == itemGenre){
			
			PanelConsultationGenre monPanelGenre = new PanelConsultationGenre();
			
			this.setContentPane(monPanelGenre);
			
			this.getContentPane().revalidate();
			
		}
		
		if(e.getSource() == itemAjoutActeurs){
			
			PanelAjoutActeur monPanelAjoutActeur = new PanelAjoutActeur();
			
			this.setContentPane(monPanelAjoutActeur);
			
			this.getContentPane().revalidate();
			
		}
		
		if(e.getSource() == itemAjoutGenre){
			
			PanelAjoutGenre monPanelAjoutGenre = new PanelAjoutGenre();
			
			this.setContentPane(monPanelAjoutGenre);
			
			this.getContentPane().revalidate();
			
		}
		
		if(e.getSource() == itemAjoutFilms){
			
			PanelAjoutFilm monPanelAjoutFilm = new PanelAjoutFilm();
			
			this.setContentPane(monPanelAjoutFilm);
			
			this.getContentPane().revalidate();
			
		}
		
		if(e.getSource() == itemSuppGenre){
			
			PanelSuppGenre monPanelSuppGenre = new PanelSuppGenre();
			
			this.setContentPane(monPanelSuppGenre);
			
			this.getContentPane().revalidate();
			
		}

		if(e.getSource() == itemSuppActeurs){
	
			PanelSuppActeur monPanelSuppActeur = new PanelSuppActeur();
	
			this.setContentPane(monPanelSuppActeur);
	
			this.getContentPane().revalidate();
	
		}
		
		if(e.getSource() == itemSuppFilms){
			
			PanelSuppFilm monPanelSuppFilm = new PanelSuppFilm();
		
			this.setContentPane(monPanelSuppFilm);
		
			this.getContentPane().revalidate();
		
		}
		
		
		if(e.getSource() == itemQuitter){
			//dispose();
			System.exit(0);
		}
	}


	
	
	

}
