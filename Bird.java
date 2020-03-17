package ru.geekbrains.homework5;

public class Bird extends Animal {

    final int runDistance;
    final double jumpDistance;
    final int swimDistance = 0;

    public Bird(String name, String color, int age, int runDistance, double jumpDistance) {
        super(name, color, age);
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;

    }

    @Override
    public boolean run(int distance) {
        if (distance > 0 && distance < runDistance)
            return true;
        return false;
    }

    @Override
    public boolean swim(int distance) { //а здесь я решил упростить: т.к. птичка плавать не умеет, то метод всегда false
        return false;
    }

    @Override
    public boolean jump(double distance) {
        if (distance > 0 && distance < jumpDistance)
            return true;
        return false;
    }

}
