package AlquilerCoches;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import AlquillerC.Alquiler;

//test

@RunWith (Parameterized.class)

public class TestReserva {
	
	private int PrecioDiario;//Esses atributos nao recebem nenhum valor, apenas desmonstra as variaveis que usara no exercicio
	private int BonoDescuento;
	private int NumeroDias;
	private int PrecioTotal;
	
public TestReserva (int PrecioDiario, int BonoDescuento, int NumeroDias, int PrecioTotal) {
	
	this.PrecioDiario= PrecioDiario;
	this.BonoDescuento= BonoDescuento; 			//Criando as variaveis de cada ATRIBUTO. Se cria as variaveis dos atributos acima, agora se pode usar
	this.NumeroDias= NumeroDias;		// a variavel para fazer o teste
	this.PrecioTotal= PrecioTotal;
}
@Parameters
public static Collection<Object[]> datos(){
	
	return Arrays.asList(new Object[][] {
	{12,34,5,26}, {12,34,-5,-1}, {3,3,1,8}
	}
	);
}
public void TestReservarCoche() {
	
	Alquiler reserva= new Alquiler(PrecioDiario, BonoDescuento);
	
	int precio= reserva.ReservarCoche(NumeroDias);
	
	assertEquals("Error los precios no son iguales",PrecioTotal , precio);

}
}

