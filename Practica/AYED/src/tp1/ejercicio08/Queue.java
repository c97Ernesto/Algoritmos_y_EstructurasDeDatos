package tp1.ejercicio08;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

	List<T> data;
	
	public Queue() {
		this.data = new ArrayList<T>();
	}
	
	public void enqueue(T dato) {
		this.data.add(dato);
	}
	
	public T dequeue() {
		return this.data.removeFirst();
		
	}
	
	public T head() {
		return this.data.getFirst();
	}
	
	public boolean isEmpty() {
		return (this.data == null);
	}
	
	public int size() {
		return this.data.size();
	}
	
	public String toString() {
		String data = "";
		
		for (T t : this.data) {
			data+= t.toString() + " - "; 
		}
		return data;
	}
	
	
}
