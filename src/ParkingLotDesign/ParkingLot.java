package ParkingLotDesign;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    Map<VehicleType, Integer> capacityMap;
    Map<VehicleType, Integer> occupiedMap;
    Map<Integer, ParkingSpot> parkingSpots;
     private int nextSpotId;
     ParkingLot(){
         capacityMap = new HashMap<>();
         occupiedMap = new HashMap<>();
         parkingSpots = new HashMap<>();
         nextSpotId = 1;
     }

    public void initializeParkingSpots(VehicleType vehicleType, int capacity){
         capacityMap.put(vehicleType, capacity);
         occupiedMap.put(vehicleType, 0);
         for(int i = 0; i < capacity; i++){
             parkingSpots.put(nextSpotId, new ParkingSpot(nextSpotId, vehicleType));
         }
        System.out.println("Initialized " + capacity + " spots for " + vehicleType + " (Spot IDs: " + (nextSpotId - capacity) + " to " + (nextSpotId - 1) + ")");
    }

    public Ticket parkVehicle(Vehicle vehicle){
         VehicleType vehicleType = vehicle.getVehicleType();
         int occupied = occupiedMap.get(vehicleType);
         int capacity = capacityMap.get(vehicleType);

         if(occupied >= capacity){
             System.out.println("No vacant spots available for " + vehicle);
         }

         for(ParkingSpot spot : parkingSpots.values()){
             if(spot.isVacant() && spot.getVehicleType() == vehicleType){
                 spot.occupySlot();
                 occupiedMap.put(vehicleType, occupied+1);
                 Ticket ticket = new Ticket(spot, vehicle);
                 System.out.println("Vehicle with Vehicle No. " + vehicle.getVehicleNumber() + " entered.");
                 System.out.println("Ticket ID " + ticket.getTicketId() + " generated.");
                 System.out.println("Vehicle Type: " + vehicleType);
                 return ticket;
             }
         }
         return null;
    }

    public void exitVehicle(Ticket ticket, RateCalculator rateCalculator, PaymentStrategy paymentStrategy){
        ParkingSpot spot = ticket.getSpot();
        Vehicle vehicle = ticket.getVehicle();

        spot.freeSpot();
        VehicleType type = spot.getVehicleType();
        occupiedMap.remove(type, occupiedMap.get(type)-1);

        double amount = rateCalculator.calculateRate(spot.getSpotId());

        paymentStrategy.pay(amount);

        System.out.println("Vehicle with Vehicle No. " + vehicle.getVehicleNumber() + " exiting.");
        System.out.println("Total amount to pay: " + amount);
        System.out.println("Paid " + amount + " using " + paymentStrategy.getPaymentMethod() + ".");
        System.out.println("Spot " + spot.getSpotId() + " is now vacant.");
    }

    public void displayVacancy(){
         for(VehicleType type : capacityMap.keySet()){
             int vacant = capacityMap.get(type) - occupiedMap.get(type);
             System.out.println("Vacant spots for " + type + ": " + vacant + " / " + capacityMap.get(type));
         }

    }


}
