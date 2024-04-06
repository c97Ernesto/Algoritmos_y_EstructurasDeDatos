package tp1.ejercicio07;

import java.util.ArrayList;

public class TestRecorrerListas {

	public static void main(String[] args) {
	    ArrayList<Integer> lista1 = new ArrayList<Integer>();
        lista1.add(1);
        lista1.add(3);
        lista1.add(5);
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        ArrayList<Integer> nuevaLista = RecorrerListas.combinarOrdenado(lista1, lista2);
        System.out.println(nuevaLista);
	}

}
