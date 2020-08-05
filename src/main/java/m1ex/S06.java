package m1ex;

public class S06 {

	/**
	 * States whether an integer number is "PRIME" or not
	 * 
	 * @param value
	 * @return true (if value is prime) or false (if it's not or if it's negative or zero)
	 */
	public static boolean isPrime(int value) {
		boolean result = true;
		if ((value<=0)||(value%2 == 0)) {
			result = false;
		} else {
			int i = 1;
			while ((i < Math.ceil(Math.sqrt(value)))&&(result == true)) {
				i += 2;
				if (value%i == 0) {
					result = false;
				}
			}
		}
		return result;
	}
	
	
	/**
	 * States whether an integer number is an "ARMSTRONG" number or not (https://it.wikipedia.org/wiki/Numero_di_Armstrong)
	 * 
	 * @param value
	 * @return true (if value is prime) or false (if it's not or if it's negative)
	 */
	public static boolean isArmstrongString(int value) {
		boolean result = false;
		if (value<0) {
			return result;
		} else if (value<10) {
			result = true;
			return result;
		} else {
			String str = Integer.toString(value);
			int l = str.length();
			double sum = 0;
			for (int i = 0; i < l; i++) {
				char character = str.charAt(i);
				int cifra = Character.getNumericValue(character);
				sum += Math.pow(cifra, l);
			}
			if (Math.round(sum) == value) {
				result = true;
			}
			return result;
		}
	}
	
	
	/**
	 * States whether an integer number is an "ARMSTRONG" number or not (https://it.wikipedia.org/wiki/Numero_di_Armstrong)
	 * 
	 * @param value
	 * @return true (if value is prime) or false (if it's not or if it's negative)
	 */
	public static boolean isArmstrong(int value) {
		boolean result = false;
		if (value<0) {
			return result;
		} else if (value<10) {
			result = true;
			return result;
		} else {
			int div = value;
			int count = 0;
			double sum = 0;
			while (div > 0) {
				count++;
				div /= 10;
			}
			div = value;
			while (div>0) {
				sum += Math.pow(div%10, count);
				div /= 10;
			}
			if (Math.round(sum) == value) {
				result = true;
			}
			return result;
		}
	}
	
	/**
	 * States if a string is a "pangram" or not (if it contains all the letters in the alphabet) 
	 * 
	 * @param s
	 * @return true (if the string contains all the letters in the alphabet) or false, otherwise
	 */
	private static boolean isPangram(String s) {
		char [] stringa = s.toCharArray();
		int length = stringa.length;
		int max = -1;
		int res = 0;
	/*	for (int i = 0; i < array.length; i++) { // find the maximum value
			if (array[i] > max) {
				max = array[i];
			}
		}
		int[] arrayCounter = new int[max + 1]; // create an array of length maximum
		for (int i = 0; i < array.length; i++) { // Add 1 to new array in the index of the integer found
			arrayCounter[array[i]]++;
		}
		for (int i = 0; i < arrayCounter.length; i++) { // The single value is where the is a 1, the value is the index
														// itself
			if (arrayCounter[i] == 1) {
				res = i;
				break;
			}
		}*/
		return true;
	}
	
	
	/**
	 * Returns the Hamming distance between two strings
	 * 
	 * @param value
	 * @return //TODO
	 */
	public static int hammingDistance(String s1, String s2) {
		int d = 0;
		if (s1.length() != s2.length()) {
			return Integer.MIN_VALUE;
		} else {
			for (int i = 0; i < s1.length()-1; i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					d++;
				}
			}
			return d;
		}
	}
	
	
}
