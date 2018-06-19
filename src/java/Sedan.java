public class Sedan extends Cab {

    public Sedan(int base_price) {
        super(base_price);
    }

    private final double FIFTEEN_RUPEES_PER_KM_DISTANCE= 15;
    private final double FARE_FOR_FIFTEEN_KM= 12;
    private final double BASE_DISTANCE = 5;
    private final double FARE_PER_KM_BEYOND_FIFTEEN_KM = 10;

    public double  calculateFare(double distance) {

        if(distance > BASE_DISTANCE && distance <= FIFTEEN_RUPEES_PER_KM_DISTANCE)
            return (base_price + (distance - BASE_DISTANCE) * FARE_FOR_FIFTEEN_KM);
        else if(distance < 100 &&  distance >  FIFTEEN_RUPEES_PER_KM_DISTANCE)
            return (base_price + FIFTEEN_RUPEES_PER_KM_DISTANCE * FARE_FOR_FIFTEEN_KM + (distance - FIFTEEN_RUPEES_PER_KM_DISTANCE - BASE_DISTANCE) * FARE_PER_KM_BEYOND_FIFTEEN_KM);
        if(distance > 100) {
            return distance * FARE_PER_KM_BEYOND_FIFTEEN_KM;
        }
        else
            return base_price;
    }
}
