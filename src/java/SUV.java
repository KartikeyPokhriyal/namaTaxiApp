public class SUV extends Cab {

    private final double FIFTEEN_RUPPES_PER_KM_DISTANCE= 15;
    private final double FARE_FOR_FIFTEEN_KM= 15;
    private final double BASE_DISTANCE = 5;
    private final double FARE_PER_KM_BEYOND_FIFTEEN_KM = 12;

    public SUV(double base_price) {
        super(base_price);
    }

    public double  calculateFare(double distance) {

        if(distance > BASE_DISTANCE && distance <= FIFTEEN_RUPPES_PER_KM_DISTANCE)
            return (base_price + (distance - BASE_DISTANCE ) * FARE_FOR_FIFTEEN_KM);
        else if(distance > FIFTEEN_RUPPES_PER_KM_DISTANCE)
            return (base_price + FIFTEEN_RUPPES_PER_KM_DISTANCE * FARE_FOR_FIFTEEN_KM + (distance - FIFTEEN_RUPPES_PER_KM_DISTANCE - BASE_DISTANCE) * FARE_PER_KM_BEYOND_FIFTEEN_KM);

            return base_price;
    }
}
