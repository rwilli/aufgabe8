
public class Cook extends Employee implements Runnable {
	private RefrigeratedWarehouse<WildPig> rw;
	private Table<WildPigRoast> t;
	Thread th;

	public Cook(String name, RefrigeratedWarehouse<WildPig> rw, Table<WildPigRoast> t) {
		super(name);
		this.rw = rw;
		this.t = t;
		this.th = new Thread(this);
		this.th.start();
	}

	@Override
	public void run() {
		System.out.println(this + " is cooking...");
		
		// TODO place exception
		try {
			this.rw.removeProduct();
		} catch (EmptyStorageException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			this.t.addProduct(new WildPigRoast());
			this.t.addProduct(new WildPigRoast());
			this.t.addProduct(new WildPigRoast());
			this.t.addProduct(new WildPigRoast());
			this.t.addProduct(new WildPigRoast());
		} catch (FullStorageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String toString() {
		return "Cook: " + this.name;
	}

}
