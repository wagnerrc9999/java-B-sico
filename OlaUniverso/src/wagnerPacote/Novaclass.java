/**
 * 
 */
package wagnerPacote;

/**
 * @author wagner
 *
 */
import java.util.Scanner;
public class Novaclass {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		//Entrada do nome Do Aluno.
		System.out.println("Bem Vindo a Loja: ");
		System.out.println("Qual é seu nome ? ");
		String nome = teclado.nextLine();

		//Entrada Da Nota Do Preço.
		System.out.println("Bem vindo "+ nome);
		
		System.out.println("Qual o Preço do Produto");
		float nota = teclado.nextFloat();
		System.out.format("O preço é %.2f \n", + nota);
		
		if (nota >= 10) { System.out.println("Não Vendemos Produtos Nesse Preço, Senhor "+nome);}
		else {System.out.println("òtimo Compra!!!!");}
		teclado.close();

	}

}
