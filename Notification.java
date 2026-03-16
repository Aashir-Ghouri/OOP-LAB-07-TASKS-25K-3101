public class Notification {
    public void send() {
        System.out.println("Sending notification...");
    }

    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();
        Notification n3 = new PushNotification();

        n1.send();
        n2.send();
        n3.send();
    }
}

class EmailNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending email notification...");
    }
}

class SMSNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending SMS notification...");
    }
}

class PushNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending push notification...");
    }
}