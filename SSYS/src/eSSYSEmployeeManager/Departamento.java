/**
 * 
 */
package eSSYSEmployeeManager;

/**
 * @author wagner
 *
 */

// Importando
import java.util.Scanner;
import java.io.Serializable;
import java.util.ArrayList;


// Clases e declarações
public class Departamento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Cod_Dep;
	private class Departamento();
	private String Dep_Nome;
	ArrayList<Funcionario> ListFunc;
	
	
	// Construtores
	public Departamento () {ListaFunc = new ArrayList();}
	
	public Departamento(int Cod_Dep, String Dep_nome) {
		this.Cod_Dep = Cod_Dep;
		this.Dep_Nome = Dep_nome;
		ListFunc = new ArrayList();}
	
	public int getCod_Dep( ) {return Cod_Dep;}
	public void setCod_Dep (int Cod_Dep) {this.Cod_Dep = Cod_Dep;}
	
	
	//Criando metodo para manipular o array.
	public ArrayList<Funcionario> getListFunc () { return ListFunc; }
	public void setListFunc(ArrayList<Funcionario> ListFunc)
	{this.ListaFunc = ListFunc;}
	
	//Adicionando Funcionario.
	public void Add_Func(Funcionario Fun) {
	Fun.setDepartamento(this);
	ListFunc.add(Fun);}
}
