package ParkingLotDesign;

public class Ticket {
    private static int ticketCounter = 0;
    int ticketId;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;

    public Ticket(ParkingSpot parkingSpot, Vehicle vehicle){
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.ticketId = ++ticketCounter;
    }

    public int getTicketId(){return ticketId;}
    public ParkingSpot getSpot(){return parkingSpot;}
    public Vehicle getVehicle(){return vehicle;}
}
