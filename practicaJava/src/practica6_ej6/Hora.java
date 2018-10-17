package practica6_ej6;

/*
 * 
 * a) Implemente la clase Hora que contenga miembros datos separados para
almacenar horas, minutos y segundos. Un constructor inicializará estos datos en
0 y otro a valores dados. Una función miembro deberá visualizar la hora en
formato hh:mm:ss. Otra función miembro sumará dos objetos de tipo hora,
retornando la hora resultante. Realizar otra versión de la suma que asigne el
resultado de la suma en el primer objeto hora.
*/


public class Hora {
	
	private int hr;
	private int min;
	private int seg;
	
	public Hora() {
		this.hr = 00;
		this.min = 00;
		this.seg = 00;
	}
	
	public Hora(int hr , int min , int seg) {
		this.hr = hr;
		this.min = min;
		this.seg = seg;
		horaValida();
	}
	
	private void horaValida() {
		
		if (this.seg > 59) {
			this.seg -= 60;
			this.min ++;
		}else {
			if (this.seg < 0) {
				this.seg = 0;
			}
		}
		
		if (this.min > 59) {
			this.min -= 60;
			this.hr ++;
		}else {
			if (this.min < 0) {
				this.min = 0;
			}
		}

		if (this.hr > 23) {
			this.hr = 0;
		}else {
			if (this.hr < 0) {
				this.hr = 0;
			}
		}
		
	}
	
	
	public void sumarHoras(Hora Haux) {
		
		this.hr += Haux.getHr();
		this.min += Haux.getMin();
		this.seg += Haux.getSeg();
		horaValida();	
		
	}
	
	static public Hora sumarHoras(Hora H1 , Hora H2) {
		
		Hora H3 = new Hora();
		H3.sumarHoras(H1);
		H3.sumarHoras(H2);
		return H3;
		
	}
	
	private String normalizarHora() {
		
		String aux;
		
		if (this.hr < 10) {
			aux = "0" + this.getHr() + ":";		
		}else {
			aux = this.getHr() + ":";	
		}
		
		if (this.min < 10) {
			aux += "0" + this.getMin() + ":";		
		}else {
			aux += this.getMin() + ":";
		}
		
		if (this.seg < 10) {
			aux += "0" + this.getSeg();		
		}else {
			aux += this.getSeg();
		}
		return aux;
		
	}
	
	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}

	String mostrarHora(){
		
		String respuesta = 	normalizarHora();
		return respuesta;
		
	}
	


}

