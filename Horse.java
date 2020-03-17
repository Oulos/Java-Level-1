package ru.geekbrains.homework5;

public class Horse extends Animal {

    final int runDistance;
    final double jumpDistance;
    final int swimDistance;

    public Horse(String name, String color, int age, int runDistance, double jumpDistance, int swimDistance) {
        super(name, color, age);
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;
        this.swimDistance = swimDistance;
    }

    @Override
    public boolean run(int distance) {
        if (distance > 0 && distance < runDistance)
            return true;
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (distance > 0 && distance < swimDistance)
            return true;
        return false;
    }

    @Override
    public boolean jump(double distance) {
        if (distance > 0 && distance < jumpDistance)
            return true;
        return false;
    }

}
