package Capitulo_10_Atividades;

public class circle extends TwoDimensionalShape {
	private double Raio;

	public circle(double Raio) {
		super(0, 0);
		this.Raio = Raio;
	}

	public double getRaio() {
		return Raio;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(Raio, 2);
	}// calcula a area do circulo

	public String toString() {
		return String.format("%s %,.1f%n%s %,.1f", "Raio :", getRaio(), "Area :", getArea());
	}

	@Override
	public double getVolume() {
		return 0;
	}
}
