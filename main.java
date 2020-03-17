package ru.geekbrains.homework5;

public class main {

    private static String runResult(String a, boolean b) {
        String s1 = a + " пробежал(а)";
        String s2 = a + " не пробежал(а)";
        if (b)
            return s1;
    return s2;
    }

    private static String swimResult(String a, boolean b) {
        String s1 = a + " проплыл(а)";
        String s2 = a + " не проплыл(а)";
        if (b)
            return s1;
        return s2;
    }

    private static String jumpResult(String a, boolean b) {
        String s1 = a + " прыгнул(а)";
        String s2 = a + " не прыгнул(а)";
        if (b)
            return s1;
        return s2;
    }

    public static void main(String[] agrs) {

        Cat cat1 = new Cat("Sonya", "ginger", 3, 200, 2);
        Dog dog1 = new Dog("Ram", "black", 5, 500, 0.5, 10);
        Bird bird1 = new Bird("Kesha", "yellow", 3, 5, 0.5);
        Horse horse1 = new Horse("Maplehoof", "white", 4, 1500, 3, 100);
        Dog dog2 = new Dog("Rex", "grey", 6, 400, 1, 20);

        Animal[] arr = {cat1, dog1, bird1, horse1, dog2};

        boolean a = arr[0].run(150);
        System.out.println(runResult(arr[0].name, a));

        boolean b = arr[1].run(600);
        System.out.println(runResult(arr[1].name, b));

        //на птичке до меня неожиданно дошло, что вызов метода run и есть булевая переменная
        //так что я решил попробовать не создавать отдельную для метода runResult и запихать ее прям так:
        System.out.println(runResult(arr[2].name, arr[2].run(4)));

        System.out.println(runResult(horse1.name, horse1.run(2000)));

        System.out.println(swimResult(bird1.name, bird1.swim(10)));

        //я вот тут не стал пробовать, чтобы все не сломать, а задам глупый вопрос: можно ли переписать дефолтный геттер, чтобы выводить "Кот такой-то (не)сделал что-то"?
        System.out.println(cat1.getClass() + " " + swimResult(cat1.name, cat1.swim(50)));

        //А вот здесь мне интересно, корректно ли сработает мой код при групповом забеге и при участии двух собак с разными ограничениями
        for (int i = 0; i < arr.length; i++) {
            System.out.println(runResult(arr[i].name, arr[i].run(450)));

        }

        System.out.println(jumpResult(cat1.name, cat1.jump(1)));






    }

}
