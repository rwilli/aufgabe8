
public class Logistician extends Employee implements Runnable {
	private StonePit<ChristmasTree> sp;
	private VillageSquare<OxBarrow> vs;

	public Logistician(String name, StonePit<ChristmasTree> s, VillageSquare<OxBarrow> v) {
		super(name);
		this.sp = s;
		this.vs = v;
	}

	@Override
	public void run() {
		System.out.println(this + " is loading...");
		
		this.sp.getLstProducts().remove(0);
		this.sp.getLstProducts().remove(0);
		this.vs.addProduct(new OxBarrow());
	}
	
	@Override
	public String toString() {
		return "Logistician: " + this.name;
	}

}
