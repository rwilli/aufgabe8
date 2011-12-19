/**
 * The Employee class acts as base
 * class for all worker subtypes
 * 
 * @author Gruppe222
 *
 */
public abstract class Employee {
	// employee's name
	protected String name;
	
	// employee's working time
	protected int workingTime;
	
	/**
	 * constructor with given name
	 * 
	 * @param name employee's name
	 */
	public Employee(String name, int time) {
		this.name = name;
		this.workingTime = time;
	}
	
}
