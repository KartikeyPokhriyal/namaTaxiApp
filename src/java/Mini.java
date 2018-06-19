public class Mini extends Cab {

    public Mini(double base_price) {
        super(base_price);
    }
    private final double FIFTEEN_RUPEES_PER_KM_DISTANCE= 15;
    private final double FARE_FOR_FIFTEEN_KM= 10;
    private final double BASE_DISTANCE = 3;
    private final double FARE_PER_KM_BEYOND_FIFTEEN_KM = 8;
    private final double CONSTANT_FARE_DISTANCE = 75;

    public double  calculateFare(double distance) {

        if(distance > BASE_DISTANCE && distance <= FIFTEEN_RUPEES_PER_KM_DISTANCE)
        return base_price + (distance - BASE_DISTANCE) * FARE_FOR_FIFTEEN_KM;
        else if(distance < CONSTANT_FARE_DISTANCE &&  distance > FIFTEEN_RUPEES_PER_KM_DISTANCE)
           return (base_price + (FIFTEEN_RUPEES_PER_KM_DISTANCE * FARE_FOR_FIFTEEN_KM) + (distance - FIFTEEN_RUPEES_PER_KM_DISTANCE -BASE_DISTANCE ) * FARE_PER_KM_BEYOND_FIFTEEN_KM);
        if(distance > CONSTANT_FARE_DISTANCE) {
            return distance * 8;
        }
            return base_price;
    }
}
