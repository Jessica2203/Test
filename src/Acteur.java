import java.time.LocalDate;


public class Acteur {
	//Attributs

	private int idAct;
	private String nomAct;
	private String prenomAct;
	private String dateNaiss;
	private Film idF;
	
	public Acteur(){
		
	}
	//Constructeur
	public Acteur(int unId, String unNom, String unPrenom, String uneDate, Film idF){
		this.idAct = unId;
		this.nomAct = unNom;
		this.prenomAct = unPrenom;
		this.dateNaiss = uneDate;
		this.idF = idF;
	}
	//Accesseurs
	public int getIdAct() {
		return idAct;
	}

	public void setIdAct(int unIdAct) {
		this.idAct = unIdAct;
	}

	public String getNomAct() {
		return nomAct;
	}

	public void setNomAct(String unNomAct) {
		this.nomAct = unNomAct;
	}

	public String getPrenomAct() {
		return prenomAct;
	}

	public void setPrenomAct(String unPrenomAct) {
		this.prenomAct = unPrenomAct;
	}

	public String getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(String uneDateNaiss) {
		this.dateNaiss = uneDateNaiss;
	}
	
	
	public String toString(){
		return "Nom de l'acteur : "  + this.nomAct + " Prénom de l'acteur : " + this.prenomAct + " Date de naisscance : " + this.dateNaiss;
	}
	

}
