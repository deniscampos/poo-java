package animal;

public class Cachorro extends Animal {
	private String nome;
	
	public Cachorro(String raca) {
		super(raca);

	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Labrador");
		dog.setNome("Jack");
		
		System.out.println(dog.fazerBarulho("ERRRR..."));
		System.out.println(dog.fazerBarulho("Au au"));
	}
}