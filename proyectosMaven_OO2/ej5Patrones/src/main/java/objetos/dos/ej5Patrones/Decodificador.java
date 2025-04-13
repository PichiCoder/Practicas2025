package objetos.dos.ej5Patrones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Decodificador {
	private List<Pelicula> grillaPeliculas;
	private List<Pelicula> peliculasYaReproducidas;
	private Sugerencia sugerencia;
	
	public Decodificador(List<Pelicula> grillaPeliculas, Sugerencia sugerencia) {
		super();
		this.grillaPeliculas = grillaPeliculas;
		this.sugerencia = sugerencia;

		this.peliculasYaReproducidas = new ArrayList<Pelicula>();
	}
	
	public void agregarAGrilla(Pelicula p) {
		this.grillaPeliculas.add(p);
	}
	
	public void verPelicula(Pelicula p) {
		//podriamos representa algo que indique que se muestra la pelicula ? (no se pide)
		this.peliculasYaReproducidas.add(p);
	}
	
	public void setSugerencia (Sugerencia s) {
		this.sugerencia = s;
	}
	
	public String sugerir3Peliculas () {
	
		return this.sugerencia.sugerir3pelis(grillaPeliculas, peliculasYaReproducidas)
	               .stream()
	               .map(p -> p.getTitulo())
	               .collect(Collectors.joining(", "));
	}

}
