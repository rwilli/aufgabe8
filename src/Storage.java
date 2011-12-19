import java.util.ArrayList;
import java.util.List;


public abstract class Storage<T> {
	protected List<T> lstProducts = new ArrayList<T>();
	protected final int maxLstSize;
	
	public Storage(int size) {
		this.maxLstSize = size;
	}
	
	public List<T> getLstProducts() {
		return this.lstProducts;
	}
	
	public int getMaxLstSize() {
		return this.maxLstSize;
	}
	
	public synchronized void addProduct(T element) throws FullStorageException {
		System.out.println("storing...");	
		
		if (this.lstProducts.size() < this.maxLstSize) {
			this.lstProducts.add(element);
			this.notifyAll();
		} else { 
			/*try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			throw new FullStorageException("Storage is full");
		}
	}
	
	public synchronized void removeProduct() throws EmptyStorageException {
		System.out.println("removing...");
		
		if (!this.lstProducts.isEmpty()) {
			this.lstProducts.remove(0);
			//this.notifyAll();
		} else {
			/*try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			throw new EmptyStorageException("Storage is empty");
		}
	}
	
}
