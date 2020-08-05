package m1.s11;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        
        int value = 496;
        
        boolean result = false;
		if ((value>0)&&(value%2 == 0)) {
			int i = 1;
			int sum = 1;
			while (i < Math.ceil(Math.sqrt(value))) {
				i += 1;
				if (value%i == 0) {
					sum += (i + (value/i));
				}
			}
			if (sum == value) {
				result = true;
			}
		}
		
		System.out.println(result);
        String s = new String ("ciao");
		int l = s.length();
		
		//	for (int i=0; i<(l/2); i++) {
		//		c=
		//		s.replace(s.charAt(i),s.charAt(l-i));
		//	}
		//	return "";
		
		
        
        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1

//        System.out.println(a / 0); // ArithmeticException

        double c = 3.0;

        System.out.println(a + c); // 13.0
        System.out.println(a / c); // 3.3333333333333335
        System.out.println(a % c); // 1.0

        System.out.println(c - 2.1); // 0.8999999999999999
        System.out.println(c / 0); // Infinity
    }
}
