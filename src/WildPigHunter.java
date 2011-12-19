/**
 * The class WildPigHunter extends Employee and
 * implements Runnable for creating a thread
 * 
 * @author Gruppe222
 *
 */
public class WildPigHunter extends Employee implements Runnable {
	// amount of hunting trips
	private final int countHunting;
	
	// storage to put products
	private RefrigeratedWarehouse<WildPig> st;
	
	/**
	 * constructor with given name,
	 * number of hunting trips,
	 * storage to put products
	 * 
	 * @param name widpighunter's name
	 * @param size amount of hunting trips
	 * @param st storage to put products to
	 */
	public WildPigHunter(String name, int time, int number, RefrigeratedWarehouse<WildPig> st) {
		super(name, time);
		this.countHunting = number;
		this.st = st;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		int counter = 0;
		
		while (counter < this.countHunting) {
			System.out.println(this + " is hunting...");
			
			try {
				this.st.addProduct(new WildPig());
			} catch (FullStorageException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(this.workingTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			counter++;
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WildPigHunter: " + this.name + ", " + this.countHunting;
	}

}
