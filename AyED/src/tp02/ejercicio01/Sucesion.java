package tp02.ejercicio01;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class Sucesion {

	
	public static ListaDeEnterosEnlazada calcularSucesion(int n) {
		ListaDeEnterosEnlazada lista;
		if (n == 1) {
			lista = new ListaDeEnterosEnlazada();
			lista.agregarFinal(n);
			return lista;
		} else {
			if (n%2 == 0) {
				lista = calcularSucesion(n/2);
			} else {
				lista = calcularSucesion(3*n + 1);
			}
			lista.agregarInicio(n);
			return lista;
		}
//		} else  if ((n%2) == 0){
//			lista = calcularSucesion(n/2);
//			lista.agregarInicio(n);
//			return lista;
//		} else {
//			lista = calcularSucesion(3*n + 1);
//			lista.agregarInicio(n);
//			return lista;
//		}
	}
	
	public static void main(String[] args) {
		
		ListaDeEnterosEnlazada listaDeEnterosEnlazada = calcularSucesion(6);
		
		listaDeEnterosEnlazada.comenzar();
		for(int i = 1; i<= listaDeEnterosEnlazada.tamanio(); i++) {
			System.out.println(listaDeEnterosEnlazada.elemento(i));
		}
		
	}

}
