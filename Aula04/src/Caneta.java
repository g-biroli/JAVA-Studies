public class Caneta {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	 // Metodo Construtor apenas public + nome da classe
	public Caneta(String m, String c, float p) {
	    this.modelo = m;
	    this.cor = c;
	    this.setPonta(p);
	    this.tampar();
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo (String m) {
		this.modelo = m;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta (float p) {
		this.ponta = p;
	}
	public void tampar () {
		this.tampada = true;
	}
	public void destampar () {
		this.tampada = false;
	}
	public void status () {
		System.out.println("Sobre a caneta: ");
		System.out.println("Modelo: "+ this.modelo);			
		System.out.println("Ponta: "+ this.ponta);
		System.out.println("Esta caneta esta: "+ this.tampada);
		System.out.println("A cor dessa caneta é: "+ this.cor);
	} 	
}
