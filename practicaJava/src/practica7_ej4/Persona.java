package practica7_ej4;

/*
 * Persona: nombre, direccion, ciudad, leer(), mostrar().
Paciente: nombre, direccion, ciudad, codigoDiagnostico, telefono,
fechaNacimiento, leer(), mostrar(), enviarFactura().
Empleado: nombre, direccion, ciudad, codigoEmpleado, horasExtras,
companiaSeguro, leer(), mostrar(), enviarSalario().
Proveedor: nombre, direccion, ciudad, codigoVendedor, saldo, fax, telefono,
descuentos, leer(), mostrar(), pagarFactura()
Planta: datosEmpleado, salario, anosAntiguedad, pagarSalario()
Eventual: datosEmpleado, honorariosPorHora, pagarSalario()
*/

public class Persona {

	private String nombre;
	private String direccion;
	private String ciudad;
	
	Persona(){
		this.nombre = "";
		this.direccion = "";
		this.ciudad = "";
	}
	
	Persona(String nombre, String direccion, String ciudad){
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}
	
	protected void leer(){
		
	}
	
	protected void mostrar() {
		
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDireccion() {
		return direccion;
	}

	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	protected String getCiudad() {
		return ciudad;
	}

	protected void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
