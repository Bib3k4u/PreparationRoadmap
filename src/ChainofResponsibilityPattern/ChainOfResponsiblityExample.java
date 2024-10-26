package ChainofResponsibilityPattern;

public class ChainOfResponsiblityExample {
    static Employee getProblemSolvingChain() {
        // Creating employees and setting their problem-solving levels
        Employee junior = new JuniorEmployee(1);    // Can handle level 1 problems
        Employee manager = new Manager(2);          // Can handle level 2 problems
        Employee director = new Director(3);        // Can handle level 3 problems

        // Set up the chain: JuniorEmployee -> Manager -> Director
        junior.setNextEmployee(manager);
        manager.setNextEmployee(director);

        return junior;  // Start with the junior employee
    }
}
