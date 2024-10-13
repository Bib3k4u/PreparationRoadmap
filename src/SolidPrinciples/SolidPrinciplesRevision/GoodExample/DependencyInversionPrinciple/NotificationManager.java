package SolidPrinciples.SolidPrinciplesRevision.GoodExample.DependencyInversionPrinciple;
// High-level module depends on abstraction (interface)

public class NotificationManager {
    NotificationService notificationService;

    public NotificationManager(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void sendNotification(String message){
        notificationService.send(message);
    }
}
