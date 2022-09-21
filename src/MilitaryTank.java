public class MilitaryTank extends Vehicle{

    int tankAge = 25;
    int milesDriven = 5;
    int milesToGo = 2000;
    boolean letsGo = false;

    public MilitaryTank() {
        System.out.println("Military Tank created. 2000 miles to go!");
    }

    private boolean checkAge(String name, int age){
        if (age < tankAge){
            System.out.println("Driver not changed! " + name + " is " + age + ", but you must be 25 or older to drive a Military Tank");
        } else {
            return true;
        }
        return false;
    }

    @Override
    public void setDriver(Driver driver) {
        if (checkAge(driver.driver, driver.age)){
            this.driver = driver;
            System.out.println("Driver changed to: " + driver.driver);
            letsGo = true;
        }
    }

    @Override
    public void drive() {
        if (!letsGo) {
            System.out.println("MilitaryTank didn't drive - there's no driver");
            //if there is no driver assigned to the vehicle
        } else {
            milesToGo = milesToGo - milesDriven;
            System.out.println("MilitaryTank drove " + milesDriven + " miles - " + milesToGo + " to go!");
        }
    }
}
