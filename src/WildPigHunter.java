
public class WildPigHunter extends Employee implements Runnable {
	private final int countHunting;
	private RefrigeratedWarehouse<WildPig> st;
	Thread t;
	
	public WildPigHunter(String name, int size, RefrigeratedWarehouse<WildPig> st) {
		super(name);
		this.countHunting = size;
		this.st = st;
		this.t = new Thread(this);
		this.t.start();
	}

	@Override
	public void run() {
		System.out.println(this + " is hunting...");
		this.st.addProduct(new WildPig());
	}

	@Override
	public String toString() {
		return "WildPigHunter: " + this.name + ", " + this.countHunting;
	}

}
