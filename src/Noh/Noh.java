package Noh;

public class Noh {
	public Object valor = null;
	public Noh proximo = null;
	
	public Noh(Object valor) {
		this.valor = valor;
	}
	
	public static void main(String[] args) {
		Noh cabeca= new Noh("String");
		cabeca.addConteudo(215);
		cabeca.addConteudo(new Noh(7));
		System.out.println(cabeca);
		
	}
	
	private void addConteudo(Object conteudo) {
		if (proximo == null) {
			proximo = new Noh(conteudo);
		} else {
			proximo.addConteudo(conteudo);
		}
	}
	
	@Override
	public String toString() {
		String string = "";
		
		string += valor;
		
		if(proximo != null) {
			string += ", " + proximo.toString();
		}

		return string;
	}
	

}