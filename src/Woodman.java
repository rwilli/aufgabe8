
public class Woodman extends Employee implements Runnable {
	private Table<WildPigRoast> t;
	private StonePit<ChristmasTree> s;
	Thread th;

	public Woodman(String name, Table<WildPigRoast> t, StonePit<ChristmasTree> s) {
		super(name);
		this.t = t;
		this.s = s;
		this.th = new Thread(this);
		this.th.start();
	}

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
		
		this.s.addProduct(new ChristmasTree());
	}

	@Override
	public String toString() {
		return "Woodman: " + this.name;
	}
	
}
