package com.company.java15.Animal;

public class AnimalInheritanceTest {
    public static void main(String[] args) {
        Cat cat = new Cat(false, "milk", 4, "black");
        System.out.println("Is cat vegetarian? " + cat.isVegetarian());
        System.out.println("Cats food " + cat.getEats());
        System.out.println("Cats have " + cat.getNoOfLegs() + " legs");
        System.out.println("Our cat have " + cat.getColor() + " color");
    }
}
