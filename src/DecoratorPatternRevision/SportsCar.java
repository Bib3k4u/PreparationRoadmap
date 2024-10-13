package DecoratorPatternRevision;

public class SportsCar extends CarDecorator{
    SportsCar(Car car){
        super(car);
    }
   @Override
   public void assemble(){
        super.assemble();
       System.out.print("Adding features of Sport car. ");
   }
}
