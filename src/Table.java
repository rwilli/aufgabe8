/**
 * Class Table with type variable T extends Storage<T>.
 * 
 * @author Gruppe222
 * 
 * @param <T>
 *            type variable.
 */
public class Table<T> extends Storage<T> {

	/**
	 * Constructor calls the super constructor.
	 * 
	 * @param size
	 *            the size of the table as Integer.
	 */
	public Table(int size) {
		super(size);
	}

}
