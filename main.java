package ru.geekbrains.homework4;

/*
1 Создать класс "Сотрудник" с полями: Фамилия, зарплата, возраст, должность; +
2 Конструктор класса должен заполнять эти поля при создании объекта; +
3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля; +
4 Вывести при помощи методов из пункта 3 ФИО и должность. +
5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет; +/-
6* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000. +
7* Подсчитать средние арифметические зарплаты и возраста сотрудников из п.5 +
8*** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер
 */

public class main {

    private static void raise(Staff[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].getAge() > 45 && a[i].getPost() != "CEO") {
                a[i].setSalary(a[i].getSalary() + 5000);
            }
        }
    }

    private static int averageAge(Staff[] a) {
        int sumAge = 0;
        int result;
        for (int i = 0; i < a.length; i++) {
             sumAge += a[i].getAge();
        }
        result = sumAge / Staff.getAmountEmployees();
        return result;
    }

    private static int averageSalary(Staff[] a) {
        int sumSalary = 0;
        int result;
        for (int i = 0; i < a.length; i++) {
            sumSalary += a[i].getSalary();
        }
        result = sumSalary / Staff.getAmountEmployees();
        return result;
    }

    public static void main(String[] agrs) {

        Staff employee1 = new Staff("Stark", "CEO", 100000, 1970);
        Staff employee2 = new Staff("Ivanov", "Engineer", 50000, 1972);
        Staff employee3 = new Staff("Petrov", "Tester", 40000, 1973);
        Staff employee4 = new Staff("Sidorov", "Administrator", 35000, 1974);
        Staff employee5 = new Staff("Thunberg", "Cleaning manager", 25000, 2003);

        System.out.println("Сотрудник: " + employee1.getName() + ", возрастом " + employee1.getAge() + " Занимает должность " + employee1.getPost() + " и получает " + employee1.getSalary() + "RUR в месяц.");
        System.out.println("Сотрудник: " + employee2.getName() + ", возрастом " + employee2.getAge() + " Занимает должность " + employee2.getPost() + " и получает " + employee2.getSalary() + "RUR в месяц.");
        System.out.println("Сотрудник: " + employee5.getName() + ", возрастом " + employee5.getAge() + " Занимает должность " + employee5.getPost() + " и получает " + employee5.getSalary() + "RUR в месяц.");
        System.out.println("Всего сотрудников: " + Staff.getAmountEmployees());


        Staff[] arr = {employee1, employee2, employee3, employee4, employee5};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > 40) {
                System.out.println(arr[i].getName() + " старше 40 лет, ");
            }
        }

        raise(arr);
        System.out.println("Сотрудник: " + employee1.getName() + ", возрастом " + employee1.getAge() + " Занимает должность " + employee1.getPost() + " и получает " + employee1.getSalary() + "RUR в месяц.");
        System.out.println("Сотрудник: " + employee2.getName() + ", возрастом " + employee2.getAge() + " Занимает должность " + employee2.getPost() + " и получает " + employee2.getSalary() + "RUR в месяц.");
        System.out.println("Средний возраст сотрудников: " + averageAge(arr));
        System.out.println("Средняя зарплата сотрудников: " + averageSalary(arr));

        System.out.println("ID сотрудника " + employee1.getName() + " - " + employee1.getID());
        System.out.println("ID сотрудника " + employee2.getName() + " - " + employee2.getID());




















    }

}
