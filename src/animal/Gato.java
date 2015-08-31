package animal;

public class Gato extends Animal {

	private String nome;
	
	public Gato(String raca) {
		super(raca);

	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Siames");
		dog.setNome("Mel");
		
		System.out.println(dog.fazerBarulho("Miauuu!"));
	}

}
