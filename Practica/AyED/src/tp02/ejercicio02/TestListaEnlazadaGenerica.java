package tp02.ejercicio02;

import tp01.ejercicio03.Estudiante;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

/* 2.3. Escriba una clase llamada TestListaEnlazadaGenerica que cree 4 objetos de tipo Estudiante
	(implementado en el TP01B) y los agregue a un objeto de tipo ListaEnlazadaGenerica usando los
	diferentes métodos de la lista y luego, imprima los elementos de dicha lista usando el método
	tusDatos().
*/
public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante();
		Estudiante e2 = new Estudiante();
		Estudiante e3 = new Estudiante();
		Estudiante e4 = new Estudiante();
		
		e1.setApellido("Estudiante1");
		e1.setComision("Comision-Estudiante1");
		e1.setDireccion("Dirección-Estudiante1");
		e1.setEmail("Email-Estudiante1");
		e1.setNombre("Estudiante1");
		
		e2.setApellido("Estudiante2");
		e2.setComision("Comision-Estudiante2");
		e2.setDireccion("Dirección-Estudiante2");
		e2.setEmail("Email-Estudiante2");
		e2.setNombre("Estudiante2");
		
		e3.setApellido("Estudiante3");
		e3.setComision("Comision-Estudiante3");
		e3.setDireccion("Dirección-Estudiante3");
		e3.setEmail("Email-Estudiante3");
		e3.setNombre("Estudiante3");
		
		e4.setApellido("Estudiante4");
		e4.setComision("Comision-Estudiante4");
		e4.setDireccion("Dirección-Estudiante4");
		e4.setEmail("Email-Estudiante4");
		e4.setNombre("Estudiante4");
		
		ListaEnlazadaGenerica<Estudiante> listaEnlazadaGenerica = new ListaEnlazadaGenerica<Estudiante>();
		
		listaEnlazadaGenerica.agregarInicio(e1);
		listaEnlazadaGenerica.agregarEn(e2, 2);
		listaEnlazadaGenerica.agregarEn(e3, listaEnlazadaGenerica.tamanio() + 1);
		listaEnlazadaGenerica.agregarFinal(e4);
		
		listaEnlazadaGenerica.comenzar();
		Estudiante estudiante;
		
		for (int i = 1; i <= listaEnlazadaGenerica.tamanio(); i++) {
			estudiante = listaEnlazadaGenerica.elemento(i);
			System.out.print("Estudiante nro " + i +": ");
			System.out.println(estudiante.tusDatos());
			System.out.println();
		}
		

	}

}
