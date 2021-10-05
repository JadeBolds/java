package justChecking;

public class Car extends Vehicle implements DriveAble{

    //Car car = new Car();
    public int milesPerHour;

    public Car(int qty, Double price, Engine engine, int speed, int milesPerHour) {
        super(qty, price, engine, speed, milesPerHour);
    }

    public static void getTotalAfterTax(){};

    public static void setTotalAfterTax(){};

    @Override
    public void totalAfterTax() {
        return this.price * 1.15;
    }

    @Override
    public int milesPerHour() {
        return 0;
    }
}
