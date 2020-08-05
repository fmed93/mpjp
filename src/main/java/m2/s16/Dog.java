package m2.s16;

public class Dog extends Mammal {	// il mio cane E' un mammifero,
    private Tail tail;				// che HA una coda
    private int weight; 			// e HA un peso

    public Dog(int gestationDays, int tailLen) {
        super(gestationDays);
        this.tail = new Tail(tailLen);
    }

    @Override
    public String toString() {
        return "Dog [tail=" + tail + ", gestation=" + gestation + "]";
    }

    public void wag() {
        tail.wag();
    }
}
