package ChainofResponsibilityPattern;

public class Director extends Employee{
    public Director(int level){
        this.level = level;
    }
    public void solveProblem(String message){
        System.out.println("Director Employee solved: " + message);
    }
}
