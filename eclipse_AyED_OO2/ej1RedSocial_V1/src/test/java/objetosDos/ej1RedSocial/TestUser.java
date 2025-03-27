package objetosDos.ej1RedSocial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestUser {
	User p = new User("pepe");

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testTwitear() {
		String body0 = "";
		
		String bodyOk = "que objetoso me encuentro";
		
		String body281 = "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890"
				+ "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890"
				+ "12345678901234567890123456789012345678901234567890123456789012345678901234567890A";
		
		assertTrue(p.twitear(bodyOk));
		assertFalse(p.twitear(body281));
		assertFalse(p.twitear(body0));
	}

}
