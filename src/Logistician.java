/**
 * The class Logistician extends Employee and
 * implements Runnable for creating a thread
 * 
 * @author Gruppe222
 *
 */
public class Logistician extends Employee implements Runnable {
	
	// storage to get products
	private StonePit<ChristmasTree> s;
	
	// storage to put products
	private VillageSquare<OxBarrow> v;
	
	/**
	 * constructor with given name,
	 * storage to get products,
	 * storage to put products
	 * 
	 * @param name logistician's name
	 * @param s storage to get products from
	 * @param v storage to put products to
	 */
	public Logistician(String name, int time, StonePit<ChristmasTree> s, VillageSquare<OxBarrow> v) {
		super(name, time);
		this.s = s;
		this.v = v;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
	while(!s.getLstProducts().isEmpty() || s.isOpen){	
		System.out.println(this + " is loading...");		
			this.s.removeProduct();
			this.s.removeProduct();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			this.v.addProduct(new OxBarrow());
		
	}
	v.isOpen = false;
	System.out.println(name + "  finished run");

	
}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Logistician: " + this.name;
	}

}
