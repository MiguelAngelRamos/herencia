package herencia.polimorfismo;

public class Circulo extends Figura{

	private double radio;
	
	public Circulo(String color, double radio) {
		super(color); // llamamos al constructor de Figura
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void rodar() {
		System.out.println("El circulo " + getColor() + " esta rodando");
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}
}
