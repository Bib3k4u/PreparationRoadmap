package ParkingLotDesign;

public class FourWheelerRateCalculator implements RateCalculator{
    @Override
    public double calculateRate(long durationInMinutes){return 0.5 * durationInMinutes;}
}
