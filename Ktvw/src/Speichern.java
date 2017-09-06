import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Speichern {
	
	public static void arraylisteSpeichern(ArrayList<Konto> arrayListe) throws FileNotFoundException, IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datei.ser"))) {
			out.writeObject(arrayListe);
			out.flush();
			System.out.println("Die Datenbank wurde gespeichert.");
		}
	}
}