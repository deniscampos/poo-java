package anagrama;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testes {

	@Test
	public void test() {
		assertTrue(Anagrama.comparar("",""));
		assertTrue(Anagrama.comparar(" ",""));
		assertTrue(Anagrama.comparar("a","a "));
		assertFalse(Anagrama.comparar("a ","b"));
		assertTrue(Anagrama.comparar("ab","ab"));
		assertTrue(Anagrama.comparar("ab","a b"));
		assertTrue(Anagrama.comparar("b a","a b"));
		assertTrue(Anagrama.comparar("ab", "ba"));
		assertFalse(Anagrama.comparar("ba", "a"));
		assertTrue(Anagrama.comparar("Alan Smithee", "The alias men"));		
	}

}
