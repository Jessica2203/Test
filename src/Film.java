
public class Film {
	//Attributs

	private int idFilm;
	private String titreFilm;
	private int dureeFilm;
	private int nbPlaces;
	private String type;
	
	public Film(){
		
	}
	//Constructeur
	public Film(int unId, String unTitre, int uneDuree, String unType, int unePlace){
		this.idFilm = unId;
		this.titreFilm = unTitre;
		this.dureeFilm = uneDuree;
		this.type = unType;
		this.nbPlaces = unePlace;
	}
	
	public Film(int unId){
		this.idFilm = unId;
	}
	//Accesseurs
	public int getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(int unFilm) {
		this.idFilm = unFilm;
	}

	public String getTitreFilm() {
		return titreFilm;
	}

	public void setTitreFilm(String unTitreFilm) {
		this.titreFilm = unTitreFilm;
	}

	public int getDureeFilm() {
		return dureeFilm;
	}

	public void setDureeFilm(int uneDureeFilm) {
		this.dureeFilm = uneDureeFilm;
	}

	public String getType() {
		return type;
	}

	public void setType(String unType) {
		this.type = unType;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(int unNbPlaces) {
		this.nbPlaces = unNbPlaces;
	}
	
	public String toString(){
		return "Titre du film : " + this.titreFilm + " Duree du film : " + this.dureeFilm + " Type du film : " + this.type + " Nombres de place : " + this.nbPlaces;
	}


}
