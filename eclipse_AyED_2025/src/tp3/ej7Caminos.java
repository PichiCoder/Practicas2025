package tp3;

import java.util.ArrayList;
import java.util.List;

public class ej7Caminos {

	GeneralTree<Integer> arbol;
	
	private void encontrarCamino(GeneralTree<Integer> ab, List<Integer> caminoMaximo, List<Integer> caminoActual) {
		
		caminoActual.add(ab.getData());
		
		for (GeneralTree<Integer> child : ab.getChildren()) {
			
			this.encontrarCamino(child, caminoMaximo, caminoActual);
			
			if (caminoActual.size() > caminoMaximo.size()) {
				caminoMaximo.clear();
				caminoMaximo.addAll(caminoActual);
			}
			
			caminoActual.remove(caminoActual.size() - 1);
			
		}
		
	}
	
	public List<Integer> caminoAHojaMasLejana () {
		
		List<Integer> caminoResultado = new ArrayList<Integer>();
		List<Integer> caminoAux = new ArrayList<Integer>();
		
		encontrarCamino(arbol, caminoResultado, caminoAux);
		
		return caminoResultado;
		
	}
}
