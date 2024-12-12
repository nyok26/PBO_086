package com.example;

import java.util.ArrayList;
import java.util.List;

// Kelas Subject (Publisher)
class Employee<T> {
    private final List<Observer<T>> observers = new ArrayList<>();
    private T state;

    // Menambahkan observer
    public void addObserver(Observer<T> observer) {
        observers.add(observer);
    }

    // Menghapus observer
    public void removeObserver(Observer<T> observer) {
        observers.remove(observer);
    }

    // Mengubah state dan memberi notifikasi
    public void setState(T state) {
        this.state = state;
        notifyObservers();
    }

    // Memberi notifikasi ke semua observer
    private void notifyObservers() {
        for (Observer<T> observer : observers) {
            observer.update(state);
        }
    }
}

// Antarmuka Observer
interface Observer<T> {
    void update(T state);
}

