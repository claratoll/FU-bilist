public class MilitaryTank extends Vehicle{
    String MilitaryTank;
    int tankAge = 25;
    int milesDriven = 5;
    int milesToGo = 2000;

    public MilitaryTank(String militaryTank) {
        MilitaryTank = militaryTank;
    }

    public MilitaryTank() {
        System.out.println("Military Tank created. 2000 miles to go!");
    }


    private boolean checkAge(String name, int age){
        if (age < tankAge){
            System.out.println("driver not changed! " + name + " is " + age + ", but you must be 25 or older to drive a Military Tank");
        } else {
            return true;
        }
        return false;
    }


    @Override
    public void setDriver(Driver driver) {
        if (checkAge(driver.driver, driver.age) == true){
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
