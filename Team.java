package by.geebrains.lesson1;

import com.sun.xml.internal.ws.wsdl.writer.document.Part;

public class Team {
    private String name;

    private Team(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Participant participant1 = new Participant("Dazai", 50, 100, 10);
        Participant participant2 = new Participant("Chuuya", 70, 800, 30);
        Participant participant3 = new Participant("Akiko", 40, 700, 20);
        Participant participant4 = new Participant("Atsushi", 100, 1000, 100);
        Team team = new Team("BSD");
        Object[] part = {participant1, participant2, participant3, participant4};
        for (int i = 0; i < part.length; i++) {
            System.out.print(part[i] + " ");
        }
        System.out.println();
        Course c = new Course();
        Barrier barrier1 = new Barrier("Swimming pool", 50);
        Barrier barrier2 = new Barrier("Running track", 500);
        Barrier barrier3 = new Barrier("Bag jumping", 10);
        Object[] barr = {barrier1, barrier2, barrier3};
        if(participant1.swim >= barrier1.length && participant1.run >= barrier2.length && participant1.jump >= barrier3.length) {
            System.out.println(participant1.name + " passed all barriers");
        }
        if(participant2.swim >= barrier1.length && participant2.run >= barrier2.length && participant2.jump >= barrier3.length) {
            System.out.println(participant2.name + " passed all barriers");
        }
        if(participant3.swim >= barrier1.length && participant3.run >= barrier2.length && participant3.jump >= barrier3.length) {
            System.out.println(participant3.name + " passed all barriers");
        }
    }

    public static void doIt() {
    }
}

class Course {
    int[] barr = new int[3];

    public Course() {
        this.barr = barr;
    }

    public static void createBarriers() {

    }
}

class Participant {
    String name;
    int swim, run, jump;

    public Participant(String name, int swim, int run, int jump) {
        this.name = name;
        this.swim = swim;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public String toString() {
        return "Participant: " + name + " / Can swim: " + swim + " / Can run: " + run + " / Can jump: " + jump;
    }
}

class Barrier {
    String name;
    int length;

    public Barrier(String name, int length) {
        this.name = name;
        this.length = length;
    }
}