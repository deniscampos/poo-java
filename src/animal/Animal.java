package animal;

public abstract class Animal {
	protected String raca;
	protected double peso;
	protected int idade;
	
	public String getRaca(){
		return raca;
	}
	
	public void setRaca(String raca){
		this.raca = raca;
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
	
	public abstract String fazerBarulho();
}
