package Capitulo_10_Atividades;

import java.util.ArrayList;

public class CarbonFootprintTest {
    public static void main(String[] args) {
        // Criação de objetos
        Building building = new Building(5, 500, 20000); // 5 andares, 500 m², 20.000 kWh/ano
        Car car = new Car("Gasoline", 15, 12000); // Gasolina, 15 km/l, 12.000 km/ano
        Bicycle bicycle = new Bicycle("Electric", 2000, 500); // Elétrica, 2000 km/ano, 500 kWh/ano

        // Adicionando objetos ao ArrayList
        ArrayList<CarbonFootprint> carbonFootprints = new ArrayList<>();
        carbonFootprints.add(building);
        carbonFootprints.add(car);
        carbonFootprints.add(bicycle);

        // Iteração polimórfica e exibição dos resultados
        for (CarbonFootprint item : carbonFootprints) {
            System.out.println(item.toString());
            System.out.printf("Carbon Footprint: %.2f kg CO2%n", item.getCarbonFootprint());
            System.out.println("----------------------------------");
        }
    }
}

