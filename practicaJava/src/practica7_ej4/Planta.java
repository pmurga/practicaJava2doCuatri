package practica7_ej4;

import java.util.ArrayList;

/*
 * Planta: datosEmpleado, salario, anosAntiguedad, pagarSalario()
 */

public class Planta {
	
	private ArrayList <String> datosEmpleado = new ArrayList<String>();
	private double salario;
	private int anosAntiguedad;
	
	Planta(){
		
		this.salario = 0;
		this.anosAntiguedad = 0;
	}
	
	Planta(ArrayList <String> datosEmpleado , double salario, int anosAntiguedad ){
		
		this.datosEmpleado = datosEmpleado;
		this.salario = salario;
		this.anosAntiguedad = anosAntiguedad;
	}

	protected ArrayList<String> getDatosEmpleado() {
		return datosEmpleado;
	}

	protected void setDatosEmpleado(ArrayList<String> datosEmpleado) {
		this.datosEmpleado = datosEmpleado;
	}

	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}

	protected int getAnosAntiguedad() {
		return anosAntiguedad;
	}

	protected void setAnosAntiguedad(int anosAntiguedad) {
		this.anosAntiguedad = anosAntiguedad;
	}
	
	protected void pagarSalario() {
		
	}
	

}
