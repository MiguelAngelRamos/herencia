package herencia.ejercicio;

public class EjemploPersonas {

	public static void main(String[] args) {
		Estudiante  estudiante = new Estudiante("Pedro", "15-10-2002", 1644);
		
		// metodos de la clase padre persona usado por la clase hija estudiante
		estudiante.dormir();
		estudiante.respirar();
		
		// metodos propios de estudiante
		estudiante.aprobar();
		estudiante.reprobar();
		
		System.out.println();
		
		Empleado empleado = new Empleado("Juan", "20-02-1998", 1000);
		
		// metodos de la clase padre persona usado por la clase hija empleado
		empleado.dormir();
		empleado.respirar();
		// metodos propios de empleado
		empleado.trabajar();
		empleado.cobrar();
		

	}

}
