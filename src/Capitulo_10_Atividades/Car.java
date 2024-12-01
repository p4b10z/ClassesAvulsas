package Capitulo_10_Atividades;

public class Car implements CarbonFootprint {
    private String fuelType;
    private double fuelEfficiency; // km por litro
    private double annualDistance; // km percorridos anualmente

    public Car(String fuelType, double fuelEfficiency, double annualDistance) {
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
        this.annualDistance = annualDistance;
    }

    @Override
    public double getCarbonFootprint() {
        // Conversão de combustível para CO2 (aproximadamente 2.31 kg CO2 por litro de gasolina)
        double fuelConsumed = annualDistance / fuelEfficiency;
        return fuelConsumed * 2.31;
    }

    @Override
    public String toString() {
        return "Car [FuelType=" + fuelType + ", Efficiency=" + fuelEfficiency + " km/l, Annual Distance=" + annualDistance + " km]";
    }
}

