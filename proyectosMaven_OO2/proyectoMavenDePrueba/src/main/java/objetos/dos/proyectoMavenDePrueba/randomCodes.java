package objetos.dos.proyectoMavenDePrueba;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class randomCodes {

    static List<String> words;
    private Abstracta abs;
    
    public long totalCharactersCount(HijaDeAbstracta abc) {
        long count = 1;
        
        abs = abc;
        
    	return count;
	}
    

    public static long calculateAvgLength() {
    	long avgLength = words
                        .stream()
                        .mapToLong(w -> w.length())
                        .sum() / words.size(); // div por 0 = error en ejec.
 	    return avgLength;
	}
    public static void main(String[] args) {
    	words = new ArrayList<String>();
    	
    	words.add("pepe"); words.add("pi"); words.add("po");
    	
    	System.out.println(calculateAvgLength());
    }
}
