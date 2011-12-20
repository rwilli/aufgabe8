import java.util.ArrayList;
import java.util.List;

/**
 * The class Storage acts as base class
 * for storage sub-types
 * 
 * @author Gruppe222
 *
 */
public abstract class Storage<T> {
	// list with products
	protected List<T> lstProducts = new ArrayList<T>();
	
	// size of the list
	protected final int lstSize;
	
	/**
	 * constructor with given list size
	 * 
	 * @param size size of the list
	 */
	public Storage(int size) {
		this.lstSize = size;
	}
	
	/**
	 * getter for product list
	 * 
	 * @return list of products
	 */
	public List<T> getLstProducts() {
		return this.lstProducts;
	}
	
	/**
	 * getter for list size
	 * 
	 * @return size of the list
	 */
	public int getMaxLstSize() {
		return this.lstSize;
	}
	
	/**
	 * add product to the list
	 * 
	 * @param product product to adde
	 * @throws FullStorageException
	 */
	public synchronized void addProduct(T product) {
		
		
		if (this.lstProducts.size() < this.lstSize) {
			this.lstProducts.add(product);
			System.out.println("storing... " + product.toString());	
		} else { 
			System.out.println(this.getClass().getName() + "  Storage full, wait");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	/**
	 * 
	 * @throws EmptyStorageException
	 */
	public synchronized void removeProduct() {
		
		
		if (!this.lstProducts.isEmpty()) {
			this.lstProducts.remove(0);
			System.out.println("removing at  " + this.getClass().getName());
			this.notifyAll();
		} else {
			
			System.out.println(this.getClass().getName() + "  Storage empty, wait");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
