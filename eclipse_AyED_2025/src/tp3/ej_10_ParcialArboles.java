package tp3;

import java.util.LinkedList;
import java.util.List;

public class ej_10_ParcialArboles {

	/* Metodo auxiliar parece que va a constar de al menos 5 paramaetros:
		- arbol, caminoFiltradoActual, caminoFiltradoMaximo, nivelActual, sumaActual y sumaMaxima.
	los primeros tres se entiende el motivo. 
	nivelActual lo necesito porque voy a recorrer en profundidad y para calcular sumaActual, necesito conocer el nivel en el que estoy.
	
	Para cada nodo:
	
	si es un 1
		sumaActual += sumaActual + nodo.getData() * nivel
	
	En el for recorriendo a los hijos
		...
		sumaActual += child.recorrer(...)
		si (sumaActual > sumaMaxima)
			sumaMaxima = sumaActual;
			
			caminoMax.addAll(caminoAct)
			caminoAct.clear()
	 */
	
	private static void obtenerCaminoMaxFiltrado (GeneralTree<Integer> ab, List<Integer> caminoAct, List<Integer> caminoMax, int nivel, int sumaAct, int sumaMax) {
		
		if (ab.getData() == 1) {
			sumaAct += ab.getData() * nivel;
			caminoAct.add(ab.getData());
		}
		
		for (GeneralTree<Integer> child : ab.getChildren()) {
			nivel++;
			obtenerCaminoMaxFiltrado(child, caminoAct, caminoMax, nivel, sumaAct, sumaMax);
			
			if (sumaAct > sumaMax) {
				caminoMax.clear();
				caminoMax.addAll(caminoAct);
				sumaMax = sumaAct;
			}
			
			if (child.getData() == 1) {
				caminoAct.remove(caminoAct.size() - 1); //porque solo lo agregue a lista si contenia 1
				sumaAct -= child.getData() * nivel;
			}
		}
		
		
		
		
	}
	
	public static List<Integer> resolver(GeneralTree<Integer> arbol) {
		
		List<Integer> caminoFiltradoMaximo = new LinkedList<Integer>();
		
		if (arbol != null && !arbol.isEmpty())
			obtenerCaminoMaxFiltrado(arbol, new LinkedList<Integer>(), caminoFiltradoMaximo, 0, 0, 0);
		
		return caminoFiltradoMaximo;
			
		
	}
	
}
