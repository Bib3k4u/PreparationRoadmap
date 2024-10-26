package ChainofResponsibilityPattern;


import static ChainofResponsibilityPattern.ChainOfResponsiblityExample.getProblemSolvingChain;

public class Main {
    public static void main(String[] args) {
        Employee problemSolvers = getProblemSolvingChain();

        problemSolvers.handleProblem(1, "Basic problem (level 1).");  // Solved by Junior
        problemSolvers.handleProblem(2, "Medium problem (level 2)."); // Solved by Manager
        problemSolvers.handleProblem(3, "Serious problem (level 3)."); // Solved by Director
    }
}
