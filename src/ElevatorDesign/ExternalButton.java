package ElevatorDesign;

class ExternalButton {
    ExternalButtonDispatcher dispatcher;

    public ExternalButton() {
        this.dispatcher = new ExternalButtonDispatcher();
    }

    public void pressButton(int floor, Direction direction) {
        dispatcher.submitRequest(floor, direction);
    }
}

