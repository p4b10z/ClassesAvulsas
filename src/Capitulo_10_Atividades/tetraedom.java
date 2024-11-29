package Capitulo_10_Atividades;

public class tetraedom extends TreeDimensionalShape{
	private double aresta;

    public tetraedom(double aresta) {
        super(aresta, aresta, aresta); 
        this.aresta = aresta;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * Math.pow(aresta, 2); // Calcula a área da superfície
    }

    @Override
    public double getVolume() {
        return Math.pow(aresta, 3) / (6 * Math.sqrt(2)); // Calcula o volume
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %,.2f%n%s: %,.2f",
                super.toString(), "Área", getArea(), "Volume", getVolume());
    }
}
