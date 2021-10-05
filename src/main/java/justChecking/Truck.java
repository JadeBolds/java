package justChecking;

public class Truck extends Vehicle implements DriveAble{

    public double final TAX;

    public Truck(int qty, Double price, Engine engine, int speed) {
        super(qty, price, engine, i, speed);
    }

    @Override
    public void totalAfterTax() {
        return this.price * 1.2;
    }

    @Override
    public int milesPerHour() {
        return 0;
    }
}
