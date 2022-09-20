public class MilitaryTank extends Vehicle{
    String MilitaryTank;

    public MilitaryTank(String militaryTank) {
        MilitaryTank = militaryTank;
    }

    public MilitaryTank() {
        System.out.println("Military Tank created. 2000 miles to go!");
    }

    public static boolean checkTankAge(String name, int age){
        if (age < 25){
            System.out.println("driver not changed! " + name + " is " + age + ", but you must be 25 or older to drive a Military Tank");
        } else {
            return true;
        }
        return false;
    }
}
