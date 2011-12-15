
public class Woodman extends Employee implements Runnable {

	public Woodman(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println(this);
		
	}

	@Override
	public String toString() {
		return "Woodman: " + this.name;
	}
	
}
