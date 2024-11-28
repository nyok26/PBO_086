package com.example;

import java.util.ArrayList;
import java.util.List;

// Subject
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

// Observer
interface Observer {
    void update();
}

// Concrete Observer
class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Observer " + name + " notified!");
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer obs1 = new ConcreteObserver("A");
        Observer obs2 = new ConcreteObserver("B");

        subject.attach(obs1);
        subject.attach(obs2);

        System.out.println("Changing state to 10");
        subject.setState(10);
    }
}
