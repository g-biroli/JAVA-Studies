package Aula09;

public class Pessoa {
	//atributos
	private String nome, sexo;
	private int idade;
	
	
	//metodos publicos
	
	public void fazerAniver() {
		this.idade = this.idade + 1;
	}

	//metodos especiais
	
	public Pessoa(String nome, String sexo, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
	
}
