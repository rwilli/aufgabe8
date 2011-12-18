
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
		System.out.println(this + " is cooking...");
		
		// TODO place exception
		this.rw.removeProduct();
		this.t.addProduct(new WildPigRoast());
		this.t.addProduct(new WildPigRoast());
		this.t.addProduct(new WildPigRoast());
		this.t.addProduct(new WildPigRoast());
		this.t.addProduct(new WildPigRoast());
	}

	@Override
	public String toString() {
		return "Cook: " + this.name;
	}

}
