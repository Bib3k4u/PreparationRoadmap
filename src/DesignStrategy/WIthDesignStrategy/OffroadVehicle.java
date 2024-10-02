package WIthDesignStrategy;

import WIthDesignStrategy.Strategy.SpecialDriveStrategy;

public class OffroadVehicle extends Vehicle{
    OffroadVehicle(){
        super(new SpecialDriveStrategy());
    }
}