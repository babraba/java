package ru.geekbrains.lesson2;

import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {
        checkNumber();
        checkPositive();
        checkBool();
        writeString();
        checkYear();
    }

    public static void checkNumber() {
        int i, y;
        boolean a, b;
        a = true;
        b = false;
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        System.out.println("Введите второе число");
        y = scanner.nextInt();
        if (i >= 10 && i <= 20 && y >= 10 && y <= 20) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void checkPositive() {
        int c;
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextInt();
        if (c >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void checkBool() {
        int d;
        boolean e,f;
        e = true;
        f = false;
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        d = scanner.nextInt();
        if (d < 0) {
            System.out.println(e);
        } else {
            System.out.println(f);
        }
    }

    public static void writeString() {
        int x, z;
        z = 0;
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println("Введите число");
        x = scanner.nextInt();
        for (z = 0; z < x; z++) {
            System.out.println(line);
        }

    }

    public static void checkYear() {
        int n;
        float m, j;
        boolean p, r;
        p = true;
        r = false;
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = n / 4;
        j = n / 100;
        if (m % 1 == 0 && j % 1 != 0) {
            System.out.println(p);
        } else {
            System.out.println(r);
        }
    }

}
