public abstract class Vehicle {

    String vehicle;
    Driver driver;
    int milesDriven;
    int milesToGo;

    public abstract void drive();

    public abstract void setDriver(Driver driver);
}
