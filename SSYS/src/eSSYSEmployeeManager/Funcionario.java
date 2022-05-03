/**
 * 
 */
package eSSYSEmployeeManager;

/**
 * @author wagner
 *
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.Serializable;



public class Funcionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// entrada das variaveis.
	// atributos do Funcionario.
	private int Fun_Cod; // codigo do funcionario
	private String Fun_Nome; // Nome Do Funcionario
	private byte Fun_Idd; // Idade Do funcionario
	private Departamento Departamento; // departamento do Funcionario
	private float Fun_Salario; // Salario do Funcionario
	ArrayList<Funcionario> ListFunc; // Lista de funcionarios

	
	public Funcionario() {ListFunc = new ArrayList<Funcionario>();}

	public Funcionario(String[] args, int Fun_Cod, String Fun_Nome, float Fun_Salario, byte Fun_Idd, Departamento Departamento) {
		this.Fun_Cod = Fun_Cod;
		this.Fun_Nome = Fun_Nome;
		this.Fun_Idd = Fun_Idd;
		this.Departamento = Departamento;
		this.Fun_Salario = Fun_Salario;
		ListFunc = new ArrayList();}

	
	// MATRICULA CODIGO DO FUNCIONARIO. METODO GET E SET (Leitura e escrita do objeto privado )
		public int getFun_Coda() {return Fun_Cod;}
		public void setFun_Cod(int Fun_Cod) {this.Fun_Cod = Fun_Cod;}
	
	
	// SALARIO DO fUNCIONARIO METODO GET E SET (Leitura e escrita do objeto privado )
		public Float getFun_Salario() {return Fun_Salario;}
		public void setFun_Salario(int Fun_Salario) {this.Fun_Salario = Fun_Salario;}
	
	
	//NOME DO FUNCIONARIO METODO GET E SET. (Leitura e escrita do objeto privado )
		public String getFun_Nome() {return Fun_Nome;}
		public void SetFun_Nome(String Fun_Nome) {this.Fun_Nome = Fun_Nome;}
	
	//IDADE DO FUNCIONARIO METODO GET E SET. (Leitura e escrita do objeto privado )
		public byte getFun_Idd() {return Fun_Idd;}
		public void SetFun_Idd(byte Fun_Idd) {this.Fun_Idd = Fun_Idd;}
	
	//Departamento.
		public Departamento getDepartamento ( ) {return Departamento;}
		public void setDepartamento (Departamento Departamento) { this.Departamento = Departamento;}
	
	//Salario. Apagar esse se der errado.
	public void Fun_Salario() {}
	public Funcionario (float Fun_Salario) {this.Fun_Salario = Fun_Salario;}
}
