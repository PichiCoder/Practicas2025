package tp3;

import java.util.Iterator;

public class ej9_ParcialArboles {

	
	private static boolean comprobarSiEsDeSeleccion (GeneralTree<Integer> arbol) {
		boolean cumplo = true;
		int minimo = 9999999;
		
		if (arbol.isLeaf())
			return cumplo;
		
		for (GeneralTree<Integer> child : arbol.getChildren()) {
			if (child.getData() <= minimo) 
				minimo = child.getData();
		}
		
		if (arbol.getData() != minimo) 
			return false;
		
		Iterator<GeneralTree<Integer>> it = arbol.getChildren().iterator();
		
		while (cumplo && it.hasNext()) {
			GeneralTree<Integer> nodo = it.next();
			cumplo = comprobarSiEsDeSeleccion(nodo);
		}

		return cumplo;
	
	}
	
	public static boolean esDeSeleccion (GeneralTree<Integer> arbol) {
		
		if (arbol != null && !arbol.isEmpty()) {
			
			return comprobarSiEsDeSeleccion(arbol);
			
		}
		
		return false;
	}
	
	public static void main (String [] args) { 
		//aGeneralesEjemplo.aDeSeleccion().porNiveles();
		
		System.out.println(esDeSeleccion(aGeneralesEjemplo.aGeneralIntegers_1()));
		
		System.out.println(esDeSeleccion(aGeneralesEjemplo.aGeneralIntegers_2()));
		
		System.out.println(esDeSeleccion(aGeneralesEjemplo.aGeneralAbeto()));
		
		System.out.println(esDeSeleccion(aGeneralesEjemplo.aDeSeleccion())); //Este debe dar True
	}
}
