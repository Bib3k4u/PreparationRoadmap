package SolidPrinciples.SolidPrinciplesRevision.BadExample.DependencyInversionPrinciple;

public class EmailService {
    public void sendEmail(String message){
        System.out.println("SentMessage by Email");
    }
}
