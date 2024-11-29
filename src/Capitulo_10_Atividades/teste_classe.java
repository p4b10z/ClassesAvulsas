package Capitulo_10_Atividades;

public class teste_classe {
    public static void main(String[] args) {
        // Define o array de Shape
        Shape[] shape = new Shape[6];

        // Inicializa os elementos do array com objetos específicos
        shape[0] = new circle(3);                 // Círculo com raio 3
        shape[1] = new Square(4, 4);              // Quadrado com lado 4
        shape[2] = new triangle(4, 5);            // Triângulo com base 4 e altura 5
        shape[3] = new Sphere(3, 3);                 // Esfera com raio 3
        shape[4] = new Cube(4, 4, 4);             // Cubo com lado 4
        shape[5] = new tetraedom(6);              // Tetraedro com aresta 6

        // Itera sobre o array e imprime as informações de cada objeto
        for (Shape shape2 : shape) {
            System.out.println(shape2);           // Invoca o método toString() de cada objeto
            System.out.println("Área: " + shape2.getArea());
            
            // Verifica se o objeto é tridimensional para calcular o volume
            if (shape2 instanceof TreeDimensionalShape) {
                TreeDimensionalShape threeDShape = (TreeDimensionalShape) shape2;
                System.out.println("Volume: " + threeDShape.getVolume());
            }
            System.out.println();
        }
    }
}