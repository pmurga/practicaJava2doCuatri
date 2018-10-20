package practica7_ej4;

import java.util.ArrayList;

/*
 * Proveedor: nombre, direccion, ciudad, codigoVendedor, saldo, fax, telefono,
descuentos, leer(), mostrar(), pagarFactura()
 */

public class Proveedor extends Persona{
	
	private String codigoVendedor;
	private double saldo;
	private String fax;
	private int telefono;
	private ArrayList <Double> descuentos = new ArrayList<Double>();
		
	Proveedor(){
		super();
		this.codigoVendedor = "00";
		this.saldo = 0;
		this.fax = "";
		this.telefono = 0;
	}
	
	Proveedor(String nombre, String direccion, String ciudad, String codigoVendedor, double saldo, String fax, int telefono,  ArrayList<Double> descuentos){	
		super (nombre, direccion, ciudad);
		this.codigoVendedor = codigoVendedor;
		this.saldo = saldo;
		this.fax = fax;
		this.telefono = telefono;
		this.descuentos = descuentos;
	}
	
	@Override
	protected void leer() {
		
	}
	
	protected void mostrar() {
		
	}

	protected String getCodigoVendedor() {
		return codigoVendedor;
	}

	protected void setCodigoVendedor(String codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	protected String getFax() {
		return fax;
	}

	protected void setFax(String fax) {
		this.fax = fax;
	}

	protected int getTelefono() {
		return telefono;
	}

	protected void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	protected ArrayList<Double> getDescuentos() {
		return descuentos;
	}

	protected void setDescuentos(ArrayList<Double> descuentos) {
		this.descuentos = descuentos;
	}
	

}
