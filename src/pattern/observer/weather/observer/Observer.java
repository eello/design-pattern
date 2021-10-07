package pattern.observer.weather.observer;

import pattern.observer.weather.subject.Subject;

public interface Observer {

    void update(float temperature, float humidity, float pressure);
    void update(Subject subject);
}
