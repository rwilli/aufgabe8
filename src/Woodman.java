
public class Woodman extends Employee implements Runnable {
	private Table<WildPigRoast> t;
	private StonePit<ChristmasTree> s;

	public Woodman(String name, Table<WildPigRoast> t, StonePit<ChristmasTree> s) {
		super(name);
		this.t = t;
		this.s = s;
	}

	@Override
	public void run() {
		System.out.println(this);
		
	}

	@Override
	public String toString() {
		return "Woodman: " + this.name;
	}
	
}
