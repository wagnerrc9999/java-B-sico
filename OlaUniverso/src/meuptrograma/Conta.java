/**
 * 
 */
package meuptrograma;

/**
 * @author wagner
 *
 */
public class Conta {
	int agencia;
	int numero;
	double saldo;
	// construtor de classe.
	public Conta(int agencia, int numero, double saldo) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	public Conta() {
		// TODO Auto-generated constructor stub
	}

	//metodo
	public void deposito(double valor) {
	    this.saldo = this.saldo + valor;
	    //this.saldo += valor; 
	    }

	public void retirar(double valor) {
	    this.saldo = this.saldo - valor;
	    //this.saldo -=valor;
	    }
	public double Verificar() {
	    return this.saldo;
	}}
	
	

