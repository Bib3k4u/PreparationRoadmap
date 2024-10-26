package ElevatorDesign;

import java.util.*;

class Building {
    List<Floor> floors;

    public Building(int totalFloors) {
        floors = new ArrayList<>();
        for (int i = 0; i < totalFloors; i++) {
            floors.add(new Floor(i));
        }
    }

    public void pressExternalButton(int floor, Direction direction) {
        floors.get(floor).externalButton.pressButton(floor, direction);
    }
}