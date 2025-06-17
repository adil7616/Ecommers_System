public class SmsNotification extends Notification{
    public SmsNotification(String recipient)
    {
        super(recipient);
    }

    @Override
    public void send(String message) {
        System.out.println("sms to "+recipient+": "+message);
    }
}
