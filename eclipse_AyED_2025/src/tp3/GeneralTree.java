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
			
		if (this.hasChildren()) this.getChildren().get(0).inOrder();
		
		System.out.println(this.getData());
		
		for (int i=1; i < this.getChildren().size(); i++) {
			this.getChildren().get(i).inOrder();
		}
		
	}
	
	// ====================== ejercicio 3 ======================
	
	public int calcAltura(GeneralTree<T> ab) {
		int miAltura = 0;
		
		if (ab.hasChildren()) miAltura++;
		
		for (GeneralTree<T> child : ab.getChildren()) {
			miAltura += child.altura();
		}
		
		return miAltura;
	}
	
	// devuelve la altura del árbol, es decir, la longitud del camino más largo desde el nodo raíz hasta una hoja.
	public int altura() {
		int miAltura = 0, alturaHijo;
		
		if (this.hasChildren()) miAltura++;
		
		for (GeneralTree<T> child : this.getChildren()) {
			alturaHijo = child.altura();
			if (miAltura <= alturaHijo) miAltura = alturaHijo + 1;
		}
		
		return miAltura;
	}
	
	// devuelve la profundidad o nivel del dato en el árbol. El nivel de un nodo es la longitud del único camino de la raíz al nodo.
	private int buscarDato(T dato, int nivelActual) {
		int res = -1, aux = -1;
		
		if (!this.getData().equals(dato)) {
			
			nivelActual++;
			for (GeneralTree<T> child : this.getChildren()) {
				res = child.buscarDato(dato, nivelActual);
				if (res != -1) aux = res;
			}

		}
		
		else {
			return nivelActual;
		}
		
		return aux;
		
	}
	
	public int nivel(T dato){
		if (!this.isEmpty())
			return buscarDato(dato, 0);
		return -1;
	}


	// la amplitud (ancho) de un árbol se define como la cantidad de nodos que se encuentran en el nivel que posee la mayor cantidad de nodos.
	public int ancho(){
		
		return 0;
	}
}
