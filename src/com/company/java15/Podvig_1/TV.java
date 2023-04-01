package com.company.java15.Podvig_1;

// Подвиг 1: Объявите класс для хранения информации по телевизорам с полями: марка, размер диагонали,
// год производства, цена. Доступ к данным реализовать через сеттеры и геттеры. Определить минимум два конструктора:
// первый должен только инициализировать данные, другие - создать новый объект с разными аргументами.
// Запретить создавать объект без аргументов.
public class TV {
    public String mark;
    public double sizeOfDiagonal;
    public int yearOfProduction;
    public int cost;

    public TV() {

    }

    public void setTV(String mark, double sizeOfDiagonal, int yearOfProduction, int cost) {
        this.mark = mark;
        this.sizeOfDiagonal = sizeOfDiagonal;
        this.yearOfProduction = yearOfProduction;
        this.cost = cost;
    }

    public String getMark() {
        return mark;
    }

    public double getSizeOfDiagonal() {
        return sizeOfDiagonal;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getCost() {
        return cost;
    }
}



