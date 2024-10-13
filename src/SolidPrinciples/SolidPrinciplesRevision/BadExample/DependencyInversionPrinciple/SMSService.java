package SolidPrinciples.SolidPrinciplesRevision.BadExample.DependencyInversionPrinciple;

public class SMSService {
    public void sendMessage(String message){
        System.out.println("Sent message by SMS");
    }
}
