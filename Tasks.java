package ru.geekbrains.homework1;

public class Tasks {

    private static double calculation(int a, int b, int c, int d) { //непонятно, зачем идея подсвечивает мне переменные

        double e = d;
        return (a * (b + (c / e)));
        /*
        Пара вопросов по заданию:
        1) Вопрос объявлений переменных float и double, int и long мы разбирали и выяснили, что double
        занимает памяти больше чем float точно так же, как long занимает памяти больше чем int, потому что
        первое более точное, а второе вмещает большее значение. Соответственно, в вопросе оптимизации программы,
        имеет ли смысл использовать менее требовательные к памяти переменные или можно не морочить себе голову и
        в 75% случаев обходиться int и double, даже когда речь идет о значениях 4, 7, 12, 1.5, 3.25 и т.п.?
        2) Предположим, конструкция return (a * (b + (c / e))); вполне удобна, и в рамках той же оптимизации хороша,
        потому что занимает ровно одну строчку. Однако, если я ощущаю некоторую неувереность и хочу писать так:

        double f;
        f = (a * (b + (c / e)));
        return f;

        Чтобы мне самому было понятно что откуда берется, насколько это плохо с точки зрения стиля кода?

         */

    }

    private static boolean checksum(int a, int b) {

        int c = a + b;
        boolean d;
        if (c >= 10 && c <= 20) { //Вот здесь я не понимаю, почему идея подсвечивает мне if
            d = true;
        } else {
            d = false;
        }
        return d;

    }

    private static void checknumber(int a) {

        if (a >= 0) {
            System.out.println("Заданное число " + a + " положительное");
        } else {
            System.out.println("Заданное число " + a + " отрицательное");
        }

    }

    private static String hellodude(String s) { //метод работает, однако зачем идея подчеркивает мне название метода?

        return "Привет " + s + "!";

    }

    private static boolean checkyear(int year) { //такой же вопрос, как и с hellodude

        double a = 4;
        double b = 400;
        double c = 100;
        boolean result;

        if (((year % a) == 0) || ((year % b) == 0)){
            result = true;
        } else if (((year % c) == 0) && year != 2000) { //в идеале, здесь надо еще добавить исключение != 1000 а будет ли работать с тремя условиями?
            result = false;
        } else {
            result = false;
        }

        return result;

    }

        public static void main(String[] agrs) {
            /*
            В условиях домашнего задания нет вывода в консоль для задач 1 и 2, но для самопроверки
            я решил вывести результат. Не знаю, будет ли считаться это ошибкой
             */
            System.out.println(calculation(3, 5, 9, 2));
            System.out.println(checksum(9,2));
            System.out.println(checksum(12,14));
            checknumber(-2);
            checknumber(3);
            System.out.println(hellodude("Luke"));
            System.out.println(hellodude("Bart"));
            System.out.println("Является ли год 2020 високосным? - " + checkyear(2020));
            System.out.println("Является ли год 2013 високосным? - " + checkyear(2013));
            System.out.println("Является ли год 2000 високосным? - " + checkyear(2000));
            System.out.println("Является ли год 1808 високосным? - " + checkyear(1808));

        }

}
