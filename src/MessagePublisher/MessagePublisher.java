package MessagePublisher;

import utils.Observable;
import utils.Observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Observable {
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }

    }
}
