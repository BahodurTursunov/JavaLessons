package com.company.java18;


public class Main {
    public static void Main(String[] args) {
        Dog d = new Dog("Васёк");
        d.run();
    }
}

class Dog {
    private String name;
    private Foot foot;

    {
        name = "";
        foot = new Foot();
        System.out.println("Создан экземпляр класса foot");
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
        void run() {
            System.out.println("Собака " + name + " бежит");
        }
    }
}