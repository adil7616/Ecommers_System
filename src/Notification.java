public abstract class Notification {
    protected String recipient;

    public Notification(String recipient) {
        this.recipient = recipient;
    }
    public abstract void send(String message);
}
