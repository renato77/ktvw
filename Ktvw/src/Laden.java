import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Laden {
	public static ArrayList<Konto> arraylisteLaden(ArrayList<Konto> arrayListe2) throws FileNotFoundException, IOException, ClassNotFoundException{
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("datei.ser"))) {

			@SuppressWarnings("unchecked")
			ArrayList<Konto> arrayListe = (ArrayList<Konto>) in.readObject();
			return(arrayListe);
		}
	}
}