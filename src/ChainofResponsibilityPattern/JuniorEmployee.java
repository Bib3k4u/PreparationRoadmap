package ChainofResponsibilityPattern;

public class JuniorEmployee extends Employee{
    public JuniorEmployee(int level){
        this.level = level;
    }
    @Override
    public void solveProblem(String message){
        System.out.println("Junior Employee solved: " + message);
    }
}
