package behavioral.observer;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EventManager {

    private Map<String, Set<EventListener>> map;

    public void subscribe(String event, EventListener listener) {
        if(map.containsKey(event))
            map.get(event).add(listener);
        else
            map.put(event, new HashSet<>(Collections.singleton(listener)));
    }

    public void unsubscribe(String event, EventListener listener) {
        map.get(event).remove(listener);
    }

    public void notify(String event, String message) {
        for(EventListener eventListener : map.get(event)) {
            eventListener.update(message);
        }
    }
}
