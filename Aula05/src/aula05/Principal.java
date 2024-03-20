package aula05;


public class Principal {

	public static void main(String[] args) {
		
	ContaBanco p1 = new ContaBanco();		//Teste de abrir conta com o metodo CONTA CORRENTE, recebendo de inicio R$50,00
	p1.setNumConta(1111);
	p1.setDono("Beto");
	p1.abrirConta("CC");
	
	
	ContaBanco p2 = new ContaBanco();		//Teste 2
	p2.setNumConta(2222);
	p2.setDono("Cristina");
	p2.abrirConta("CP");
	
	p1.depositar(100);						//Usando o metodo da classe ContaBanco depositar
	p2.depositar(500);
	
	p2.sacar(100);							//Saque
	p2.sacar(1000);                         //Teste da variavel maior que tenho no saldo (Saldo insuficiente para saque)
	
	p1.estadoAtual();
	p2.estadoAtual();
	
	}	
}
	