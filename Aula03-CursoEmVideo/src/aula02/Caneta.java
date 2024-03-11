package aula02;

public class Caneta {
	public String modelo;
	public String cor;		//atributos para caneta
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	void status() {
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Cor: "+ this.cor);			//metodo status para a caneta
		System.out.println("Ponta: "+ this.ponta);
		System.out.println("Carga atual em: "+ this.carga);
		System.out.println("Ela está tampada? "+ this.tampada);
	}

	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! Nao posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
	}
	
	protected void tampar () {
		this.tampada = true;
	}
	
	protected void destampar () {
		this.tampada = false;
	}
}
