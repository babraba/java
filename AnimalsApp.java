package by.geekbrains.lesson6;

import java.util.Scanner;

public class AnimalsApp {
    public static void main(String[] args) {
        Animals animals = new Animals();
        do {
            animals.chooseAnimal();
            animals.enterNick();
            animals.chooseAct();
        }
        while(!animals.ifContinue(false));
    }
}

    class Animals {
        String animal;
        int dist;
        String nick;
        String act;
        String answer;

        public Animals() {

        }

        public void chooseAnimal() {
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Кот или собака будет выполнять действие?");
                animal = scanner.nextLine();
            }
            while (!isAnimalValid(false));
            enterNick();
            chooseAct();
            enterDist();
        }

        public void enterNick() {
            System.out.println("Как зовут животное?");
            Scanner scanner = new Scanner(System.in);
            nick = scanner.nextLine();
        }

        public void chooseAct() {
            Cat cat = new Cat();
            Dog dog = new Dog();
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Животное будет бежать или плыть?");
                act = scanner.nextLine();
            }
            while (!isActValid(true));
            enterDist();
            if(act.equals("бежать")) {
                run();
            }
            if(act.equals("плыть")) {
                swim();
            }
            System.out.println("Продолжить?");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
        }

        public void enterDist() {
            do {
                System.out.println("Введите расстояние в метрах");
                Scanner scanner = new Scanner(System.in);
                dist = scanner.nextInt();
            }
            while(!ifDistValid(true));
        }

        private boolean isAnimalValid(boolean d) {
            if(animal.equals("кот") || animal.equals("собака")) {
                return true;
            }
            else {
                return false;
            }
        }

        private boolean isActValid(boolean f) {
            if(act.equals("бежать") || act.equals("плыть")) {
                return true;
            }
            else {
                return false;
            }
        }

        boolean ifContinue(boolean b) {
            if(answer.equals("да")) {
                return true;
            } else {
                return false;
            }
        }

        void run() {
            if(animal.equals("кот") && act.equals("бежать") && dist <= 200) {
                System.out.println(nick + " пробежал " + dist + " метров");
            }
            if(animal.equals("кот") && act.equals("бежать") && dist > 200) {
                System.out.println("Кот не может пробежать такое расстояние!");
            }
            if(animal.equals("собака") && act.equals("бежать") && dist <= 500) {
                System.out.println(nick + " пробежал " + dist + " метров");
            }
            if(animal.equals("собака") && act.equals("бежать") && dist > 200) {
                System.out.println("Собака не может пробежать такое расстояние!");
            }
        }

        void swim() {
            if(animal.equals("кот") && act.equals("плыть")) {
                System.out.println("Кот не умеет плавать!");
            }
            if(animal.equals("собака") && act.equals("плыть") && dist <= 10) {
                System.out.println(nick + " проплыл " + dist + " метров");
            }
            if(animal.equals("собака") && act.equals("плыть") && dist > 10) {
                System.out.println("Собака не может проплыть такое расстояние!");
            }
        }

        boolean ifDistValid(boolean c) {
            if(dist > 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    class Dog extends Animals {

        public Dog() {

        }

    }

    class Cat extends Animals {

        public Cat() {

        }

    }

