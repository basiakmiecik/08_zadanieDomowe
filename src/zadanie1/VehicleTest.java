package zadanie1;

import zadanie1.Car;
import zadanie1.Truck;

public class VehicleTest {
    public static void main(String[] args) {

        Car[] cars = new Car[5];

        cars[0] = new Car("Maluch", 50, 10, false);
        cars[1] = new Car("Maluch2", 50, 10, true);
        cars[2] = new Truck("Tir", 100, 20, false, 0);
        cars[3] = new Truck("Tir2", 100, 20, true, 0);
        cars[4] = new Truck("Tir3", 100, 20, true, 200);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }

        //sprawdzenie warunków
        System.out.println(cars[0].toString());
        cars[0].setAirCon(true);
        System.out.println(cars[0].toString());
        cars[0].setAirCon(false);
        System.out.println(cars[0].toString());
    }


}
