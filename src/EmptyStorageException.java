/**
 * Class EmptyStorageException extends Exception
 * 
 * @author Gruppe222
 * 
 */
public class EmptyStorageException extends Exception {

	/**
	 * Automatically generated ID.
	 */
	private static final long serialVersionUID = -2614163354604579142L;

	/**
	 * Constructor without parameter calls the super constructor
	 */
	public EmptyStorageException() {
		super();
	}

	/**
	 * Constructor with String as parameter. Calls the super constructor.
	 * 
	 * @param arg0
	 *            a String
	 */
	public EmptyStorageException(String arg0) {
		super(arg0);
	}

	/**
	 * Constructor with Throwable as parameter. Calls the super constructor.
	 * 
	 * @param arg0
	 *            a Throwable
	 */
	public EmptyStorageException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * Constructor with String and Throwable as parameters. Calls the super
	 * constructor.
	 * 
	 * @param arg0
	 *            a String
	 * @param arg1
	 *            a Throwable
	 */
	public EmptyStorageException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}
