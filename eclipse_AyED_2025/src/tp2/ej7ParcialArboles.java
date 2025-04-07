package tp2;

public class ej7ParcialArboles {
	private BinaryTree<Integer> arbol;
	
	public ej7ParcialArboles(BinaryTree<Integer> arbol) {
		super();
		this.arbol = arbol;
	}

	public int contarUnicosHijos(BinaryTree<Integer> ab) {
		int total = 0;
		
		//Condicion que controla cuando contar
		if (ab.hasLeftChild() && !ab.hasRightChild()) total++;
		if (!ab.hasLeftChild() && ab.hasRightChild()) total++;
		
		if (ab.hasLeftChild()) {
			this.contarUnicosHijos(ab.getLeftChild());
		}
		if (ab.hasRightChild()) {
			this.contarUnicosHijos(ab.getRightChild());
		}
		
		return total;
		
	}
	
	public boolean encontrarN (BinaryTree<Integer> ab, int n) {
		
		int izq = -1, der = -1;

		if (ab.getData() != n) {
			if (ab.hasLeftChild()) {
				this.encontrarN(ab.getLeftChild(), n);
			}
			if (ab.hasRightChild()) {
				this.encontrarN(ab.getRightChild(), n);
			}
		}
		else {

			if (ab.hasLeftChild()) {
				izq = this.contarUnicosHijos(ab.getLeftChild());
			}

			if (ab.hasRightChild()) {
				der = this.contarUnicosHijos(ab.getRightChild());
			}

		}
			
		return izq > der;
	}
	
	public boolean isLeftTree (int num) {
		
		return this.encontrarN(this.arbol, num);
	}
	
	/*
	 * Recorrido en profundidad. 
	 * Mientras no llegamos al "nodo == num", seguimos recorriendo.
	 * Si llegamos a "nodo == num" --> mandamos subArb izquierdo y derecho del nodo a controlar:
	 * - contar raices de que cumplan con la condicion (que tengan un solo un hijo).
	 */
	
	public static void main(String[] args) {
		BinaryTree<Integer> arb = arbolesEjemplo.arbol_Integers_B();
		
		ej7ParcialArboles ab = new ej7ParcialArboles(arb);
		
		System.out.println(ab.isLeftTree(25));
	}
}
