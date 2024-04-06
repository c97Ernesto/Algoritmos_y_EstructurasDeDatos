package tp1.ejercicio08;

public class DoubleEndedQueue<T> extends Queue<T>{

	public T shift() {
		T data = super.dequeue();
		super.enqueue(data);
		return data;
	}
	
}
