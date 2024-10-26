package ElevatorDesign;

public class ElevatorCar {
    int id;
    int currFloor;
    Direction direction;
    State state;
    Display display;
    InternalButton internalButton;

    public ElevatorCar(int id){
        this.id = id;
        this.currFloor = 0;
        this.direction = Direction.NONE;
        this.state = State.IDLE;
        this.display = new Display(currFloor, direction);
        this.internalButton = new InternalButton(this);

    }

    public void move(int destinationFloor, Direction direction) {
        this.currFloor = destinationFloor;
        this.direction = direction;
        this.display.floor = destinationFloor;
        this.display.direction = direction;
        this.state = (direction == Direction.NONE) ? State.IDLE : State.MOVING;
        System.out.println("Elevator " + id + " moved to floor " + currFloor + " in direction " + direction);
    }

    public int getCurrFloor() {
        return currFloor;
    }
}
