/**
 * Class FullStorageException extends Exception
 * 
 * @author Gruppe222
 * 
 */
public class FullStorageException extends Exception {

	/**
	 * Automatically generated ID.
	 */
	private static final long serialVersionUID = 244238335080699505L;

	/**
	 * Constructor without parameter calls the super constructor
	 */
	public FullStorageException() {
		super();
	}

	/**
	 * Constructor with String as parameter. Calls the super constructor.
	 * 
	 * @param arg0
	 *            a String
	 */
	public FullStorageException(String arg0) {
		super(arg0);
	}

	/**
	 * Constructor with Throwable as parameter. Calls the super constructor.
	 * 
	 * @param arg0
	 *            a Throwable
	 */
	public FullStorageException(Throwable arg0) {
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
	public FullStorageException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
	
}
