package behavioral.observer;

public class LoggingListener implements EventListener {

    private String log;
    private String message;

    @Override
    public void update(String filename) {
        System.out.println("Logging");
    }

    public LoggingListener(String log, String message) {
        this.log = log;
        this.message = message;
    }
}
