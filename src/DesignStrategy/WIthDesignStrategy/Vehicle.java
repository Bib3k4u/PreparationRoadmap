package WIthDesignStrategy;

import WIthDesignStrategy.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

//    ??construction Injection
    Vehicle(DriveStrategy driveObj){
        this.driveStrategy = driveObj;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
