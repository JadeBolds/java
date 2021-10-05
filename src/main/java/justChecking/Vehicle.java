package justChecking;

public abstract class Vehicle {

    private int qty;
    private Double price;
    private Engine engine;
    private int speed;
    private double final TAX;

    public Vehicle(int qty, Double price, Engine engine, int speed) {
        this.qty = qty;
        this.price = price;
        this.engine = engine;
        this.speed = speed;
    }

    public double totalBeforeTax(){
        return 0.0;
    };

    public double calcTax(){
        return 0.0;
    };

    public abstract void totalAfterTax();


    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
