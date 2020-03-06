package ru.geekbrains.homework2;

import java.util.Arrays;

public class tasks {
    //Метод, заменяющий в массиве 0 на 1 и 1 на 0.
    private static int[] changearray(int[] arr) {

        int[] arrchanged = arr;
        /*
        Я кажется уловил суть ошибки прошлого домашнего задания с ненужными переменными
        и то, как идея мне их подсвечивает, мол массив arrchanged - redundant, типа лишний
        Так правильно ли я понял: если метод принимает массив, и в этом методе я издеваюсь
        над этим самым массивом, то мне совершенно не нужно его еще раз объявлять, т.к.
        метод принимает массив и отдает массив? Даже если результатом работы метода будет
        что-то булевое, то в любом случае он по-умолчанию понимает с чем имеет дело и
        напоминать ему лишний раз - моветон?
         */
        for (int i = 0; i < arrchanged.length; i++) {
            if (arrchanged[i] == 1) {
                arrchanged[i] = 0;
            } else {
                arrchanged[i] = 1;
            }
        }
        return arrchanged;
    }
    /*
    Метод, заполняющий пустой целочисленный массив
    И вроде бы он работает.
    Но что-то у меня такое ощущение, что я придумал костыли.
    Причем, кривые костыли.
    */
    private static int[] fillingarray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[0] < 1) {
                arr[i] = i + 1;
            } else {
                arr[i] = arr[i - 1] + 3;
            }
        }

        return arr;
    }

    //Метод, умножающий числа массива, которые меньше 6, на 2
    private static int[] multiplicationarray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? arr[i] * 2 : arr[i];
            //if (array[i] < 6) {
            //    array[i] = array[i] * 2;
            //}
        }
        /*
        Внимание, вопрос: если я использую здесь if, то после необязательно дописывать else
        все и так работает. Но вот через присваивание с условием, идея ругается, что я не дописал
        в конце присвоить неизмененный array[i]. В этом есть какой-то глубинный смысл, или я чего-то не понимаю?
        Вроде бы, если условие (array[i] < 6) не выполняется, то оставить все как есть, как это делает if
         */


        return arr;
    }

    //Метод поиска минимума массива
    private static int minimum(int[] arr) {

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) { //метод работает, но вот зачем идея мне подсвечивает for? в предыдущих она не тригерилась
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

    //метод поиска максимума массива
    private static int maximum(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] agrs) {

        int[] arr1 = {0, 1, 1, 0, 1, 0, 1, 1, 0, 0};
        int[] arr2 = {1, 1, 1, 1, 0, 0, 1, 0, 1, 1};
        System.out.println("Заданный массив из 10 чисел: " + Arrays.toString(arr1));
        System.out.println("Измененный массив из 10 чисел: " + Arrays.toString(changearray(arr1)));
        System.out.println("Другой заданный массив из 10 чисел: " + Arrays.toString(arr2));
        System.out.println("Измененный второй массив из 10 чисел: " + Arrays.toString(changearray(arr2)));

        int[] arr3 = new int[8];
        System.out.println("Заполненный массив из 8 чисел: " + Arrays.toString(fillingarray(arr3)));

        int[] arr4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Заданый массив задачи 3: " + Arrays.toString(arr4));
        System.out.println("Измененный массив задачи 3: " + Arrays.toString(multiplicationarray(arr4)));

        int[] arr5 = {3, 5, 7, 9, 1, 11, 4, 0, 13, 8};
        System.out.println("Заданный массив задачи 4: " + Arrays.toString(arr5));
        System.out.println("Минимум массива: " + minimum(arr5));
        System.out.println("Максимум массива: " + maximum(arr5));
        /*
        Чисто для проверки я решил погонять метод на массиве задачки 3
         */
        System.out.println("Максимум массива из задачи 3: " + maximum(arr4) + " " + "Минимум массива из задачи 3: " + minimum(arr4));
        //и… ВНЕЗАПНО метод возвращает в качестве минимума двойку. Я не понимаю почему.

    }

}
