import java.util.LinkedList;
import java.util.List;


public abstract class Storage<T> {
	protected List<T> lstProducts = new LinkedList<T>();
	protected final int maxLstSize;
	
	public Storage(int size) {
		this.maxLstSize = size;
	}

	public List<T> getLstProducts() {
		return lstProducts;
	}
	
	public void addProduct(T element) {
		this.lstProducts.add(element);
	}
	
}
