package objetos.dos.ej5Patrones;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private int anioEstreno;
	private double puntaje;
	private List<Pelicula> pelisSimilares;
	
	public Pelicula(String titulo, double puntaje, int anioEstreno) {
		super();
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		this.pelisSimilares = new ArrayList<Pelicula>();
	}
	
	//Esta bien hacer esto ? me estoy metiendo con la coleccion de otro objeto...
	public void addPeliculaSimilar(Pelicula p) {
	    if (!pelisSimilares.contains(p)) {
	        pelisSimilares.add(p);
	        p.addPeliculaSimilar(this);
	    }
	}
	
	public boolean soySimilarA(Pelicula p) {
		return pelisSimilares.contains(p);
	}
	
	public boolean soySimilarAAlgunaDe(List<Pelicula> pelis) {
		return pelis.stream()
				.anyMatch(p -> this.soySimilarA(p));
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAnioEstreno() {
		return anioEstreno;
	}

	public Double getPuntaje() {
		return puntaje;
	}

}
