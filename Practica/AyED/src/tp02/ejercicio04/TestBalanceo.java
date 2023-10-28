package tp02.ejercicio04;

import tp02.ejercicio03.PilaGenerica;

public class TestBalanceo {
	
	public static boolean esCaracterDeApertura(char c) {
		return (c == '(' || c == '[' || c == '{'); 
	}
	
	public static <T> boolean coincidenCaracteres(PilaGenerica<T> pila, char c) {
		if ((pila.tope().equals('{') && (c == '}')) 
				|| (pila.tope().equals('[') && (c == ']'))
				|| (pila.tope().equals('(') && (c == ')')))	 {
			return true;
		} else {
			return false;
		}
	}

	public static boolean esBalanceado(String cadena) {
		PilaGenerica<Character> pila = new PilaGenerica<>();
		
		char c;
		boolean corte = false;
		
		int i = 0;
		while ((i < cadena.length()) && !(corte) ) {
			c = cadena.charAt(i);
			if (esCaracterDeApertura(c)) {
				pila.apilar(c);
				
			} else {
				if (!coincidenCaracteres(pila, c)) {
					corte = true;
					
				} else {
					pila.desapilar();
				}
			}
			i++;
		}
		
		return pila.esVacia();
	}

	public static void main(String[] args) {

		String cadena1 = "{()[()]}";
		String cadena2 = "({})";
		if (esBalanceado(cadena1)) {
			System.out.println(cadena1 + " está balanceado");
			
		} else {
			System.out.println(cadena1 + " no está balanceado");
			
		}
		if (esBalanceado(cadena2)) {
			System.out.println(cadena2 + " está balanceado");
			
		} else {
			System.out.println(cadena2 + " no está balanceado");
			
		}

	}

}
