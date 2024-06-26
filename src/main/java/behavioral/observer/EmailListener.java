package behavioral.observer;

public class EmailListener implements EventListener {
    private String message;

    @Override
    public void update(String message) {
        this.message = message;
        display();
    }

    private void display() {
        System.out.println("Email message received -> "+message);
    }
}
