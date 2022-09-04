package ru.geekbrains.lesson3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        changeArr();
        fullHundred();
        multiplySix();
        twoDimArray();
        putArg();
    }

    public static void changeArr() {
        int[] arr = {1, 0, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fullHundred() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void multiplySix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] < 6) {
               arr[i] = i * 2;
           }
           System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void twoDimArray () {
        int counter = 1;
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void putArg () {
        int len, initialValue;
        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        len = scanner.nextInt();
        System.out.println("Введите значение ячейки массива");
        initialValue = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}