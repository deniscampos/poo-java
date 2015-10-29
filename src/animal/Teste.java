package animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Teste {

	@Test
	public void test() {
		List<Animal> animais= new ArrayList<Animal>();
		

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
		
		//System.out.println(v.estourar());
		//System.out.println(s.estourar());
		
		
		
		//CRIANDO ANIMAIS PARA ORDENAÇÃO POR NOME
		Gato gato1 = new Gato();
		gato1.setNome("Chico");
		gato1.setPeso(6.7);
		
		Gato gato2 = new Gato();
		gato2.setNome("Batatinha");
		gato2.setPeso(1.5);	
		
		Gato gato3 = new Gato();
		gato3.setNome("Felix");
		gato3.setPeso(4);	

		Gato gato4 = new Gato();
		gato4.setNome("Ajax");
		gato4.setPeso(6.1);
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setNome("Tchu tchu");
		cachorro1.setPeso(10);
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.setNome("Scooby");
		cachorro2.setPeso(9);
		
		Cachorro cachorro3 = new Cachorro();
		cachorro3.setNome("Zack");
		cachorro3.setPeso(12);
		
		animais.add(gato1);
		animais.add(gato2);
		animais.add(gato3);
		animais.add(gato4);
		animais.add(cachorro1);
		animais.add(cachorro2);
		animais.add(cachorro3);
		
		
		this.ordenarPorNome(animais);  // ORDENANDO POR NOME
		System.out.println("Ordenação por nome: " + animais);
		

		Collections.sort(animais); // ORDENANDO POR PESO
		System.out.println("Ordenação por peso: " + animais);
	}
	
	private void ordenarPorNome(List<Animal> animais) {
		ComparadorNomes comp = new ComparadorNomes();
		Collections.sort(animais, comp);
	}

}
