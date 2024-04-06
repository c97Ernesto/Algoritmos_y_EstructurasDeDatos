package tp1.ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;

import tp1.ejercicio03.Estudiante;

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
		
		// cree una lista que contenga 3 estudiantes
		ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
		Estudiante e1 = new Estudiante("Pablo", "Perez", "A", "Rosario", "pperes@gmail.com");
		listaEstudiantes.add(e1);
		Estudiante e2 = new Estudiante("Licha", "Lopez", "B", "BsAs", "lich@gmail.com");
		listaEstudiantes.add(e2);
		Estudiante e3 = new Estudiante("Pipi", "Romagnoli", "C", "BsAs", "pip@gmail.com");
		listaEstudiantes.add(e3);
				
		// genere una nueva lista que sea una copia de la lista del inciso anterior
		ArrayList<Estudiante> listaEstudiantesCopia = new ArrayList<Estudiante>();
		listaEstudiantesCopia.addAll(listaEstudiantes);

		//imprima el contenido de la lista original y el contenido de la nueva lista
		System.out.println("Original");
		for (Estudiante estudiante : listaEstudiantes) {
			System.out.println(estudiante.tusDatos());
		}
		
		System.out.println("Copia");		
		for (Estudiante estudiante : listaEstudiantesCopia) {
			System.out.println(estudiante.tusDatos());
		}
		
		//modifique algún dato de los estudiantes
		e1.setApellido("Mouche");
		e2.setNombre("Lisandro");
		e3.setEmail("null(?");
		
		//vuelva a imprimir el contenido de la lista original y el contenido de la nueva lista
		System.out.println("Original");
		for (Estudiante estudiante : listaEstudiantes) {
			System.out.println(estudiante.tusDatos());
		}
		
		System.out.println("Copia");		
		for (Estudiante estudiante : listaEstudiantesCopia) {
			System.out.println(estudiante.tusDatos());
		}
		
		Estudiante e4 = new Estudiante("Colo", "Barco", "A", "BsAs", "pperes@gmail.com");
		
		boolean existe = false;
		for (Estudiante estudiante : listaEstudiantes) {
			if (estudiante.equals(e4)) {
				existe = true;
			}
		}
		if (existe) {
			System.out.println("El estudiante se encuentra repetido");
		} else
			System.out.println("El estudiante no se encuentra repetido");
		
	}
	
	

}
