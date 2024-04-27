package behavioral.observer;

public class PushMessageListener implements EventListener {
    private String message;

    @Override
    public void update(String message) {
        this.message = message;
        display();
    }

    private void display() {
        System.out.println("Push message received -> "+message);
    }

}
