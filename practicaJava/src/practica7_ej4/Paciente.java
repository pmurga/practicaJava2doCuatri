package practica7_ej4;

/*
Paciente: nombre, direccion, ciudad, codigoDiagnostico, telefono,
fechaNacimiento, leer(), mostrar(), enviarFactura().
 */

public class Paciente extends Persona {

	private int codigoDiagnostico;
	private int telefono;
	private String fechaNacimiento;
	
	
	Paciente(){
		super();
		this.codigoDiagnostico = 0;
		this.telefono = 0;
		this.fechaNacimiento ="00/00/0000" ;
	}
	
	Paciente(String nombre, String direccion, String ciudad , int codigoDiagnostico , int telefono , String fechaNacimiento){
		super(nombre, direccion, ciudad);
		this.codigoDiagnostico = codigoDiagnostico;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento ;
	}
	
	@Override
	protected void leer() {
		
	}
	
	@Override
	protected void mostrar() {
		
	}
	
	protected void enviarFactura() {
		
	}

	protected int getCodigoDiagnostico() {
		return codigoDiagnostico;
	}

	protected void setCodigoDiagnostico(int codigoDiagnostico) {
		this.codigoDiagnostico = codigoDiagnostico;
	}

	protected int getTelefono() {
		return telefono;
	}

	protected void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	protected String getFechaNacimiento() {
		return fechaNacimiento;
	}

	protected void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	
}
