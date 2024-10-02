package WIthDesignStrategy;

import WIthDesignStrategy.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
