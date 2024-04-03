package tp01.ejercicio05;

public class Ejercicio05 {
	
	static int [] array = {3, 4, 1, 6, 9};

	public static Dato devolverPorReturn() {
		int minimo = Integer.MAX_VALUE;
		int maximo = Integer.MIN_VALUE;
		int suma = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minimo) 
				minimo = array[i];
			
			if (array[i] > maximo) 
				maximo = array[i];
			
			suma+= array[i];
		}
		Dato datos = new Dato();
		datos.setMinimo(minimo);
		datos.setMaximo(maximo);
		datos.setPromedio(suma / array.length);
		
		return datos;
	}
	
	
	
}
