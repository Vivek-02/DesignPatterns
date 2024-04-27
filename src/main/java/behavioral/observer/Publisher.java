package behavioral.observer;

import java.util.List;

public class Publisher {

    private List<String> list;

    public void addSubscribers(String subscriber) {
        list.add(subscriber);
    }

    public void removeSubscriber(String subscriber) {
        list.remove(subscriber);
    }
}
