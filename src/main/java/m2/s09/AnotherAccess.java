package m2.s09;

import m2.s10.Access;

public class AnotherAccess extends Access {
	public void f() {
		System.out.println(b);
		// System.out.println(a);
	}
	
	public static void g() {
		System.out.println();
	}
}
