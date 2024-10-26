package ChainofResponsibilityPattern;

public class Manager extends Employee{
    public Manager(int level){
        this.level = level;
    }
    @Override
    public void solveProblem(String message){
        System.out.println("Manager Employee solved: " + message);
    }
}
