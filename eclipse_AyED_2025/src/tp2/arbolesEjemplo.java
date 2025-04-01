package tp2;

public class arbolesEjemplo {
	
	public static BinaryTree <Integer> arbolIntegersTeoria () {
		BinaryTree<Integer> ab = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(25);
		
		hijoIzquierdo.addLeftChild(new BinaryTree<Integer>(10));
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(32));
		
		BinaryTree<Integer> hijoDerecho= new BinaryTree<Integer>(78);
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		
		return ab;
	}
}
