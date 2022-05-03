/**
 * 
 */
package wagnerPacote;

/**
 * @author wagner
 *
 */
public class Calculater {
	

public static void main(String[] args) {
  
    int Q = 240;
    int P = 120;

    int soma = Q + P;
    int sub = Q - P;
    int multiplica = Q * P;
    int divisao = Q / P;
    int resto = Q % P;

System.out.println("Resultado da adição: "+ soma);
System.out.println("Resultado da subtração: "+ sub);
System.out.println("Resultado da multiplicação: "+ multiplica);
System.out.println("Resultado da divisão: "+ divisao);
System.out.println("Resultado da módulo: "+ resto);

Q++;
System.out.println("Resultado do incremento de Q: " + Q);

P--;
System.out.println("Resultado do decremento de P: "+ P);

Q += 100;
System.out.println("Atribuição aditiva de Q: "+ Q);


}

}
