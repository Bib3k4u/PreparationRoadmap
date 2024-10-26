package ElevatorDesign;

public class InternalButton {
    private ElevatorCar elevatorCar;

    public InternalButton(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }

    public void pressButton(int floor, Direction direction) {
        System.out.println("Internal button pressed for floor " + floor + ".");
        elevatorCar.move(floor, direction);
    }
}

