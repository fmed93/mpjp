package m2.s17;

public class Poodle extends Dog {
	private static final int DEFAULT_DENSITY = 3;
	private int curlDensity;
	
	public Poodle() {
		super();
		this.curlDensity = DEFAULT_DENSITY;
	}

	public Poodle(String name) {
		super(name);
	}

	public Poodle(String name, int weight, int curlDensity) {
		super(name, weight);	// N.B: questa è una notazione "costruttore"
		this.curlDensity = curlDensity;		// questa no
	}
	
	public Poodle(String name, int weight) {
		this(name, weight, DEFAULT_DENSITY);
	}
	
	@Override
	public String getName() {
		return "Poodle " + super.getName();
	}
	
	@Override
	public String toString() {
		return "Poodle " + super.toString() + " " + "(curlDensity=" + curlDensity + ")";
	}
}
