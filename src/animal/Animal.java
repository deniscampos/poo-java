package animal;

public class Animal {
	private String raca;
	private double peso;
	private int idade;
	
	public Animal(String raca){
		this.raca = raca;
	}
	
	public String getRaca(){
		return raca;
	}
	
	public double getPeso(){
		return peso;
	}
	
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public String fazerBarulho(String som){
		return som;
	}
}
