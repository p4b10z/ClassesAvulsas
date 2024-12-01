package Capitulo_10_Atividades;

public class Bicycle implements CarbonFootprint {
    private String type; // Normal ou elétrica
    private double annualDistance; // km percorridos anualmente
    private double electricityConsumption; // kWh para bicicletas elétricas

    public Bicycle(String type, double annualDistance, double electricityConsumption) {
        this.type = type;
        this.annualDistance = annualDistance;
        this.electricityConsumption = electricityConsumption;
    }

    @Override
    public double getCarbonFootprint() {
        if (type.equalsIgnoreCase("Normal")) {
            return 0; // Bicicletas normais não geram emissões de carbono
        } else {
            // Conversão de kWh para CO2 (0.233 kg CO2 por kWh)
            return electricityConsumption * 0.233;
        }
    }

    @Override
    public String toString() {
        return "Bicycle [Type=" + type + ", Annual Distance=" + annualDistance + " km, Electricity=" + electricityConsumption + " kWh]";
    }
}

