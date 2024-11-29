package Capitulo_10_Atividades;

public abstract class TreeDimensionalShape extends Shape {
      public TreeDimensionalShape(double altura, double largura, double comprimento) {
    	  super(altura, largura, comprimento);
      }
      
      public abstract double getArea() ; 
      
      public abstract double getVolume();
      
      @Override
    public String toString() {
    	return String.format("%s %,.1f%n%s %,.1f%n%s %,.1f",
    			"altura :", super.getAltura(),
    			"largura :", super.getLargura(),
    			"comprimento :", super.getComprimento());
    }
      }
