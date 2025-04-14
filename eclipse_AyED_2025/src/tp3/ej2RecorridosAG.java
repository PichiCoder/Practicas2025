package tp3;

public class ej2RecorridosAG {

	/* Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	pasados como parámetros, recorrido en preorden. */
	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a,	Integer n) {
		
	}
	
	/* Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	pasados como parámetros, recorrido en inorden. */
	public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a, Integer n) {
		
	}
	
	/* Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	pasados como parámetros, recorrido en postorden. */
	public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a, Integer n) {
		
	}
	
	/* Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	pasados como parámetros, recorrido por niveles. */
	public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree <Integer> a, Integer n) {
		
	}
	
	public static void main(String [] args) {
		GeneralTree<String> ab = aGeneralesEjemplo.aGeneralStrings_1();
		
		//ab.preOrder();
		//ab.postOrder();
		ab.inOrder();
	}
}
