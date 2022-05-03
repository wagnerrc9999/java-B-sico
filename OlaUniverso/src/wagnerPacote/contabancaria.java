/**
 * 
 */
package wagnerPacote;

/**
 * @author wagner
 *
 */
// como enterer as classes java.
//codificador classe nome_da_clase
        public class contabancaria {
	
	int numero;
	int agencia;
	double saldo;
	
	public contabancaria (int numero, int agencia, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	public void depositar (double valor) {
		saldo = saldo + valor;
	}
	public void retirar (double valor) {
		saldo = saldo - valor;
	}
	public double verificarSaldo () {
		return saldo;
	}
}