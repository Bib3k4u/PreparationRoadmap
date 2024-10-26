package ElevatorDesign;

class InternalButtonDispatcher {
    ElevatorCar car;

    public InternalButtonDispatcher(ElevatorCar car) {
        this.car = car;
    }

    public void submitRequest(int floor, Direction direction) {
        System.out.println("Internal button pressed for floor " + floor);
        ElevatorController.getInstance().submitNewRequest(car, floor, direction);
    }
}

