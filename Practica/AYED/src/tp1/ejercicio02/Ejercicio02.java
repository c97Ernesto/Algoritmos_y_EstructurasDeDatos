package tp1.ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {


	public static int[] devolerArreglo(int n) {
		int [] arreglo = new int[n];
		
		for (int i = 0; i < n; i++) {
			arreglo[i] = (i + 1) * n;
		}
		
		return arreglo;
	}
	
	public static void imprimirArreglo(int [] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingresar número");
		int n = s.nextInt();
		
		while (n != 0) {
			
			imprimirArreglo(devolerArreglo(n));
			
			System.out.println();
			
			System.out.println("Ingresar número");
			n = s.nextInt();

			
		}

	}

}
