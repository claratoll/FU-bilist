public class Car extends Vehicle{


    String car;

    public Car(String car) {
        this.car = car;
    }

    public Car() {
        System.out.println("Car created. 100 miles to go!");
    }

    public void checkCarAge(String name, int age){
        if (age < 18){
            System.out.println("driver not changed! " + name + " is " + age + ", but you must be 18 or older to drive a car");
        }
    }
}
