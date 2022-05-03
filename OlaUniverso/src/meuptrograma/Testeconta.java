package meuptrograma;

public class Testeconta {
	
	public static void main(String[] args) {
	
    Conta cc = new Conta();
    cc.saldo = 50.0;
    cc.agencia = 589;
    cc.numero = 879;

    cc.deposito(500);

    System.out.println( cc.Verificar() );

}}
