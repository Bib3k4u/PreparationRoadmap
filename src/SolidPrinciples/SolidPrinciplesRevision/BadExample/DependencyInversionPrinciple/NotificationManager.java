package SolidPrinciples.SolidPrinciplesRevision.BadExample.DependencyInversionPrinciple;

public class NotificationManager {
    EmailService emailService;
    SMSService smsService;

    public NotificationManager(){
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void sendNotification(String message){
        emailService.sendEmail(message);
        smsService.sendMessage(message);
    }
}
