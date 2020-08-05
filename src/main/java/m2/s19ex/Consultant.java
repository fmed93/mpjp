package m2.s19ex;

public class Consultant extends Person {
    private int daily;

    public Consultant(String firstName, String lastName, int daily) {
        super(firstName, lastName);
        this.daily = daily;
    }

    public int getDaily() {
    	System.out.println("getDaily() called for " + super.getFirstName());
        return daily;
    }
    
    public String getFirstName() {
    	return "Consultant " + super.getFirstName();
    }
    
    @Override
    public String toString() {
        return "Consultant " + super.toString() + ": daily bill is " + daily;
    }
}
