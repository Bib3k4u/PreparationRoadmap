package ParkingLotDesign;

public class Vehicle {
    private String vehicleNumber;
    private VehicleType vehicleType;
    Vehicle(String vehicleNumber, VehicleType vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public VehicleType getVehicleType(){
        return vehicleType;
    }
}
