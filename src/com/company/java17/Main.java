package com.company.java17;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Жучка");
        d.run();
        Dog d2 = new Dog("Жучка 2");
        d2.run();
        System.out.println(Dog.Stat.counter);
    }
}

class Dog {
    private String name;
    private Foot foot = new Foot(); // foot Это ссылка на экземпляр внутреннего вложенного класса
    private int id = -1;

    {
        name = "";
        Stat.counter++;
        id = ++Stat.id;
    }

    Dog() {
    }

    Dog(String name) {
        this.name = name;
    }

    void run() {
        foot.run();
    }

    class Foot {
        String name = "Foot";

        void run() {
            System.out.println("Собака " + Dog.this.name + " бежит...");
        }
    }

    static class Stat {
        public static int counter = 0;
        public static int id = 0;

    }
}

