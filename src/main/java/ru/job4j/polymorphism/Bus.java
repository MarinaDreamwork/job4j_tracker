package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Автобус перевозит: " + passengers + " человек.");
    }

    @Override
    public double tankUp(int fuel) {
        return 62.75 * fuel;
    }
}
