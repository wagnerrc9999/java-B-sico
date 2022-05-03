package wagnerPacote;

// importando
import java.util.Scanner;


public class Calculadora {
	
	public static void main(String[] args) {

	// variaveis.

	int num1;
	int num2;

	// entrada;
	Scanner input = new Scanner (System.in);
	
	System.out.println("Digite Dois Números.");


	System.out.println("Qual o Primeiro Número ?");
	num1 = input.nextInt();
	System.out.println("Qual o Segundo Número ?");
	num2 = input.nextInt();

	System.out.println("Soma é igual a:"+(num1+num2));
	System.out.println("Subtração é igual a:"+(num1-num2));
	System.out.println("Multiplicação é igual a:"+ (num1*num2));
	System.out.println("Divisão é igual a:"+(num1/num2));
	}
	
}
