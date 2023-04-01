package com.company.java17;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Жучка");
        d.run();
        d.run();
//        Dog d2 = new Dog("Жучка 2");
//        d2.run();
    }
}

class Dog {
    private String name;
    //private Foot foot; // foot Это ссылка на экземпляр внутреннего вложенного класса

    {
        name = "";
    }

    Dog() {
    }

    Dog(String name) {
        this.name = name;
    }

    void run() {
        class Foot {
            String name = "Foot";
            void run() {
                System.out.println("Собака " + Dog.this.name + " бежит...");
            }
        }
        Foot foot = new Foot();
        System.out.println("Создан экземпляр класса foot");
        foot.run();
        
    }


}

