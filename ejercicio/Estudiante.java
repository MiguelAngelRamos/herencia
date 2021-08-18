package herencia.ejercicio;

public class Estudiante extends Persona {
	public int numeroIndentificador;

	public Estudiante(String nombre, String fechaDeNacimiento, int numeroIndentificador) {
		super(nombre, fechaDeNacimiento);
		this.numeroIndentificador = numeroIndentificador;
	}
	
	
	public void aprobar() {
		System.out.println("Soy " + nombre + " y aprobe mi examen");
	}
	
	public void reprobar() {
		System.out.println("Soy " + nombre + " y reprobe mi examen");
	}
	
	@Override
	public void dormir() {
		super.dormir();
		System.out.println("Soy " + nombre + " soy estudiante y yo no duermo");
	}
	

}
