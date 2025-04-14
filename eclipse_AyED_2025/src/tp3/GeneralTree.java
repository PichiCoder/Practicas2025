package tp3;

import java.util.LinkedList;
import java.util.List;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	// ====================== Recorridos simples ======================
	
	public void preOrder () {
		System.out.println(this.getData());
		
		for (GeneralTree<T> child : this.getChildren()) {
			child.preOrder();
		}
	}
	
	public void postOrder () {
		
		for (GeneralTree<T> child : this.getChildren()) {
			child.postOrder();
		}
		
		System.out.println(this.getData());
	}
	
	public void inOrder () {
		
		if (this.hasChildren()) 
			System.out.println(this.getChildren().get(0).getData());
		
		System.out.println(this.getData());
		
		for (int i=1; i < this.getChildren().size(); i++) {
					
			this.getChildren().get(i).inOrder();
		}
		
	}
	
	// ====================== ejercicio 3 ======================
	// devuelve la altura del árbol, es decir, la longitud del camino más largo desde el nodo raíz hasta una hoja.
	public int altura() {	 
		int alt = 1;
		
		for (GeneralTree<T> child : this.getChildren()) {
			return alt += child.altura();
		}
		
		return alt;
	}
	
	// devuelve la profundidad o nivel del dato en el árbol. El nivel de un nodo es la longitud del único camino de la raíz al nodo.
	public int nivel(T dato){
		return 0;
	}

	// la amplitud (ancho) de un árbol se define como la cantidad de nodos que se encuentran en el nivel que posee la mayor cantidad de nodos.
	public int ancho(){
		
		return 0;
	}
}
