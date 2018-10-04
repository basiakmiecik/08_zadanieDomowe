package zadanie1;

public class Car extends Vehicle {
    boolean airCon;

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
    void showInfo() {
        if (airCon) {
            setCombustion(getCombustion() + 0.8);
        }
        super.showInfo();
        System.out.println(" klimatyzacja?: " + airCon);

        //powrót do wartości początkowych
        if(airCon){
            setCombustion(getCombustion() - 0.8);
        }
    }
}
