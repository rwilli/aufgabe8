
public class Cook extends Employee implements Runnable {

	public Cook(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println(this);
		
		for ( int i = 0; i < 20; i++ )
		      System.out.println( i );
	}

	@Override
	public String toString() {
		return "Cook: " + this.name;
	}

}
