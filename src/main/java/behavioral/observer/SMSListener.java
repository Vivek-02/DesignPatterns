package behavioral.observer;

public class SMSListener implements EventListener{

    private String message;
    @Override
    public void update(String message) {
        this.message = message;
        display();
    }

    private void display() {
        System.out.println("SMS received -> "+message);
    }
}
