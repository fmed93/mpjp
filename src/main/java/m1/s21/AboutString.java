package m1.s21;

public class AboutString {
    
    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String t1 = "hello";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1));

        System.out.println("s < t: " + s.compareTo(t));
        System.out.println("s < t1: " + s.compareTo(t1));
        System.out.println("t > s: " + t.compareTo(s));

        System.out.println("concat s and t: " + s.concat(t));

        System.out.println("t contains u? " + t.contains(u));  //l'argomento del .contains() deve essere una stringa, non un singolo char!

        String u2 = t.substring(1, 3);   //intervallo chiuso a sx e aperto a dx -> il char in pos 3 è escluso!
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3));   //può essere chiamata anche con un solo parametro: in questo caso parte dall'indice indicato dal parametro e va fino in fondo

        System.out.println("u equals u2? " + u.equals(u2));  //questa funziona, ottengo true se le due stringhe sono uguali
        System.out.println("u == u2? " + (u == u2));   //questa non funziona, perché lui si chiede se sono in realtà lo stesso oggetto... e chiaramente non lo sono: il loro REFERENCE è diverso!

        System.out.println("First index of 'l' is s: " + s.indexOf('l'));
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));
        System.out.println("there is no 'x' in s: " + s.indexOf('x'));
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty());
        // String x = new String("");
        // x.isEmpty();

        System.out.println("s length: " + s.length());  //N.B: per gli array .lenght è una PROPRIETA', che può essere solo letta. Per le String è un METODO, quindi vuole una coppia di parentesi tonde!

        String s2 = s.replace('l', 'q');
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);  //TUTTE le appearance dell'old-char sono rimpiazzate con il new-char. 
        																   //N.B: la stringa è immutabile, quindi non è che questo comando la modifica, ne crea una nuova dove gli old char sono rimpiazzati dai new char.
        String[] splits = "one for me, one for you".split(" ");  //ottengo come risultato un array di stringhe, separate dove c'era uno spazio nella stringa di partenza
        System.out.println("Splitting: ");						 //utile ad esempio per separare tutti i campi di un file .csv, mettendo come carattere di split la virgola
        for (String token : splits) {
            System.out.println(token);
        }
        String joined = String.join("_", splits);
//        String joined = String.join(" ", "a", "b", "c");
        System.out.println("Joining back [" + joined + "]");

        String myS = s.toUpperCase();	  //ancora una volta, crea una NUOVA stringa
        System.out.println("upper: " + myS);
        System.out.println("lower: " + "SHUT UP!".toLowerCase());

        System.out.println("trim [" + " la la la ".trim() + "]");  //taglia gli spazi bianchi prima e dopo

        String x = null;
        //System.out.println(x.toString());  -> EXCEPTION!!
        //String x = "null";
        System.out.println("Sort of safe toString(): " + String.valueOf(x));  //il problema è se la stringa è "null". A quel punto non capisco più se mi stampa "null" come risultato o perché è il reale contenuto della stringa...
    }
}
