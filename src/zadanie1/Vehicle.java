package zadanie1;

public class Vehicle {
    private String name;
    private double fuel;
    private double combustion;

    public Vehicle(String name, double fuel, double combustion) {
        this.name = name;
        this.fuel = fuel;
        this.combustion = combustion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getCombustion() {
        return combustion;
    }

    public void setCombustion(double combustion) {
        this.combustion = combustion;
    }


    double comb() {
        double combust = getCombustion();

        return combust;
    }

    double range() {
        double ranger = fuel / comb() * 100;
        return ranger;
    }

    @Override
    public String toString() {
        return (name + " pojemność baku: " + fuel + " spalanie na 100km: " + comb() + " zasięg: " + range());
    }
}
