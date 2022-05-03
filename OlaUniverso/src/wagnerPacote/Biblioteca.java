/**
 * 
 */
package wagnerPacote;

/**
 * @author wagner
 * email: wagnerrc9999@gmail.com
 *
 */
import java.util.Scanner;
public class Biblioteca {

public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);

double livro1;
double livro2;

System.out.println("Entre com o Valor do Primeiro Livro:");
livro1 = entrada.nextDouble();
System.out.println("Entre com o Valor do Segundo Livro");
livro2 = entrada.nextDouble();

double totallivro = livro1 + livro2;
System.out.println("O Preço Total é "+ totallivro);

if (livro1 ==50) { System.out.println("Livro com um bom preço!\n");}
if (totallivro <=100) { System.out.println("Boa escolha!!!!");}
else { System.out.println("Livro esta caro");}

entrada.close();
}}
