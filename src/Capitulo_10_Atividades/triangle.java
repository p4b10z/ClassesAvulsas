package Capitulo_10_Atividades;

public class triangle extends TwoDimensionalShape {
	private double base;

	public triangle(double altura, double base) {
		super(altura, 0);
	}

	@Override
	public double getArea() {
		return super.altura * super.largura;
	}
	// calcula a area do triangulo

	public double getBase() {
		return base;
	}

	public String toString() {
		return String.format("%s %,.1f%n%s %,.1f%n%s %,.1f", "altua", super.altura, "base", getBase(), "Area :",
				getArea());
	}

	@Override
	public double getVolume() {
		return 0;
	}

}
