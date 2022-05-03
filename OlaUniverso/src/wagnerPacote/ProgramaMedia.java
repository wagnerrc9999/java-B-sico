/**
 * 
 */
package wagnerPacote;

import java.util.Scanner;

/**
 * @author wagner
 * wagnerrc9999@yahoo.com
 */
public class ProgramaMedia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite Dois Valores para Calcular a Média das notas ");
		Scanner tecla = new Scanner(System.in);
		System.out.println("Digite o Primeiro Número: ");
		float num1 = tecla.nextFloat();
		System.out.println("Digite o Segundo Número: ");
		float num2 = tecla.nextFloat();
		float media = (num1+num2/2);
		System.out.println("Sua média foi " + media);

		if (media>6) {System.out.println("Parabens Você teve uma Boa nota!!!!");
		}
		else{System.out.println("Você precisa Estudar um pouco mais");
		}
		}
	}

