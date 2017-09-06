import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DbSpeichern {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		
		ArrayList<Konto> al = new ArrayList<Konto>();
		
		Konto k1 = new Konto((Konto.zaehler), "Meier, Hugo", 300);
		Konto k2 = new Konto((Konto.zaehler), "Schmitz, Otto", 500);

		al.add(k1);
		al.add(k2);

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datei.ser"))) {
			out.writeObject(al);
			out.flush();
		}
		System.out.println(Konto.zaehler);
	}

}
