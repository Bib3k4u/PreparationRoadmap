package ElevatorDesign;

import java.util.*;

class ElevatorController {
    private static ElevatorController instance;
    private List<ElevatorCar> elevators = new ArrayList<>();
    private PriorityQueue<Integer> minHeap; // Requests in UP direction
    private PriorityQueue<Integer> maxHeap; // Requests in DOWN direction
    private Queue<Integer> pendingQueue;    // Pending requests

    private ElevatorController() {
        this.minHeap = new PriorityQueue<>();
        this.maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        this.pendingQueue = new LinkedList<>();
    }

    public static ElevatorController getInstance() {
        if (instance == null) {
            instance = new ElevatorController();
        }
        return instance;
    }

    public void addElevator(ElevatorCar elevator) {
        elevators.add(elevator);
    }

    public void submitNewRequest(ElevatorCar car, int floor, Direction direction) {
        if (car == null) {
            car = elevators.get(0); // assigning to the first elevator for simplicity
        }
        System.out.println("Request received for floor " + floor + " in direction " + direction);
        controlElevatorCar(car, floor, direction);
    }

    public void controlElevatorCar(ElevatorCar car, int floor, Direction direction) {
        if (direction == Direction.UP) {
            if (floor > car.currFloor) {
                minHeap.add(floor);
            } else {
                pendingQueue.add(floor);
            }
        } else if (direction == Direction.DOWN) {
            if (floor < car.currFloor) {
                maxHeap.add(floor);
            } else {
                pendingQueue.add(floor);
            }
        }
        processRequests(car);
    }

    private void processRequests(ElevatorCar car) {
        if (car.direction == Direction.UP) {
            while (!minHeap.isEmpty()) {
                car.move(minHeap.poll(), Direction.UP);
            }
            if (!pendingQueue.isEmpty()) {
                minHeap.addAll(pendingQueue);
                pendingQueue.clear();
            }
            car.direction = Direction.DOWN;
        } else {
            while (!maxHeap.isEmpty()) {
                car.move(maxHeap.poll(), Direction.DOWN);
            }
            if (!pendingQueue.isEmpty()) {
                maxHeap.addAll(pendingQueue);
                pendingQueue.clear();
            }
            car.direction = Direction.UP;
        }
    }
}
