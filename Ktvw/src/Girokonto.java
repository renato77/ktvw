import java.io.FileNotFoundException;
import java.io.IOException;

public class Girokonto extends Konto{

	private static final long serialVersionUID = 1L;

	//Klassenvariablen
	private String kontoTyp;
	private int zinssatz;
	private int dispo;
	private int zinssatzDispo;

	//Konstruktor
	public Girokonto(String kontoTyp2, int kontoNummer2, String name2, int kontoStand2, int zinssatz2, int dispo2, int zinssatzDispo2) throws FileNotFoundException, ClassNotFoundException, IOException {

		//Aufruf des Konstruktors der Superklasse Konto
		super(kontoNummer2, name2, kontoStand2);

		this.kontoTyp=kontoTyp2;
		this.zinssatz=zinssatz2;
		this.dispo=dispo2;
		this.zinssatzDispo=zinssatzDispo2;
	}

	
	 public String toString() {
		return "Name: "+ super.getName() + ". Kontotyp: " + kontoTyp + ". Zinssatz: " + zinssatz +
				". Dispohöhe: " + dispo + ". Zinssatz des Dispos: " + zinssatzDispo + ".";
	}
	 

	//Getter und Setter
	public String getKontoTyp() {
		return kontoTyp;
	}
	public void setKontoTyp(String kontoTyp) {
		this.kontoTyp = kontoTyp;
	}
	public int getZinssatz() {
		return zinssatz;
	}
	public void setZinssatz(int zinssatz) {
		this.zinssatz = zinssatz;
	}
	public int getDispo() {
		return dispo;
	}
	public void setDispo(int dispo) {
		this.dispo = dispo;
	}
	public int getZinssatzDispo() {
		return zinssatzDispo;
	}
	public void setZinssatzDispo(int zinssatzDispo) {
		this.zinssatzDispo = zinssatzDispo;
	}
}
