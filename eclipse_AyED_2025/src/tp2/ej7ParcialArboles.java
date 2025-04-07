package tp2;

public class ej7ParcialArboles {
	private BinaryTree<Integer> arbol;
	
	public ej7ParcialArboles(BinaryTree<Integer> arbol) {
		super();
		this.arbol = arbol;
	}

	public int contarUnicosHijos(BinaryTree<Integer> ab) {
		int total = 0;
		
		//Condiciones que controlan cuando contar
		if (ab.hasLeftChild() && !ab.hasRightChild()) total++;
		if (!ab.hasLeftChild() && ab.hasRightChild()) total++;
		
		if (ab.hasLeftChild()) {
			return total += this.contarUnicosHijos(ab.getLeftChild());
		}
		if (ab.hasRightChild()) {
			return total += this.contarUnicosHijos(ab.getRightChild());
		}
		
		return total;
		
	}

	public boolean encontrarN (BinaryTree<Integer> ab, int n) {
		
		if (ab.isEmpty()) return false;
		
		int izq = -1, der = -1;

		if (ab.getData() != n) {
			if (ab.hasLeftChild()) {
				this.encontrarN(ab.getLeftChild(), n);
			}
			if (ab.hasRightChild()) {
				this.encontrarN(ab.getRightChild(), n);
			}
		}
		// Cuando encuentro el nodo n, este else hace lo que tiene que hacer y despues la condicion se cuenta/controla bien.
		//El problema es que la recursion sigue porque no la estoy cortando al encontrar n y return izq > der devuelve por el ultimo nodo recorrido,
		// que no tiene nada que ver con la busqueda que ya se hizo en los subarboles de n.
		else {
			
			//System.out.println("encontre a: " + ab.getData()); //debug
			
			if (ab.hasLeftChild()) {
				izq = this.contarUnicosHijos(ab.getLeftChild());
			}

			if (ab.hasRightChild()) {
				der = this.contarUnicosHijos(ab.getRightChild());
			}
			
			System.out.println("resultado que esperamos: " + (izq > der));
		}
	
		return izq > der;
	}
	
	public boolean encontrarN_V2 (BinaryTree<Integer> ab, int n) {
		
		if (ab.isEmpty()) return false;

		if (ab.getData() == n) {
			int izq = -1, der = -1;
			
			if (ab.hasLeftChild()) {
				izq = this.contarUnicosHijos(ab.getLeftChild());
			}

			if (ab.hasRightChild()) {
				der = this.contarUnicosHijos(ab.getRightChild());
			}
			
			return izq > der;
		}
		
		//Si nodo != n, se sigue buscando y se retorna lo que corresponda a la instancia.
		// No entiendo igual si anda bien y porque

		if (ab.hasLeftChild()) {
			return this.encontrarN_V2(ab.getLeftChild(), n);
		}

		if (ab.hasRightChild()) {
			return this.encontrarN_V2(ab.getRightChild(), n);
		}

		return false;
	}
	
	public boolean isLeftTree (int num) {
		
		//return this.encontrarN(this.arbol, num);
		return this.encontrarN(this.arbol, num);
	}
	
	/*
	 * Recorrido en profundidad. 
	 * Mientras no llegamos al "nodo == num", seguimos recorriendo.
	 * Si llegamos a "nodo == num" --> mandamos subArb izquierdo y derecho a:
	 * - contar raices de que cumplan con la condicion (que tengan un solo un hijo).
	 */
	
	public static void main(String[] args) {
		BinaryTree<Integer> arb = arbolesEjemplo.arbol_Integers_B();
		
		ej7ParcialArboles ab = new ej7ParcialArboles(arb);
		
		System.out.println(ab.isLeftTree(25)); // deberia retornar true
		System.out.println(ab.isLeftTree(0)); // deberia retornar false
		System.out.println(ab.isLeftTree(10)); // deberia retornar false
		System.out.println(ab.isLeftTree(32)); // deberia retornar false
	}
}
