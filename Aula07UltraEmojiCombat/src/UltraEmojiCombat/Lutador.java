package UltraEmojiCombat;

public class Lutador {
	//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	
	//Métodos Publicos				//AQUI SE USA getPeso, getNacionalidade, get..., porque o metodo get de cada coisa é simplesmente o resultado 
	public void apresentar () {		// do atributo, entao é a mesma coisa de colocar this.peso, porem com a seguranca que ninguem vai mudar :) !
		System.out.println("CHEGOU A HORA! Apresentamos o Lutador " + getNome());
		System.out.println("Diretamente de " + getNacionalidade());
		System.out.println(getIdade() + " anos");
		System.out.println(getAltura() + " m de altura");
		System.out.println("Pesando " + getPeso() + "Kg");
		System.out.println("Ganhou " + getVitorias());
		System.out.println("Perdeu " + getDerrotas());
		System.out.println("Empatou " + getEmpates());
	}
	public void status() {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
	}
	public void ganharLuta() {
		this.setVitorias(getVitorias() + 1);
	}
	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}
	public void empatarLuta () {
		this.setEmpates(getEmpates() + 1); 
	}
	//Métodos Especiais
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);	//Unica linha diferente, devido a condicao dentro de setPeso, a qual vinculamos com a variavel Categoria!
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();  		//Chamando o setCategoria para usarmos as condicoes e classificar os lutadores
	}
	public String getCategoria() {
		return categoria;
	}								//metodo abaixo (setCategoria) irá funcionar apenas dentro do setPeso, por isso é um metodo privado. Visando seguranca
	private void setCategoria() {   // nao sao todas as pessoas que podem mexer no setCategoria
		if (this.getPeso() < 52.2) {
			this.categoria = "Inválido";					//Criando as condiçoes para definir a categoria dos lutadores.
		} else if (this.getPeso() <= 70.3) {				//usando o this.getPeso(), ao inves de this.peso para me acostumar a usar metodos ao inves de atributos por questao de seguranca de dados
			this.categoria = "Leve";			
		} else if (this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		} else if (this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
}
