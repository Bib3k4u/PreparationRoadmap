package ElevatorDesign;

public class Main {
    public static void main(String[] args) {
        // Create a building with 10 floors
        Building building = new Building(10);

        // Create ElevatorCar instance and add it to the ElevatorController
        ElevatorCar elevator1 = new ElevatorCar(1); // Elevator 1
        ElevatorController.getInstance().addElevator(elevator1);

        // Step 1: External request from floor 4 to go UP
        System.out.println("Elevator 1 is IDLE at floor " + elevator1.getCurrFloor() + ".\n");
        building.pressExternalButton(4, Direction.UP);  // User presses external button at 4th floor (UP)

        // Step 2: Internal request from floor 4 to go to floor 7
        elevator1.internalButton.pressButton(7, Direction.UP);  // User inside the elevator presses button for 7th floor

        // Step 3: External request from floor 6 to go UP to floor 9
        building.pressExternalButton(6, Direction.UP); // External request from 6th floor (UP to 9th floor)

        // Step 4: External request from floor 8 to go DOWN to 0th floor
        building.pressExternalButton(8, Direction.DOWN); // External request from 8th floor (DOWN to 0th floor)
    }
}

