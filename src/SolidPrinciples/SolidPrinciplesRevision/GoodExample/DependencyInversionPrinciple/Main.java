package SolidPrinciples.SolidPrinciplesRevision.GoodExample.DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        // Using EmailService
        NotificationService emailService = new EmailService();
        NotificationManager emailManager = new NotificationManager(emailService);
        emailManager.sendNotification("Hello via Email!");

        // Using SMSService
        NotificationService smsService = new SMSService();
        NotificationManager smsManager = new NotificationManager(smsService);
        smsManager.sendNotification("Hello via SMS!");
    }
}