package justChecking;

public class Motorbike extends Vehicle{

    private int numOfWheels;

    public Motorbike(int qty, Double price, Engine engine, int i, int speed, int numOfWheels) {
        super(qty, price, engine, i, speed);
        this.numOfWheels = numOfWheels;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    @Override
    public void totalAfterTax() {
        return this.price * 1.15;
    }
}
