package Capitulo_10_Atividades;

public class Square extends TwoDimensionalShape {
	public Square(double altura, double largura) {
		super(altura, largura);
	}

	@Override
	public double getArea() {
		return super.altura * super.largura;
	}
	//calcula a area do quadrado

	public String toString() {
		return String.format("%s%n%s %,.1f", super.toString(), "Area :", getArea());
	}

	@Override
	public double getVolume() {
		return 0;
	}
}
