package m2.s07;

import static java.lang.Math.*;

public class Scope {
    private static int staticMember = 5;
    private long member = 5;

    public void f() {
        int local = 7;
        if (staticMember == 2) {
            // float local = 0.0F;
            short inner = 12;
            staticMember = 1 + inner;
            member = 3 + local;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        // i cannot be resolved to a variable
//        System.out.println(i);
    }

    public void g() {
        System.out.println(member);
    }

    public static void k() {
        System.out.println(staticMember);
    }

    public static void main(String[] args) {
        double local = 5;
        System.out.println(local);
        staticMember = 12;

        Scope.k();	// chiamo il metodo sulla classe

        Scope scope = new Scope();
        scope.f();
        scope.g();	// chiamo il metodo sull'oggetto
        abs(4);
        cos(12);
    }
}
