package SolidPrinciples.SolidPrinciplesRevision.GoodExample.DependencyInversionPrinciple;

public class SMSService implements NotificationService{
    @Override
    public void send(String message){
        System.out.println("Sending sms: " + message);    }
}
