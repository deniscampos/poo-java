package anagrama;

import java.util.ArrayList;
import java.util.List;

public class Anagrama {

	public static boolean comparar(String palavra1, String palavra2) 
	{
		palavra1 = palavra1.toLowerCase().replaceAll(" ", "");
		palavra2 = palavra2.toLowerCase().replaceAll(" ", "");
		
		List<Character> primeiraLista = new ArrayList<Character>();
		List<Character> segundaLista = new ArrayList<Character>();
		
		for(char c : palavra1.toCharArray())  primeiraLista.add(c);
		for(char c : palavra2.toCharArray())  segundaLista.add(c);
		
		return primeiraLista.containsAll(segundaLista) && primeiraLista.size() == segundaLista.size();
	}
}