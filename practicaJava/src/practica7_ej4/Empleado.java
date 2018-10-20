package practica7_ej4;

/*
 * Empleado: nombre, direccion, ciudad, codigoEmpleado, horasExtras,
companiaSeguro, leer(), mostrar(), enviarSalario().
 */

public class Empleado extends Persona{
	
	private String codigoEmpleado;
	private double horasExtras;
	private String companiaSeguro;
	
	Empleado(){
		
		super();
		this.codigoEmpleado = "00";
		this.horasExtras = 0;
		this.companiaSeguro = "";
		
	}
	
	Empleado(String nombre, String direccion, String ciudad, String codigoEmpleado, int horasExtras, String companiaSeguro){
		
		super();
		this.codigoEmpleado = codigoEmpleado;
		this.horasExtras = horasExtras;
		this.companiaSeguro = companiaSeguro;
		
	}
	
	protected String getCodigoEmpleado() {
		return codigoEmpleado;
	}

	protected void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	protected double getHorasExtras() {
		return horasExtras;
	}

	protected void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}

	protected String getCompaniaSeguro() {
		return companiaSeguro;
	}

	protected void setCompaniaSeguro(String companiaSeguro) {
		this.companiaSeguro = companiaSeguro;
	}

	@Override
	protected void leer() {
		
	}
	
	@Override
	protected void mostrar() {
		
	}
	
	protected void enviarSalario() {
		
	}
	

}
