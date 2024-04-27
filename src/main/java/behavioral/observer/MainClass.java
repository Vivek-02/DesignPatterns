package behavioral.observer;

public class MainClass {

    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        EventListener smsListener = new SMSListener();
        eventManager.addListener(smsListener);

        EventListener pushListener = new PushMessageListener();
        eventManager.addListener(pushListener);

        EventListener emailListener = new EmailListener();
        eventManager.addListener(emailListener);

        eventManager.setMessage("New iPhone launched...!!!");
    }
}
