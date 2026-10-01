package Notificationsistemi;

public class EmailNotification implements Notification{        //5

    @Override
    public void send(String message){
        System.out.println("Email göndərildi: " + message);
    }

}
