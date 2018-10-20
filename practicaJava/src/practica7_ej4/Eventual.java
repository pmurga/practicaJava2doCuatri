package practica7_ej4;

import java.util.ArrayList;

//Eventual: datosEmpleado, honorariosPorHora, pagarSalario()

public class Eventual {

	private ArrayList <String> datosEmpleado = new ArrayList<String>();
	private double honorariosPorHora;
	
	Eventual(){
		
		super();
		this.honorariosPorHora = 0;
	}
	Eventual(ArrayList <String> datosEmpleado , double honorariosPorHora){
		
		super();
		this.datosEmpleado = datosEmpleado;
		this.honorariosPorHora = honorariosPorHora;
	}
	protected ArrayList<String> getDatosEmpleado() {
		return datosEmpleado;
	}
	protected void setDatosEmpleado(ArrayList<String> datosEmpleado) {
		this.datosEmpleado = datosEmpleado;
	}
	protected double getHonorariosPorHora() {
		return honorariosPorHora;
	}
	protected void setHonorariosPorHora(double honorariosPorHora) {
		this.honorariosPorHora = honorariosPorHora;
	}
	
}
