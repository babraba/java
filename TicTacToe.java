package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    Random random;
    Scanner scanner;
    char[][] table;

    TicTacToe(){
       random = new Random();
       scanner = new Scanner(System.in);
       table = new char[3][3];
    }

    public static void main(String[] args) {
        new TicTacToe().game();
    }
    
    void game() {
        initTable();
        printTable();
        while(true) {
            turnHuman();
            if(checkWin('x')) {
                System.out.println("YOU WON!");
                break;
            }
            if(isTableFull()) {
                System.out.println("DRAW...");
                break;
            }
            turnAI();
            printTable();
            if(checkWin('o')) {
                System.out.println("AI WON!");
                break;
            }
            if(isTableFull()) {
                System.out.println("DRAW...");
                break;
            }
        }
    }

    private void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }
        while(!isCellValid(x, y));
        table[y][x] = 'o';
    }

    private boolean isTableFull() {
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table.length; j++) {
                if(table[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkWin(char symbol) {
        boolean right, left, col, row;
        right = true;
        left = true;
        col = true;
        row = true;
        for(int i = 0; i < table.length; i++) {
            right &= (table[i][i] == symbol);
            left &= (table[table.length-i-1][i] == symbol);
            }
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table.length; j++) {
                col &= (table[i][j] == symbol);
                row &= (table[i][j] == symbol);
            }
        }
        if (right || left || col || row) return true;
        return false;
        }

    private void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter x in [1 ... 3]: ");
            x = scanner.nextInt() - 1;
            System.out.println("Enter y in [1 ... 3]: ");
            y = scanner.nextInt() - 1;
            if(isCellValid(x, y) == false) {
                System.out.println("Your input isn't valid, try again");
            }
        }
        while(!isCellValid(x, y));
        table[y][x] = 'x';
    }

    private boolean isCellValid(int x, int y) {
        if(x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y][x] == '_';
    }

    private void printTable() {
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table.length; j++) {
               System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void initTable() {
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table.length; j++) {
                table[i][j] = '_';
            }
        }
    }
}
