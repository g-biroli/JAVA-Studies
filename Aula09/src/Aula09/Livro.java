package Aula09;

public class Livro implements Publicacao{
	private String titulo, autor;
	private int totPaginas, pagAtual;
	private boolean aberto;
	private Pessoa leitor;		//juntando a classe Pessoa no projeto
	
	//metodos publicos
	
	public String detalhes() {
		return "Livro [titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, pagAtual=" + pagAtual
				+ "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + "\n, idade=" + leitor.getIdade() + "\n, sexo=" + leitor.getSexo() +"]";
	}

	//metodos especiais
	
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int p) {
		this.pagAtual = p;
	}

	@Override
	public void avançarPag() {
		this.pagAtual ++;
	}

	@Override
	public void voltarPag() {
		this.pagAtual --;
	}
	
	
}
