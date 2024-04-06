package tp1.ejercicio01;

public class Ejercicio01 {

	public static void conFor(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	}
	
	public static void conWhile(int a, int b) {
		int i = 1;
		
		while (i <= b) {
			System.out.println(i++);
		}
	}
	
	public static void sinIteracion(int a, int b) {
		if (a <= b) {
			System.out.println(a++);
			sinIteracion(a, b);
		}
	}
	
}
