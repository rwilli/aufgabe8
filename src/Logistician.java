/**
 * The class Logistician extends Employee and
 * implements Runnable for creating a thread
 * 
 * @author Gruppe222
 *
 */
public class Logistician extends Employee implements Runnable {
	// storage to get products
	private StonePit<ChristmasTree> sp;
	
	// storage to put products
	private VillageSquare<OxBarrow> vs;
	
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
		this.sp = s;
		this.vs = v;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println(this + " is loading...");
		
		try {
			this.sp.removeProduct();
			this.sp.removeProduct();
		} catch (EmptyStorageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			this.vs.addProduct(new OxBarrow());
		} catch (FullStorageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
