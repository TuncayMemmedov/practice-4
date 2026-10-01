package Notificationsistemi;

public class SmsNotification implements Notification{         //5

    @Override
    public void send(String message){
        System.out.println("SMS göndərildi: " + message);
    }
}
