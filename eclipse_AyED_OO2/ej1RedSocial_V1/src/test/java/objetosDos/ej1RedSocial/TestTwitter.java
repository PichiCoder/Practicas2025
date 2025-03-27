package objetosDos.ej1RedSocial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTwitter {
	
	Twitter T = new Twitter();
	
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void testAddUser() {
		User p = new User("pepe");
		assertTrue(T.addUser(p));
		
		User pp = new User("pepe");
		assertFalse(T.addUser(pp));
	}

}
