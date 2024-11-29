package Capitulo_10_Atividades;

public class Cube extends TreeDimensionalShape {
    public Cube(double altura, double largura, double comprimento) {
    	super(altura, largura, comprimento);
    }

	@Override
	public double getArea() {
		return altura * largura;
	}

	@Override
	public double getVolume() {
		return altura * largura * comprimento;
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s %,.1f%n%s$%,.1f",
				super.toString(),"area",getArea(), "volume", getVolume());
	}
}
