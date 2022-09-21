public class Car extends Vehicle{

    int carAge = 18;
    int milesDriven = 10;
    int milesToGo = 100;
    boolean letsGo = false;


    public Car() {
        System.out.println("Car created. 100 miles to go!");

    }

    private boolean checkAge(String name, int age){
        if (age < carAge){
            System.out.println("Driver not changed! " + name + " is " + age + ", but you must be 18 or older to drive a car");
        }else {
            return true;
        }
        return false;
    }

    @Override
    public void setDriver(Driver driver) {
        if (checkAge(driver.driver, driver.age)) {
            this.driver = driver;
            System.out.println("Driver changed to: " + driver.driver);
            letsGo = true;
        }
    }

    @Override
    public void drive() {
        if (!letsGo) {
            System.out.println("Car didn't drive - there's no driver");
            //if there is no driver assigned to the vehicle
        } else {
            milesToGo = milesToGo - milesDriven;
            System.out.println("Car drove " + milesDriven + " miles - " + milesToGo + " to go!");
        }
    }
}
