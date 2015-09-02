package animal;

import org.junit.Test;

public class Teste {

	@Test
	public void test() {
		Gato g = new Gato();
		Cachorro c = new Cachorro();
		
		ManadaVirgula v = new ManadaVirgula();
		v.addAnimal(g);
		v.addAnimal(c);
		v.addAnimal(g);
		
		ManadaSustenido s = new ManadaSustenido();
		s.addAnimal(g);
		s.addAnimal(c);
		s.addAnimal(g);
		s.addAnimal(c);
		
		System.out.println(v.estourar());
		System.out.println(s.estourar());
	}

}
