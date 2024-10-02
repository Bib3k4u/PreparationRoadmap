package WIthDesignStrategy.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("normal Drive Strategy");
    }
}
