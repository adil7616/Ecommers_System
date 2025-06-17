public class EmailNotification extends Notification{
    public EmailNotification(String recipient)
    {
        super(recipient);
    }

    public void send(String message) {
        System.out.println("Email to " + recipient + ": " + message);
    }
}
