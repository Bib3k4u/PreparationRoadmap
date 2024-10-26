package ChainofResponsibilityPattern;

abstract class Employee {
    protected int level;           // Problem level the employee can handle
    protected Employee nextEmployee; // Next employee in the chain

    // Set the next employee in the chain
    public void setNextEmployee(Employee nextEmployee) {
        this.nextEmployee = nextEmployee;
    }

    // Handle the problem
    public void handleProblem(int level, String message) {
        // If the current employee can handle the problem, they solve it
        if (this.level >= level) {
            solveProblem(message);
        } else if (nextEmployee != null) {
            // If the current employee can't handle the problem, pass it to the next employee
            nextEmployee.handleProblem(level, message);
        }
    }


    // Each specific employee will provide their implementation to solve the problem
    protected abstract void solveProblem(String message);
}

