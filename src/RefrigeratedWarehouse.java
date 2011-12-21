/**
 * Class RefrigeratedWarehouse with type variable T extends Storage<T>.
 * 
 * @author Gruppe222
 * 
 * @param <T>
 *            type variable.
 */
public class RefrigeratedWarehouse<T> extends Storage<T> {

	/**
	 * Constructor calls the super constructor.
	 * 
	 * @param size
	 *            the size of the refrigerated warehouse as Integer.
	 */
	public RefrigeratedWarehouse(int size) {
		super(size);
	}
	
}
