/**
 * 
 */
package wagnerPacote;

import java.util.Scanner;

/**
 * @author wagner
 *
 */
public class ParOuImpar {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			;
			Scanner tecla = new Scanner(System.in);
			System.out.print("Digite um Número.");
			
			int num = tecla.nextInt();
			if (num%2==0) {System.out.print("  Número PAR");}
			else {System.out.print("  Número IMPAR");}
	}

}

