package ParkingLotDesign;

public class TwoWheelerRateCalculator implements RateCalculator{
    @Override
    public double calculateRate(long durationInMinutes){
        return 0.1 * durationInMinutes;
    }
}
