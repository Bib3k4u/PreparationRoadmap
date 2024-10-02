package WIthDesignStrategy;

import WIthDesignStrategy.Strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SpecialDriveStrategy());
    }
}
