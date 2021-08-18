package herencia.polimorfismo;

public class PruebaFiguras {

	public static void main(String[] args) {
		PruebaFiguras p = new PruebaFiguras();
		// Circulo circulo = new Circulo("Rojo", 10.0); 
		p.imprimirArea(new Circulo("Rojo", 10.0));
		p.imprimirArea(new Cuadrado("Verde", 125.2));
		p.imprimirArea(new Rectangulo("Azul", 20, 10));

	}
	
	public void imprimirArea(Figura figura) {
		// Aplicacion del polimorfismo
		
		/* referencia generica (Figura figura)
		 * 
		 * Uso del polimorfismo 
		 * ====================
		 * 
		 * "Es un mismo metodo implementado de forma diferente para cada figura"
		 * */
		
		System.out.println("El color de la figura es: " + figura.getColor() +  " y tiene un area de " + figura.calcularArea());
	}
	

}
