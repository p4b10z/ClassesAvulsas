package Capitulo_10_Atividades;

public abstract class Shape {
	public double altura;
	public double largura;
	public double comprimento;

	public Shape(double altura, double largura, double comprimento) {
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
	}

	public Shape(double altura, double largura) {
		this(altura, largura, 0.0);
	}

	public double getAltura() {
		return altura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public double getLargura() {
		return largura;
	} 
	 public abstract double getArea() ; 
     
     public abstract double getVolume();
}
