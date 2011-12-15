
public class Logistician extends Employee implements Runnable {

	public Logistician(String name, StonePit<ChristmasTree> s, VillageSquare<OxBarrow> v) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println(this);
		
	}
	
	@Override
	public String toString() {
		return "Logistician: " + this.name;
	}

}
