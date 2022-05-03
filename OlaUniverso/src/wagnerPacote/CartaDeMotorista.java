/**
 * 
 */
package wagnerPacote;

/**
 * @author wagner
 *
 */

import java.util.Scanner;

public class CartaDeMotorista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor Sua Idade:");
		int num = entrada.nextInt ();
		
	//System.out.println("Bem Vindos a Auto-Escola SP Car ?");
	
	if (num >= 18) { System.out.println("Você tem idade para tirar sua carta.");}
	else {System.out.println("Infelismente você não tem idade para tirar sua carta..");}
	entrada.close();
		
	}

}
