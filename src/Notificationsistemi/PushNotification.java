package Notificationsistemi;

public class PushNotification implements Notification{          //5

    @Override
    public void send(String message){
        System.out.println("Push notification göndərildi: " + message);
    }
}
