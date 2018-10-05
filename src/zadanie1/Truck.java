package zadanie1;

import zadanie1.Car;

public class Truck extends Car {
    private double loadWeight;

    public Truck(String name, double fuel, double combustion, boolean airCon, double loadWeight) {
        super(name, fuel, combustion, airCon);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public double comb() {

        double combust = getCombustion();
        if (getAirCon()) {
            combust = combust + 1.6;
        }
        if (loadWeight >= 100) {
            combust = combust + 0.5 * loadWeight / 100;
        }
        return combust;
    }

    @Override
    public String toString() {

        return (super.toString() + " waga ładunku: " + loadWeight);
    }


}
