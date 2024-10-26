package ElevatorDesign;

class ExternalButtonDispatcher {
    public void submitRequest(int floor, Direction direction) {
        System.out.println("External button pressed at floor " + floor + " for " + direction + " direction.");
        ElevatorController.getInstance().submitNewRequest(null, floor, direction);
    }
}

