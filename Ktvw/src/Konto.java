import java.io.FileNotFoundException;
import java.io.IOException;

public class Konto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	// globale Zählvariable
	public static int zaehler = 0;
	
	// Klassenvariablen
	private int kontoNummer;
	private String name;
	private int kontoStand;

	//Konstruktor
	public Konto(int kontoNummer, String name, int kontoStand) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		zaehler++;
		
		this.kontoNummer = kontoNummer;
		this.name = name;
		this.kontoStand = kontoStand;
	}
	
	//Getter und Setter
	 public void setName(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setKontoStand(int kontoStand) {
		this.kontoStand = kontoStand;
	}

	public int getKontoStand() {
		return kontoStand;
	}
	
	public void setKontoNummer(int kontoNummer) {
		this.kontoNummer = kontoNummer;
	}
	
	public int getKontoNummer() {
		return kontoNummer;
	}

	
}