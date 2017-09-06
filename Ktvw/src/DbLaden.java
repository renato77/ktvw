import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DbLaden {

	public static void main(String[] args) throws Exception {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("db.ser"))) {
			@SuppressWarnings("unchecked")
			ArrayList<Konto> db = (ArrayList<Konto>) in.readObject();
			
			Konto k3 = new Konto(((db.size()+1)), "Müller, Uwe", 800);
			db.add(k3);
			for (Konto n : db) {
				System.out.println(n.getKontoNummer() + "; " + n.getName() + "; " + n.getKontoStand());
			}
		}
	}
}
