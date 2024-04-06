package tp1.ejercicio08;

public class TestQueue {

	public static void main(String[] args) {
		
		Queue<Integer> colaEnteros = new Queue<Integer>();
		
		colaEnteros.enqueue(9);
		colaEnteros.enqueue(10);
		colaEnteros.enqueue(11);
		colaEnteros.enqueue(12);
		colaEnteros.enqueue(13);
		colaEnteros.enqueue(14);
		
		if (!colaEnteros.isEmpty()) {
			System.out.println(colaEnteros.toString());
			System.out.println("La cantidad de elementos de la cola es: "+ colaEnteros.size());
			
			System.out.println("Desencolamos el elemento: "+ colaEnteros.dequeue());
			System.out.println("Desencolamos el elemento: "+ colaEnteros.dequeue());
			System.out.println("Desencolamos el elemento: "+ colaEnteros.dequeue());

			System.out.println(colaEnteros.toString());
			System.out.println("La cantidad de elementos de la cola es: "+ colaEnteros.size());
		}
		else System.out.println("No hay elementos en la cola");
		
		
	}
	
	
}
