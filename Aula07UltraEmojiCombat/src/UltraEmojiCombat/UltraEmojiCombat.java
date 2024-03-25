package UltraEmojiCombat;

public class UltraEmojiCombat {

	public static void main(String[] args) {
		Lutador l[] = new Lutador [6]; //Criando 6 lutadores de forma simples e compacta, criando uma array cada um em um espaco
		
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.9f, 140, 20, 3);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.56f, 70.9f, 120, 20, 4);
		l[3] = new Lutador("Dead code", "Australia", 29, 1.68f, 68.9f, 958,450, 3);
		l[4] = new Lutador("UFOCobol", "Brasil", 42, 1.68f, 68.9f, 14, 500, 2);
		l[5] = new Lutador("Nerdaart", "Espanha", 29, 1.68f, 68.9f, 1, 2, 356);
		
		// l[3].setCategoria("Pesado"); nao pode ser alterado devido ao metodo ser privado
		l[3].setPeso(10f);		//adicionando peso para testar as condicoes
		l[3].status();	//Isso facilita usar os metodos para cada posicao na Array, simplificando o codigo.

	}

}
