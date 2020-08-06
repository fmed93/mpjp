package m4.s02;

public class Mistake {
	private int x = 12;
	
	public class Other {
		public void fx() {
			// a meno che non voglia farlo apposta.
			// E il vantaggio è che questa classe può accedere alla parte anche privata
			// della classe in cui è contenuta
			x = 5;
		}
	}
	
	public static void main(String[] args) {
		Mistake xyz = new Mistake();
		System.out.println(xyz.x);
	}

	public void f(Mistake mst) {
		// e' un po' un rilassamento delle regole.. in teoria non sarebbe corretto, ma è
		// molto comodo (essenziale per i metodi "clone", che permettono di clonare un
		// oggetto, ad esempio
		mst.x = 5;
	}

	public void g() {
		Other other = new Other();
		other.fx();
	}

// ...
// Magari la formattazione non mi aiuta a capirlo, ma...

// ERRORE!! E' quella che si chiama NESTED CLASS
// e' un errore
/*
 * public class Other { public void fx() { // a meno che non voglia farlo
 * apposta. // E il vantaggio è che questa classe può accedere alla parte anche
 * privata // della classe in cui è contenuta x = 5; }
 */
}

class Package {
	public static void main(String[] args) {
		// Non posso accedere ai data member privati di un'altra classe
		// System.out.println(Mistake.x);
		
		Mistake.Other mo;
	}
}