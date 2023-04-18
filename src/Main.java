import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();
        GasolineCar car1 = new GasolineCar("AK43202", "Audi","A6",4,10);
        GasolineCar car2 = new GasolineCar("PS20981", "Mercedes","EQS",4,25);
        DieselCar car3 = new DieselCar("KO39292", "Opel","655",4,20,true);
        DieselCar car4 = new DieselCar("JN91753", "Honda","Civic",4,6,false);
        ElectricCar car5 = new ElectricCar("RD25632","Tesla","y",4,70,500);
        ElectricCar car6 = new ElectricCar("BL08621","Mustang","Mach-E",4,100,600);
        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);
        fleet.addCar(car4);
        fleet.addCar(car5);
        fleet.addCar(car6);

        System.out.println(fleet);
        System.out.println(fleet.getTotalRegistrationFeeForFleet());

    }
}