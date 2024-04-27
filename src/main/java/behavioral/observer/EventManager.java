package behavioral.observer;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EventManager {

    private Set<EventListener> set = new HashSet<>();
    private String message;

    public void addListener(EventListener listener) {
        set.add(listener);
    }

    public void removeListener(EventListener listener) {
        set.remove(listener);
    }

    public void notifyListeners() {
        for(EventListener listener : set) {
            listener.update(message);
        }
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
        notifyListeners();
    }
}
