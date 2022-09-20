public class Vehicle {

    String vehicle;
    int milesDriven;
    int milesToGo;

    public void drive() {
        if (vehicle == vehicle/* get driver*/) {
            System.out.println(vehicle + " drove " + milesDriven + " miles - " + milesToGo + " to go!");
        } else {
            //if there is no driver assigned to the vehicle
            System.out.println(vehicle + " didn't drive - there's no driver");
        }
    }

    public static void checkAge(String name, int age) {
        if (vehicle = Car) {
            Car.checkCarAge(name, age);
        } else if (vehicle = MilitaryTank) {
            MilitaryTank.checkTankAge(name, age);
        }

    }
}
