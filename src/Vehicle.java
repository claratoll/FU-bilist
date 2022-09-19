public class Vehicle {

    String vehicle;
    int milesDriven;
    int milesToGo;

    public void drive(){
        if (Driver.getDriver()){
            System.out.println(vehicle + " drove " + milesDriven + " miles - " + milesToGo + " to go!");
        }else {
            System.out.println(vehicle + " didn't drive - there's no driver");
        }
    }



}
