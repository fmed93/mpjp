package m2.s17;

public class Main {
	public static void main(String[] args) {
		Poodle poodle = new Poodle("Jim");
		Poodle p2 = new Poodle();
		
		System.out.println(p2.getName());

		System.out.println(poodle);
		System.out.println(p2);
		
		Labrador tom = new Labrador("Tom");
		System.out.println(tom.getName());
	}
}
