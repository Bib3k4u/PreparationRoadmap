package ParkingLotDesign;

import java.time.LocalDateTime;

public class ParkingLotDemo {
    public static void main(String[] args) throws InterruptedException {

        // Create an instance of the parking lot
        ParkingLot parkingLot = new ParkingLot();

        // Initialize parking spots for different types of vehicles
        parkingLot.initializeParkingSpots(VehicleType.TWO_WHEELERS, 5); // 5 spots for two-wheelers
        parkingLot.initializeParkingSpots(VehicleType.FOUR_WHEELERS, 3); // 3 spots for four-wheelers
        parkingLot.initializeParkingSpots(VehicleType.THREE_WHEELERS, 2); // 2 spots for three-wheelers


        // Display initial vacancy
        System.out.println("\nInitial vacancy:");
        parkingLot.displayVacancy(); // Show how many spots are available for each vehicle type

        System.out.println();


        // Two-wheeler enters the parking lot
        Vehicle twoWheeler = new Vehicle("KA-01-HH-1234", VehicleType.TWO_WHEELERS);
        Ticket ticketTwoWheeler = parkingLot.parkVehicle(twoWheeler); // Park the vehicle and get the ticket
        if (ticketTwoWheeler != null) {
            System.out.println("Vehicle " + twoWheeler.getVehicleNumber() + " parked at spot " + ticketTwoWheeler.getSpot().getSpotId());
        }
        System.out.println();


        Vehicle twoWheeler1 = new Vehicle("KA-01-HH-1111", VehicleType.TWO_WHEELERS);
        Ticket ticketTwoWheeler1 = parkingLot.parkVehicle(twoWheeler1); // Park the vehicle and get the ticket
        if (ticketTwoWheeler1 != null) {
            System.out.println("Vehicle " + twoWheeler1.getVehicleNumber() + " parked at spot " + ticketTwoWheeler1.getSpot().getSpotId());
        }

        System.out.println();

        // Four-wheeler enters the parking lot
        Vehicle fourWheeler = new Vehicle("KA-02-FF-5678", VehicleType.FOUR_WHEELERS);
        Ticket ticketFourWheeler = parkingLot.parkVehicle(fourWheeler); // Park the vehicle and get the ticket
        if (ticketFourWheeler != null) {
            System.out.println("Vehicle " + fourWheeler.getVehicleNumber() + " parked at spot " + ticketFourWheeler.getSpot().getSpotId());
        }


        // Simulate some time passing
        Thread.sleep(3000); // Simulate 3 seconds of parking time (in a real app, this would be actual time)

        System.out.println();

        // Two-wheeler exits and makes payment
        RateCalculator twoWheelerRateCalculator = new TwoWheelerRateCalculator(); // Create rate calculator for two-wheelers
        PaymentStrategy creditCardPayment = new CreditCardPayment(); // Define payment strategy

        parkingLot.exitVehicle(ticketTwoWheeler, twoWheelerRateCalculator, creditCardPayment );
        System.out.println("Vehicle " + twoWheeler.getVehicleNumber() + " exited and payment processed.");

        System.out.println();

        // Display updated vacancy after two-wheeler exits
        System.out.println("\nUpdated vacancy after two-wheeler exits:");
        parkingLot.displayVacancy(); // Show updated availability

        System.out.println();

        // Three-wheeler enters after two-wheeler exits
        Vehicle threeWheeler = new Vehicle("KA-03-GG-9876", VehicleType.THREE_WHEELERS);
        Ticket ticketThreeWheeler = parkingLot.parkVehicle(threeWheeler); // Park the three-wheeler
        if (ticketThreeWheeler != null) {
            System.out.println("Vehicle " + threeWheeler.getVehicleNumber() + " parked at spot " + ticketThreeWheeler.getSpot().getSpotId());
        }

        System.out.println();
        // Display final vacancy after three-wheeler enters
        System.out.println("\nFinal vacancy after three-wheeler enters:");
        parkingLot.displayVacancy(); // Show final availability
    }
}
