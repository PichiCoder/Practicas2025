package tp2;

public class ej8ParcialArboles {
	

	//Puedo ir comparando nodo con nodo
	//caso base es hoja y son iguales ?
	public boolean esPrefijo(BinaryTree<Integer> a1, BinaryTree<Integer> a2) {
		
		boolean res = false;
		
		if (a1.getData() != a2.getData()) {
			return false;
		}
			
		if (a1.hasLeftChild()) {
			if (a2.hasLeftChild()) {
				res = esPrefijo(a1.getLeftChild(), a2.getLeftChild());
				return res; // hay que propagar el resultado
			}
			else
				return false;
		}
		
		if (a1.hasRightChild()) {
			if (a2.hasRightChild()) {
				res = esPrefijo(a1.getRightChild(), a2.getRightChild());
				return res;
			}
			else
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args ) {
		BinaryTree<Integer> ab1 = arbolesEjemplo.arbol_Integers_A();
		BinaryTree<Integer> ab2 = arbolesEjemplo.arbol_Integers_B();
		
		ej8ParcialArboles arboles = new ej8ParcialArboles();
		// se que ab1 es prefijo de ab2
		
		arboles.esPrefijo(ab1, ab2);
	}
}
