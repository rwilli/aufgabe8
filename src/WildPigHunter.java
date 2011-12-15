import java.util.List;


public class WildPigHunter extends Employee implements Runnable {
	private final int countHunting;
	
	public WildPigHunter(String name, int size) {
		super(name);
		this.countHunting = size;
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
