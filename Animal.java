package ru.geekbrains.homework5;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public boolean run (int distance) {
        if (distance > 0)
            return true;
    return false;
    }

    public boolean jump (double distance) {
        if (distance > 0)
            return true;
    return false;
    }

    public boolean swim (int distance) {
        if (distance > 0)
            return true;
    return false;
    }



}
