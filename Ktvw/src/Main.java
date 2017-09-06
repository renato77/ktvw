import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{

		File file = new File("datei.ser");

		if (file.exists()) {
			System.out.println("Die Datenbank wurde gefunden.");
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("datei.ser"))) {

				@SuppressWarnings("unchecked")
				ArrayList<Konto> al = (ArrayList<Konto>) in.readObject();

				if (al.size()==1){
					System.out.println(al.size() + " Eintrag wurde geladen.");
				}

				else {
					System.out.println(al.size() + " Einträge wurden geladen.");
				}
				Konto.zaehler = al.size();
				Hinzufuegen.kontoHinzu(al);
				Speichern.arraylisteSpeichern(al);

				Ausgabe.ausgeben(al);
				
			}
		}

		else {
			ArrayList<Konto> al = new ArrayList<Konto>();
			System.out.println("Eine Datenbank wurde angelegt.");
			Speichern.arraylisteSpeichern(al);
		}

		// Auswahl-Menü
		// Kunden-Optionen
		// Kunden anlegen
		// Kunde anzeigen
		// Konto anlegen
		// Kunde löschen
		// Konto löschen

	}	
}