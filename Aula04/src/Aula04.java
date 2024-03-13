
public class Aula04 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("nic", "amarelo", 0.4f);
		c1.status();
		//c1.setModelo("BIC");		// SEGURANCA DOS DADOS:
		//c1.modelo = "BIC";		//Isso so pode ser feito se o atributo for public, caso contrario dará erro.
		
		//c1.setPonta(0.5f);
		//c1.getPonta = 0.5;		//Se comprova com o atributo ponta que é privado. Se priva atributos, metodos por conta da seguranca dos dados.
		
	}

}
