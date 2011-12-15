
public class Cook extends Employee implements Runnable {
	private RefrigeratedWarehouse<WildPig> rw;
	private Table<WildPigRoast> t;

	public Cook(String name, RefrigeratedWarehouse<WildPig> rw, Table<WildPigRoast> t) {
		super(name);
		this.rw = rw;
		this.t = t;
	}

	@Override
	public void run() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Cook: " + this.name;
	}

}
