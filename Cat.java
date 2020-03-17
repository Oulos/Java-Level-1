package ru.geekbrains.homework5;

public class Cat extends Animal {

    final int runDistance;
    final double jumpDistance;
    final int swimDistance = 0;

    public Cat(String name, String color, int age, int runDistance, double jumpDistance) {
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
    public boolean swim(int distance) {
        if (distance > 0 && distance < swimDistance) //мне тут идея подсказывает, что мое условие будет всегда false, и я ей верю, но мне хочется убедиться, что метод сработает так как надо
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
