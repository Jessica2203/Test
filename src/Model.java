import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JList;
public class Model {
	//Attributs

	static Connection connexion = null;
	private static Statement st;
	private static ResultSet rs;
	
		//Connexion
		public static Connection connect(){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connexion = DriverManager.getConnection("jdbc:mysql://localhost/tpcine", "root", "");
				System.out.println("Connexion réussie");
				st = connexion.createStatement();
			} 
			catch(ClassNotFoundException erreur){
				System.out.println("Driver non chargé !" + erreur);
			}
			catch(SQLException erreur) {
				System.out.println("La connexion à la base de données a échoué ou Erreur SQL…" + erreur);
			}
			return connexion;
		}
		
		//Deconnexion
		public static void deconnect(){
			try{
				connexion.close();
			}
			catch(SQLException erreur){
				System.out.println("La connexion à la base de données a échoué ou Erreur SQL…" + erreur);
			}
		}
		//Affichages
		//Afficher les genres
		public static ArrayList<String> affGenre(){
			ArrayList<String> lesGenres = new ArrayList<String>();
			String sql = "SELECT libelleG FROM genre;";
			try{
				st = connexion.createStatement();
				rs = st.executeQuery(sql);
				
				while(rs.next()){
					System.out.println("Nom du genre : " + rs.getString("libelleG"));
					lesGenres.add(rs.getString(1));
				}
				rs.close();

			}
			catch(SQLException erreur){
				System.out.println("La connexion à la base de données a échoué ou Erreur SQL…" + erreur);
			}
			return lesGenres;
		}
		//Afficher les films
		public static ArrayList<String> affFilm(){
			ArrayList<String> lesFilms = new ArrayList<String>();
			String sql = "SELECT titreF, dureeF, nbPlaces, typeF FROM film;";
			try{
				st = connexion.createStatement();
				rs = st.executeQuery(sql);
				
				while(rs.next()){
					System.out.println("\nTitre du film : " + rs.getString("titreF"));
					lesFilms.add(rs.getString(2));
					System.out.println("Durée du film : " + rs.getInt("dureeF"));
					lesFilms.add(rs.getString(3));
					System.out.println("Nombre de places disponibles pour ce film : " + rs.getInt("nbPlaces"));
					lesFilms.add(rs.getString(4));
					System.out.println("Type de film (2D/3D) : ");
					if(rs.getInt("typeF") == 0){
						lesFilms.add("2D");
						System.out.print("2D");
					}
					else{
						lesFilms.add("3D");
						System.out.print("3D");
					}
					
				}
				rs.close();

			}
			catch(SQLException erreur){
				System.out.println("La connexion à la base de données a échoué ou Erreur SQL…" + erreur);
			}
			return lesFilms;
		}
		//Afficher les acteurs
		public static ArrayList<String> getActeur(){
			ArrayList<String> lesActeurs = new ArrayList<String>();
			String sql = "SELECT prenomA, nomA, dateNaiss FROM acteur;";
			try{
				st = connexion.createStatement();
				rs = st.executeQuery(sql);
				
				while(rs.next()){
					System.out.println("\nPrénom de l'acteur : " + rs.getString("prenomA"));
					lesActeurs.add(rs.getString(1));
					System.out.println("Nom de l'acteur : " + rs.getString("nomA"));
					lesActeurs.add(rs.getString(2));
					System.out.println("Date de  naissance de l'acteur : " + rs.getDate("dateNaiss"));
					lesActeurs.add(rs.getString(3));
				}
			}
			catch(SQLException erreur){
				System.out.println("La connexion à la base de données a échoué ou Erreur SQL…" + erreur);
			}
			return lesActeurs;
		}
		
		
				
		//Insertions
		//Inserer un acteur
		public static void insertActeur(String nom, String prenom, LocalDate dateNaiss){
			String sql = "INSERT INTO acteur(nomA, prenomA, dateNaiss) VALUES ('"+nom+"','"+prenom+"','"+dateNaiss+"');";
			try{
				//st = connexion.createStatement();
				st.executeUpdate(sql);
				System.out.println("Ligne ajoutée");
			}
			catch(SQLException erreur){
				System.out.println("La connexion à la base de données a échoué ou Erreur SQL…" + erreur);
			}
			
		}
		//Inserer un genre
		public static void insertGenre(String libelle){
			String sql = "INSERT INTO genre(libelleG) VALUES ('"+libelle+"');";
			
			try{

				st.executeUpdate(sql);
				System.out.println("Ligne ajoutée");

				
			}
			catch(SQLException erreur){
				System.out.println("La connexion à la base de données a échoué ou Erreur SQL…" + erreur);
			}
		}
		//Inserer un film
		public static void insertFilm(String titre, int duree, int nbPlace, boolean type1, boolean type2){
			String sql="";
			if(type1){
				sql = "INSERT INTO film(titreF, dureeF, nbPlaces, typeF) VALUES ('"+titre+"','"+duree+"','"+nbPlace+"','"+0+"');";
			}
			else{
				sql = "INSERT INTO film(titreF, dureeF, nbPlaces, typeF) VALUES ('"+titre+"','"+duree+"','"+nbPlace+"','"+1+"');";	
			}
			
			try{
				
				st.executeUpdate(sql);
				System.out.println("Ligne ajoutée");
				
			}
			catch(SQLException erreur){
				System.out.println("La connexion à la base de données a échoué ou Erreur SQL…" + erreur);
			}
		}
		
		//Suppression
		//Supprimer un acteur
		public static void suppActeur(String nom, String prenom, LocalDate dateNaiss){
			
			String sql = "DELETE FROM acteur WHERE nomA = '"+nom+"' AND prenomA = '"+prenom+"' AND dateNaiss = '"+dateNaiss+"';";
			
			try{
				int count = st.executeUpdate(sql);
				System.out.println("Il y a eu " + count + " Ligne(s) supprimée(s)");
				
			}
			catch(SQLException erreur){
				System.out.println("La connexion à la base de données a échoué ou Erreur SQL…" + erreur);
			}
			
		}
		
		//Supprimer un genre
		public static void suppGenre(String libelle){
			
			String sql = "DELETE FROM genre WHERE libelleG = '"+libelle+"';";
			try{
				int count = st.executeUpdate(sql);
				System.out.println("Il y a eu " + count + " Ligne(s) supprimée(s)");
			}
			catch(SQLException erreur){
				System.out.println("La connexion à la base de données a échoué ou Erreur SQL…" + erreur);
			}
		}
		//Supprimer un film
		public static void suppFilm(String titre, int duree, int nbPlace, boolean type1, boolean type2){
			String sql="";
			if(type1){
				sql = "DELETE FROM film WHERE titreF = '"+titre+"' AND dureeF = '"+duree+"' AND nbPlaces = '"+nbPlace+"' AND typeF = '"+0+"';";
			}
			else{
				sql = "DELETE FROM film WHERE titreF = '"+titre+"' AND dureeF = '"+duree+"' AND nbPlaces = '"+nbPlace+"' AND typeF = '"+1+"';";	
			}
			
			try{
				int count = st.executeUpdate(sql);
				System.out.println("Il y a eu " + count + " Ligne(s) supprimée(s)");
			}
			catch(SQLException erreur){
				System.out.println("La connexion à la base de données a échoué ou Erreur SQL…" + erreur);
			}
		}
		
			
}