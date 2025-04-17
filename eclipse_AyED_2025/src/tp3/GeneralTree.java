package tp3;

import java.util.LinkedList;
import java.util.List;

import tp1.Queue;

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
	
	public void porNiveles() {
		Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		
		GeneralTree<T> arbol_aux;
		cola.enqueue(this);
		cola.enqueue(null);
		
		
		while (!cola.isEmpty()) {
			arbol_aux = cola.dequeue();
			
			if (arbol_aux != null) {
				
				System.out.println(arbol_aux.getData());
				
				if (arbol_aux.hasChildren()) {
					for (GeneralTree<T> child: arbol_aux.getChildren()) {
						cola.enqueue(child);
					}
				}
			}
			else {
				if (!cola.isEmpty()) {
					cola.enqueue(null);
			
				}
			}
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
		int amplitud = 0, amplitudNivelActual = 0;
		Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		
		GeneralTree<T> arbol_aux;
		cola.enqueue(this);
		cola.enqueue(null);
		
		
		while (!cola.isEmpty()) {
			arbol_aux = cola.dequeue();
			
			if (arbol_aux != null) {
				
				if (arbol_aux.hasChildren()) {
					for (GeneralTree<T> child: arbol_aux.getChildren()) {
						cola.enqueue(child);
						amplitudNivelActual++;
					}
				}
			}
			else {
				if (!cola.isEmpty()) {
					cola.enqueue(null);
					if (amplitudNivelActual > amplitud) 
						amplitud = amplitudNivelActual;
					amplitudNivelActual = 0;
			
				}
			}
		}
		
		return amplitud;
	}
	
}
