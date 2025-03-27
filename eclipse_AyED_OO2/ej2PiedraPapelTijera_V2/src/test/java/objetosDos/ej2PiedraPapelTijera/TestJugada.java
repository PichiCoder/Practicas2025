package objetosDos.ej2PiedraPapelTijera;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJugada {
	
	private Jugada Piedra, Papel, Tijera, Spock, Lagarto;
	
	@BeforeEach
	void setUp() throws Exception {
		Piedra = new Piedra();
		Tijera = new Tijera();
		Papel = new Papel();
		Spock = new Spock();
		Lagarto = new Lagarto();
	}

	@Test
	void testPiedra() {
		assertEquals("Gana", Piedra.jugarContra(Tijera));
		assertEquals("Empate", Piedra.jugarContra(Piedra));
		assertEquals("Pierde", Piedra.jugarContra(Spock));
		
		assertEquals("Pierde", Piedra.jugarContra(Papel));
	}
	
	@Test
	void testPapel() {

	}

}
