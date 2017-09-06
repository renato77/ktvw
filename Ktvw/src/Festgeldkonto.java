import java.io.FileNotFoundException;
import java.io.IOException;

public class Festgeldkonto extends Konto{

	private static final long serialVersionUID = 1L;
	
	//Klassenvariablen
	private String kontoTyp;
	private int zinssatz;
	private int laufzeit;
	private int kennungSteuer;
	
	//Konstruktor
	public Festgeldkonto(String kontoTyp, int kontoNummer, String name, int kontoStand, int zinssatz, int laufzeit, int kennungSteuer) throws FileNotFoundException, ClassNotFoundException, IOException {

		//Aufruf des Konstruktors der Superklasse Konto
		super(kontoNummer, name, kontoStand);
		
		this.kontoTyp=kontoTyp;
		this.zinssatz=zinssatz;
		this.laufzeit=laufzeit;
		this.kennungSteuer=kennungSteuer;
	}

	//Getter und Setter
	public int getZinssatz() {
		return zinssatz;
	}
	public void setZinssatz(int zinssatz) {
		this.zinssatz = zinssatz;
	}

	public int getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(int laufzeit) {
		this.laufzeit = laufzeit;
	}

	public int getKennungSteuer() {
		return kennungSteuer;
	}

	public void setKennungSteuer(int kennungSteuer) {
		this.kennungSteuer = kennungSteuer;
	}
	public String getKontoTyp() {
		return kontoTyp;
	}
	public void setKontoTyp(String kontoTyp) {
		this.kontoTyp = kontoTyp;
	}
}