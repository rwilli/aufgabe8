/**
 * The class Cook extends Employee and
 * implements Runnable for creating a thread
 * 
 * @author Gruppe222
 *
 */
public class Cook extends Employee implements Runnable {
	// storage to get products
	private RefrigeratedWarehouse<WildPig> rw;
	
	// storage to put products
	private Table<WildPigRoast> t;
	
	/**
	 * constructor with given name, 
	 * storage to get products,
	 * storage to put products
	 * 
	 * @param name cook's name
	 * @param rw storage to get products from
	 * @param t storage to put products to
	 */
	public Cook(String name, int time, RefrigeratedWarehouse<WildPig> rw, Table<WildPigRoast> t) {
		super(name, time);
		this.rw = rw;
		this.t = t;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		while ( !rw.getLstProducts().isEmpty() || rw.isOpen) {
			System.out.println(this + " is cooking...");
			this.rw.removeProduct();

			// working
			try {
				Thread.sleep(this.workingTime);
			} catch (InterruptedException ie) {
				System.out.println("Thread interrupted...");
				Thread.interrupted();
			}

			this.t.addProduct(new WildPigRoast());
			this.t.addProduct(new WildPigRoast());
			this.t.addProduct(new WildPigRoast());
			this.t.addProduct(new WildPigRoast());
			this.t.addProduct(new WildPigRoast());
		}
		
		t.isOpen = false;
		System.out.println(name + "  finished run");
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cook: " + this.name;
	}

}
