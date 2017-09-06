import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class alErstellen {

	
public void neuesKonto() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ArrayList<Konto> al = new ArrayList<Konto>();
		
		Konto k1 = new Konto((Konto.zaehler), "Erster, Hugo", 100);
		
		al.add(k1);
	
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datei.ser"))) {
			out.writeObject(al);
			out.flush();
		}
		System.out.println(Konto.zaehler);
}
}