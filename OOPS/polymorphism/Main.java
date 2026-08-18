class Notification {

    void send() {
        System.out.println("Sending notification");
    }
}

class Email extends Notification {

    @Override
    void send() {
        super.send();
        System.out.println("Sending Email");
    }
}

class SMS extends Notification {

    @Override
    void send() {
        System.out.println("Sending SMS");
    }
}

class WhatsApp extends Notification {

    @Override
    void send() {
        System.out.println("Sending WhatsApp message");
    }
}

public class Main {

    public static void main(String[] args) {

        Notification n;

        n = new Email();
        n.send();

        n = new SMS();
        n.send();

        n = new WhatsApp();
        n.send();
    }
}