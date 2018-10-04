package zadanie1;

import zadanie1.Car;
import zadanie1.Truck;

public class VehicleTest {
    public static void main(String[] args) {

        Car[] cars=new Car[4];

        cars[0 ]= new Car("Maluch",100, 3.20,false);
        cars[1]=new Car("Mal",100, 3.2, true);
        cars[2]= new Truck("Tir",100,3.2,false,0);
        cars[3]=new Truck("Ti",100,3.2,true,200);

        for(int i=0;i<cars.length;i++){
            cars[i].showInfo();
        }
    }


}
