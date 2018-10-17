package practica6_ej6;

public class testMain {


/*
b) Programar un procedimiento main(), que cree dos horas inicializadas y uno que
no lo esté. Se deberán sumar los dos objetos inicializados, dejando el resultado
en el objeto no inicializado. Por último, se pide visualizar el valor resultante.
 * 
 */
public static void main(String[] args) {

	Hora hora1 = new Hora(5,3,25);
	Hora hora2 = new Hora(8,59,31);
	Hora hora3 = new Hora();

	hora3 = Hora.sumarHoras(hora1 , hora2);
	System.out.println(hora3.mostrarHora());
	
	}
	
}
