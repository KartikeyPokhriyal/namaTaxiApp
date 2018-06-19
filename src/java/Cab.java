public abstract class Cab {
    double base_price;

    public Cab(double base_price) {
        this.base_price = base_price;
    }

    public abstract double calculateFare(double distance);
}
