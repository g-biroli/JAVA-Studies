public class ContaBanco {

	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//Metodos personalizados
	public void estadoAtual() {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	//Método abrir conta. Recordar que o enunciado da a especificaçao se for CC ganha 50 saldo e CP 150 saldo
	public void abrirConta (String t) {
		this.setTipo(t);
		this.setStatus(true);
		if ("CC".equals(t)) {
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Seja bem vindo, conta aberta com sucesso!");
	}
		//Conta só pode ser fechada caso o saldo seja = 0
	public void fecharConta () {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada pois tem débito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	public void depositar (float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}
	}
	public void sacar (float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {	// logica para saber se o cliente tem mais saldo do que ele quer sacar "V" variavel do saque
				this.setSaldo(this.getSaldo() - v);   	//na logica o getSaldo é o que ja tem na conta, já que ele retorna o saldo (funcao get e set abaixo)
				System.out.println("Saque realizado");// e setSaldo é o saque que o cliente está efetuando
			} else {
			System.out.println("Saldo insuficiente para saque");		
			}
		}else {
			System.out.println("Impossível sacar de uma conta fechada");
		}
	}
	public void pagarMensal () {		//mensalidade da conta CONTA CORRENTE 12/mes e CONTA POUPANCA 20/mes
		int v = 0;
		if (this.getTipo() == "CC") {
			v =12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossivel pagar uma conta fechada!");
		}
	}
	//Métodos Especiais
	//Usando o construtor para criar um padrao de conta. Então quando uma conta for criada começará com saldo 0 e status: falso
	
	public ContaBanco () {
		this.setSaldo(0);		
		this.setStatus(false);	//t	
	}
	
	//metodos get and setters. Importantes para seguranca dos dados!!!
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float b) {
		this.saldo = b;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}	
}