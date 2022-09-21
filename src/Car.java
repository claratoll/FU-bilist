public class Car extends Vehicle{

    String car;
    int carAge = 18;
    int milesDriven = 10;
    int milesToGo = 100;

    public Car(String car) {
        this.car = car;
    }

    public Car() {
        System.out.println("Car created. 100 miles to go!");
    }

    private boolean checkAge(String name, int age){
        if (age < carAge){
            System.out.println("driver not changed! " + name + " is " + age + ", but you must be 18 or older to drive a car");
        }else {
            return true;
        }
        return false;
    }

    @Override
    public void setDriver(Driver driver) {
        if (checkAge(driver.driver, driver.age) == true) {
            this.driver = driver;
        }
    }

    @Override
    public void drive() {
        if (vehicle == this.vehicle/* get driver*/) {
            System.out.println(vehicle + " drove " + milesDriven + " miles - " + milesToGo + " to go!");
        } else {
            //if there is no driver assigned to the vehicle
            System.out.println(vehicle + " didn't drive - there's no driver");
        }
    }
}
