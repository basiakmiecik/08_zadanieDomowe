package zadanie1;

import zadanie1.Car;

public class Truck  extends Car {
    double loadWeight;

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
    void showInfo(){
        if(airCon){
            setCombustion(getCombustion()+1.6);
        }
        if(loadWeight>=100){
            setCombustion(getCombustion()+0.5*loadWeight/100);
        }
        super.showInfo();
            System.out.println(" waga ładunku: "+loadWeight);
        }
}
