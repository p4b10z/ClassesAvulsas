package Capitulo_10_Atividades;

public class Building implements CarbonFootprint {
    private int numberOfFloors;
    private double totalArea;
    private double annualEnergyConsumption; // em kWh

    public Building(int numberOfFloors, double totalArea, double annualEnergyConsumption) {
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
        this.annualEnergyConsumption = annualEnergyConsumption;
    }

    @Override
    public double getCarbonFootprint() {
        // Conversão de kWh para CO2 (aproximadamente 0.233 kg CO2 por kWh)
        return annualEnergyConsumption * 0.233;
    }

    @Override
    public String toString() {
        return "Building [Floors=" + numberOfFloors + ", Area=" + totalArea + " m², Annual Energy=" + annualEnergyConsumption + " kWh]";
    }
}

