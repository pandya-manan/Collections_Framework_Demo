package generics;
/*
 * Generic Class 
 */
public class Trial<T> {
	
	private T data;

	public Trial(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	

}
