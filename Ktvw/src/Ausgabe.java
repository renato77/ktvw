import java.util.ArrayList;

public class Ausgabe {
	public static void ausgeben(ArrayList<Konto> al){
		for (Konto n : al) {
			System.out.println(n.getKontoNummer() + "; " + n.getName() + "; " + n.getKontoStand());
		}
		System.out.println(al.get(0));
		
	//	if (al.get(0) instanceof Girokonto){
	//		System.out.println(getDispo());
	//	}

		for(Konto elem : al){
			if(elem instanceof Girokonto){
				System.out.println(((Girokonto) elem).getDispo()); 

			}
		}
	}


}