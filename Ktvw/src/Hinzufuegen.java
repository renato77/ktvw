import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Hinzufuegen {
	public static void kontoHinzu(ArrayList<Konto> al) throws FileNotFoundException, ClassNotFoundException, IOException{
		Girokonto g = new Girokonto("G", (Konto.zaehler), "Zweiter, Udo", 200,1,1000,17);
		al.add(g);
		Festgeldkonto f = new Festgeldkonto("F", (Konto.zaehler), "Dritter, Hans", 1000, 3, 1, 000123);
		al.add(f);
		System.out.println(f);
	}
}
