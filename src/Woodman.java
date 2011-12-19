/**
 * The class Woodman extends Employee and
 * implements Runnable for creating a thread
 * 
 * @author Gruppe222
 *
 */
public class Woodman extends Employee implements Runnable {
	// storage to get products
	private Table<WildPigRoast> t;
	
	// storage to put products
	private StonePit<ChristmasTree> s;
	
	/**
	 * constructor with given name,
	 * storage to get products,
	 * storage to put products
	 * 
	 * @param name woodman's name
	 * @param t storage to get products from
	 * @param s storage to put products to
	 */
	public Woodman(String name, int time, Table<WildPigRoast> t, StonePit<ChristmasTree> s) {
		super(name, time);
		this.t = t;
		this.s = s;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println(this + " is working...");
		
		// TODO place exception
		try {
			this.t.removeProduct();
		} catch (EmptyStorageException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			this.s.addProduct(new ChristmasTree());
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
		return "Woodman: " + this.name;
	}
	
}
