package Notificationsistemi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){          //5

        List<Notification> notifications = new ArrayList<>();

        notifications.add(new EmailNotification());
        notifications.add(new SmsNotification());
        notifications.add(new PushNotification());

        for (Notification notification : notifications){
            System.out.println("Salam");
        }


    }
}
