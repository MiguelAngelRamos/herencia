package herencia;

public class EjecutandoHerencia {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Perro perro = new Perro();
		perro.nombre = "Rocky";
		perro.respirar();
		perro.caminar();
		perro.comer();
		
		System.out.println(animal instanceof Animal);
		System.out.println(animal instanceof Perro);
		System.out.println(perro instanceof Animal);

	}

}
