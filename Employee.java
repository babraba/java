package ru.geekbrains.lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void Array() {
        Employee emp[] = new Employee[5];
        emp[0] = new Employee("Ivan Ivanov", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        emp[1] = new Employee("Dana Saparova", "Manager", "saparova@gmail.com", "869321990", 25000, 25);
        emp[2] = new Employee("Maria Voronova", "QA", "m.voronova@yandex.ru", "896741523", 30000, 36);
        emp[3] = new Employee("Daniil Nemtsov", "Translator", "dan_nemtsov@hotmail.com", "897500366", 40000, 41);
        emp[4] = new Employee("Michail Somov", "CEO", "michsomov@gmail.com", "895231004", 60000, 50);
    }

    public String output(Employee emp[]) {
        return "ФИО: " + name + "/" + "Должность: " + position + "/" + "email: " + email + "/" + "Телефон: " + phone + "/" + "Зарплата: " + salary + "/" + "Возраст: " + age;
    }

    public static void fourtyYears(Employee emp[]) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].age > 40) {
                System.out.print(emp[i] + " ");
            }
            System.out.println();
        }

    }
}
