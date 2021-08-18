package herencia.ejercicio;

public class Empleado extends Persona {
	public float sueldo;

	public Empleado(String nombre, String fechaDeNacimiento, float sueldo) {
		super(nombre, fechaDeNacimiento);
		this.sueldo = sueldo;
	}
	
	public void trabajar() {
		System.out.println("Soy " + nombre + " y trabajo");
	}
	
	public void cobrar()  {
		System.out.println("Soy " + nombre + " y estoy cobrando: " + sueldo);
	}
	
	
	
}
