package com.company.java15.Podvig_2;

import java.util.Scanner;

// В отдельном файле текущего пакета объявить класс для описания шкафов с полями:
// габариты, тип шкафа, цена, производитель, год производства. Прописать геттеры и сеттеры для доступа к полям класса.
// Добавить конструкторы для создания объектов. Запретить создавать объект без указания аргументов.
// Добавить метод вычисления объема шкафа по его габаритам.
// В основном классе (в функции main()) создать несколько экземпляров класса шкафов и вывести в консоль их габариты и объемы.
public class Wardrobe {
    public int dimensions; // габариты шкафа
    public String typeOfWardrobe; // тип шкафа
    public int cost;
    public String manufactured; // производитель
    public int yearOfProduction; // Год производства

    public Wardrobe() {

    }

    // сеттеры
    public void setWardrobe(String typeOfWardrobe, int cost, String manufactured, int yearOfProduction) {
        //this.dimensions = dimensions;
        this.typeOfWardrobe = typeOfWardrobe;
        this.cost = cost;
        this.manufactured = manufactured;
        this.yearOfProduction = yearOfProduction;

    }

    // метод вычисления объема шкафа
    public double Calc(int a, int b, int h) {
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        h = in.nextInt();
        dimensions = a * b * h;
        return dimensions;
    }

    //геттеры
    public int getDimensions() {
        return dimensions;
    }

    public String getTypeOfWardrobe() {
        return typeOfWardrobe;
    }

    public int getCost() {
        return cost;
    }

    public String getManufactured() {
        return manufactured;
    }

    public int getYearOfProduction(int yearOfProduction) {
        return yearOfProduction;
    }

    public double getCalc() {
        return dimensions;
    }
}


