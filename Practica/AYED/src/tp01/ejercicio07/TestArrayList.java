package tp01.ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		System.out.print("Ingrese número: ");
		int n = scanner.nextInt();
		
		while (n != -9999) {
			arrayList.add(n);
			
			System.out.print("Ingrese otro número: ");
			n = scanner.nextInt();
		}
		
		for (Integer numero : arrayList) {
			System.out.println(numero);
		}
	}

}
