package SolidPrinciples.SolidPrinciplesRevision.BadExample.SingleResponsibility;

//Demonstration of Sinle Responsiblity Principle
// Bad Exmple
public class Employee {
    String name;
    String employeeId;

    public void getDetails(){
        System.out.println(name + " "+ employeeId);
    }

    public void calculateSalary(){
        //salary calculating Logic
    }
}
