package behavioral.observer;

public class EmailListener implements EventListener {

    private String email;
    private String message;

    @Override
    public void update(String filename) {
        System.out.println("Email");
    }

    public EmailListener(String email, String message) {
        this.email = email;
        this.message = message;
    }
}
