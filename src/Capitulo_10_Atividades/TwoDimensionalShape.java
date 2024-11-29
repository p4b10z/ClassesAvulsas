package Capitulo_10_Atividades;

public abstract class TwoDimensionalShape extends Shape {

	public TwoDimensionalShape(double altura, double largura) {
		super(altura, largura);
	}
	
	public abstract double getArea(); 
	
	
	@Override
	public String toString() {
		return String.format("%s %,.1f%n%s %,.1f",
				"Altura :", super.getAltura(),
				"Largura :",super.getLargura());
	}
}
