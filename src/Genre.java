
public class Genre {
	//Attributs

	private String codeGenre;
	private String libelle;
	
	public Genre(){
		
	}
	//Constructeur
	public Genre(String unCode, String unLib){
		this.codeGenre = unCode;
		this.libelle = unLib;
	}
	//Accesseurs
	public String getCode(){
		return codeGenre;
	}
	
	public void setCode(String unCode){
		this.codeGenre = unCode;
	}
	
	public String getLib(){
		return libelle;
	}
	
	public void setLib(String unLib){
		this.libelle = unLib;
	}
	
	public String toString(){
		return "Le code : " + this.codeGenre + "Le libellé : " + this.libelle;
	}
}
