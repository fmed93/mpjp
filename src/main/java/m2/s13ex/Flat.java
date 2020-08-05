package m2.s13ex;

public class Flat implements Conditioning {

	@Override
	public void setTemperature(int newTemp) {
		System.out.println("Flat temperature now is " + newTemp);
	}

}
