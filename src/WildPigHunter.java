
public class WildPigHunter extends Employee implements Runnable {
	private final int countHunting;
	private RefrigeratedWarehouse<WildPig> st;
	
	public WildPigHunter(String name, int size, RefrigeratedWarehouse<WildPig> st) {
		super(name);
		this.countHunting = size;
		this.st = st;
	}

	@Override
	public void run() {
		System.out.println(this + " is hunting...");
	}

	@Override
	public String toString() {
		return "WildPigHunter: " + this.name + ", " + this.countHunting;
	}

}
