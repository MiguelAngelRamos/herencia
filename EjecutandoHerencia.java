package herencia;

public class EjecutandoHerencia {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		Perro perro = new Perro();
		perro.nombre = "Rocky";
		perro.respirar();
		perro.caminar();
		perro.comer();
		
		Gato gato = new Gato();
		gato.nombre = "Benito";
		gato.respirar();
		gato.caminar();
		gato.comer();
		
		System.out.println(animal instanceof Animal);
		System.out.println(animal instanceof Perro);
		System.out.println(perro instanceof Animal);
		
		System.out.println(animal instanceof Gato);
		System.out.println(gato instanceof Animal);

	}

}
