package Capitulo_10_Atividades;

public class Sphere extends TreeDimensionalShape {
    
	public double raio ; 
	public Sphere(double altura, double raio) {
		super(altura, 0, 0);
		this.raio = raio ;
				
	}

	public double getArea() {
		return Math.PI * Math.pow(raio, 2);
	}// calcula a area do circulo


	@Override
	public double getVolume() {
		return (3/4)*Math.PI * Math.pow(raio, 2);
	}
	 public String toString() {
	    	return String.format("%s: %,.1f%n%s : %,.1f%n%s : %,.1f",
	    			"raio", raio, 
	    			"Area", getArea(),
	    			"volume", getVolume());
	    }
}
