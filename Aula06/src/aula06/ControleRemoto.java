package aula06;
// Implementando a interface do Controlador usando (Implements + nome da interface)
public class ControleRemoto implements Controlador {
	
	//atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Metodos Especiais
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	//override significa subescrever
	public void ligar() {
		this.setLigado(true);
	}

	public void desligar() {
		this.setLigado(false);
	}

	public void abrirMenu() {		//estudar esse metodo, nao me ficou claro
		System.out.println("Está Ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i+=10) {
			System.out.print("[]");
		}
	}

	public void fecharMenu() {
		System.out.println("Fechando Menu...");
	}

	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 1);
		}
	}

	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 1);
		}
	}

	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(30);
		}
	}

	public void play() {
		if (this.getLigado() && !(this.getTocando())) {		//o sinal ! na condicao do if significa NAO, "se está ligado e NAO está tocando"
			this.setTocando(true);
		}
	}

	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("Não consegui pausar!");
		}
	}
}
