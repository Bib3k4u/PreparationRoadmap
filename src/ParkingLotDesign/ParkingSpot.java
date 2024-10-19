package ParkingLotDesign;

public class ParkingSpot {
    private int spotId;
    boolean isVacant;
    VehicleType vehicleType;
    public ParkingSpot(int spotId, VehicleType vehicleType){
        this.spotId = spotId;
        this.vehicleType = vehicleType;
        this.isVacant = true;
    }
    public boolean isVacant(){return isVacant;}
    public void occupySlot(){this.isVacant = false;}
    public void freeSpot(){this.isVacant = true;}

    public VehicleType getVehicleType(){return vehicleType;}
    public int getSpotId(){return spotId;}
}
