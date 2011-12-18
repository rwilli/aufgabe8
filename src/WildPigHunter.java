
public class WildPigHunter extends Employee implements Runnable {
	private final int countHunting;
	private RefrigeratedWarehouse<WildPig> st;
	Thread th;
	
	public WildPigHunter(String name, int size, RefrigeratedWarehouse<WildPig> st) {
		super(name);
		this.countHunting = size;
		this.st = st;
		this.th = new Thread(this);
		this.th.start();
	}

	@Override
	public void run() {
		// TODO exception werfen wenn countHunting Ÿberschritten wird
		int counter = 0;
		
		while (counter < this.countHunting) {
			System.out.println(this + " is hunting...");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				this.st.addProduct(new WildPig());
			} catch (FullStorageException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			counter++;
		}
	}

	@Override
	public String toString() {
		return "WildPigHunter: " + this.name + ", " + this.countHunting;
	}

}
