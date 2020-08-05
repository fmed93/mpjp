package m1ex;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S06Test {

	 @Test
	void isPrimeEven() {
		boolean actual = S06.isPrime(24);
		
		assertThat(actual, is(false));
	}

    @Test
    void isPrimePrime() {
		boolean actual = S06.isPrime(37);
		
		assertThat(actual, is(true));
    }
    
    @Test
    void isPrimeTricky() {
		boolean actual = S06.isPrime(1369);
		
		assertThat(actual, is(false));
    }
    
    @Test
    void isPrimeNegative() {
		boolean actual = S06.isPrime(-2);
		
		assertThat(actual, is(false));
    }
    
    @Test
    void isArmstrongStringNegative() {
		boolean actual = S06.isArmstrongString(-2);
		
		assertThat(actual, is(false));
    }
    
    @Test
    void isArmstrongStringTrueOne() {
		boolean actual = S06.isArmstrongString(153);
		
		assertThat(actual, is(true));
    }
    
    @Test
    void isArmstrongStringTrueTwo() {
		boolean actual = S06.isArmstrongString(54748);
		
		assertThat(actual, is(true));
    }
    
    @Test
    void isArmstrongStringFalse() {
		boolean actual = S06.isArmstrongString(54747);
		
		assertThat(actual, is(false));
    }
    
    @Test
    void isArmstrongFalse() {
		boolean actual = S06.isArmstrong(54747);
		
		assertThat(actual, is(false));
    }
    
    @Test
    void isArmstrongTrueOne() {
		boolean actual = S06.isArmstrong(153);
		
		assertThat(actual, is(true));
    }
    
    @Test
    void isArmstrongTrueTwo() {
		boolean actual = S06.isArmstrong(54748);
		
		assertThat(actual, is(true));
    }
    
    @Test
    void isArmstrongNegative() {
		boolean actual = S06.isArmstrong(-5);
		
		assertThat(actual, is(false));
    }
    
    @Test
    void hammingDistancePlain() {
		int actual = S06.hammingDistance("Pippo","Pluto");
		
		assertThat(actual, is(3));
    }
    
    @Test
    void hammingDistanceInconsistent() {
		int actual = S06.hammingDistance("Pippo","Pippo ");
		
		assertThat(actual, is(Integer.MIN_VALUE));
    }
    
    
}