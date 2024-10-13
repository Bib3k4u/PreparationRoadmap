package SolidPrinciples.SolidPrinciplesRevision.GoodExample.DependencyInversionPrinciple;

public class EmailService implements NotificationService{
    @Override
    public void send(String message){
        System.out.println("Sending email: " + message);    }
}
