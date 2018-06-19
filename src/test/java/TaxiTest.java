import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxiTest {


    @Test
    public void shouldReturnThePriceForThreeKilometerOfAMiniRide() {
        Cab cab = new Mini(50);
        assertEquals(50, cab.calculateFare(3), 0.001);
    }

    @Test
    public void shouldReturnThePriceForTenKilometerOfAMiniRide() {
        Cab cab = new Mini(50);
        assertEquals(120, cab.calculateFare(10), 0.001);
    }

    @Test
    public void shouldReturnThePriceFor35KilometerOfAMiniRide() {
        Cab cab = new Mini(50);
        assertEquals(336, cab.calculateFare(35), 0.001);
    }


    @Test
    public void shouldReturnThePriceForThreeKilometerOfASedanRide() {
        Cab cab = new Sedan(80);
        assertEquals(80, cab.calculateFare(5), 0.001);
    }

    @Test
    public void shouldReturnThePriceForTenKilometerOfASedanRide() {
        Cab cab = new Sedan(80);
        assertEquals(140, cab.calculateFare(10), 0.001);
    }

    @Test
    public void shouldReturnThePriceFor35KilometerOfAMSedanRide() {
        Cab cab = new Sedan(80);
        assertEquals(410, cab.calculateFare(35), 0.001);
    }

    @Test
    public void shouldReturnThePriceForThreeKilometerOfA_SUVRide() {
        Cab cab = new SUV(100);

        assertEquals(100, cab.calculateFare(3), 0.001);
    }

    @Test
    public void shouldReturnThePriceForTenKilometerOfA_SUVRide() {
        Cab cab = new SUV(100);
        assertEquals(175, cab.calculateFare(10), 0.001);
    }

    @Test
    public void shouldReturnThePriceFor35KilometerOfA_SUVRide() {
        Cab cab = new SUV(100);
        assertEquals(505, cab.calculateFare(35), 0.001);
    }

}
