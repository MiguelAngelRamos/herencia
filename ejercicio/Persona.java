package herencia.ejercicio;

public class Persona {
	// Atributos
	public String nombre;
	public String fechaDeNacimiento;
	
	// Constructor es explicito y tiene por parametros todos los atributos de la clase Persona
	public Persona(String nombre, String fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	// Metodos
	
	public void dormir() {
		System.out.println("Soy " + nombre + " y estoy durmiendo");
	}
	
	public void respirar() {
		System.out.println("Soy " + nombre + " y estoy respirando desde " + fechaDeNacimiento);
	}
	
	public void comer()  {
		System.out.println("Soy " + nombre + " y estoy comiendo");
	}
	
}
