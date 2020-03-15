package ru.geekbrains.homework4;

public class Staff {
    private static final int CURRENT_YEAR = 2020;
    private String name;
    private String post;
    private int salary;
    private final int birthDate;
    private static int amountEmployees;
    private int ID;
    private static int number = 1;



    public Staff(String name, String post, int salary, int birthDate) {
        this.name = name;
        this.post = post;
        this.salary = salary;
        this.birthDate = birthDate;
        this.ID = number++;
        amountEmployees++;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPost() {
        return this.post;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getAge() {
        return CURRENT_YEAR - birthDate;
    }

    public static int getAmountEmployees() {
        return amountEmployees;
    }

    public String getID() {
        return Integer.toString(this.ID) + Integer.toString(this.birthDate);
    }

}

