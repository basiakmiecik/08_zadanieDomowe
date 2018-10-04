package zadanie1;

public class Vehicle {
    String name;
    double fuel;
    double combustion;

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

    double Range(){
        double range=fuel/combustion*100;
    return range;}

    void showInfo(){
        System.out.println(name+" pojemność baku: "+fuel+" spalanie na 100km: "+combustion+ " zasięg: "+Range());
    }
}
