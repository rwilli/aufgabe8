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
	
	public synchronized void addProduct(T element) {
		// TODO place exception if number > as size
		System.out.println("storing...");	
		
		if (this.lstProducts.size() < this.maxLstSize) {
			this.lstProducts.add(element);
		} else {
			// no place in storage
			System.out.println("no place!!!");
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
