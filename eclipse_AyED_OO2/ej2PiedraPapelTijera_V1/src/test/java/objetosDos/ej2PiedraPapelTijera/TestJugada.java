package objetosDos.ej2PiedraPapelTijera;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJugada {
	
	private Jugada Piedra, Papel, Tijera;
	
	@BeforeEach
	void setUp() throws Exception {
		Piedra = new Piedra();
		Tijera = new Tijera();
		Papel = new Papel();
	}

	@Test
	void testPiedra() {
		
		assertEquals("Ganado", Piedra.competeVersus(Tijera));
		assertEquals("Empate", Piedra.competeVersus(Piedra));
		assertEquals("Perdido", Piedra.competeVersus(Papel));
	}

}
