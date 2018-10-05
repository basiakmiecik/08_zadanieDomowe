package zadanie1;

public class Car extends Vehicle {
   private boolean airCon;

    public Car(String name, double fuel, double combustion, boolean airCon) {
        super(name, fuel, combustion);
        this.airCon = airCon;
    }

    public boolean getAirCon() {
        return airCon;
    }

    public void setAirCon(boolean airCon) {
        this.airCon = airCon;
    }

    @Override
    public String toString() {
        return (super.toString() + " klimatyzacja?: " + airCon);
    }

    @Override
    public double comb() {
        double combust = super.comb();
        if (airCon) {
            combust = getCombustion() + 0.8;
        } else {
            combust = getCombustion();
        }
        return combust;
    }


}
