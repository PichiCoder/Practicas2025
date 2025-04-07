package tp2;

public class arbolesEjemplo {
	
	public static BinaryTree <Integer> arbol_Integers_A() {
		BinaryTree<Integer> ab = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(25);
		
		hijoIzquierdo.addLeftChild(new BinaryTree<Integer>(10));
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(32));
		
		BinaryTree<Integer> hijoDerecho= new BinaryTree<Integer>(78);
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		
		return ab;
	}
	
	public static BinaryTree <Integer> arbol_Integers_B() {
		BinaryTree<Integer> ab = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(25);
		
		BinaryTree<Integer> hijoIzquierdoDe25 = new BinaryTree<Integer>(10);
		hijoIzquierdoDe25.addLeftChild(new BinaryTree<Integer>(1)); //unica diferencia con arbol_Integers_A
		
		hijoIzquierdo.addLeftChild(hijoIzquierdoDe25);
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(32));
		
		BinaryTree<Integer> hijoDerecho= new BinaryTree<Integer>(78);
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		
		//hijoDerecho.addRightChild(new BinaryTree<Integer>(1)); 
		
		
		return ab;
	}
}
