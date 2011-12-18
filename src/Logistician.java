
public class Logistician extends Employee implements Runnable {
	private StonePit<ChristmasTree> sp;
	private VillageSquare<OxBarrow> vs;
	Thread th;

	public Logistician(String name, StonePit<ChristmasTree> s, VillageSquare<OxBarrow> v) {
		super(name);
		this.sp = s;
		this.vs = v;
		this.th = new Thread(this);
		this.th.start();
	}

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
		
		this.vs.addProduct(new OxBarrow());
	}
	
	@Override
	public String toString() {
		return "Logistician: " + this.name;
	}

}
