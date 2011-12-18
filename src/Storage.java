import java.util.ArrayList;
import java.util.List;


public abstract class Storage<T> {
	protected List<T> lstProducts = new ArrayList<T>();
	protected final int maxLstSize;
	
	public Storage(int size) {
		this.maxLstSize = size;
	}
	
	public int getMaxLstSize() {
		return this.maxLstSize;
	}
	
	public synchronized void addProduct(T element) {
		// TODO place exception if number > as size
		System.out.println("storing...");	
		
		if (this.lstProducts.size() < this.maxLstSize) {
			this.lstProducts.add(element);
			this.notifyAll();
		} else {
			// no place in storage
			System.out.println("no place!!!");
			
			/*try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
	
	public synchronized void removeProduct() throws EmptyStorageException {
		System.out.println("removing...");
		
		// TODO place perhaps exception
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (this.lstProducts.size() == 0)
			throw new EmptyStorageException("Storage is empty");
		else
			this.lstProducts.remove(0);
	}
	
}
