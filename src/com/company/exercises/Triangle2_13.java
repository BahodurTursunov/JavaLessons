package com.company.exercises;

// Объявить класс Triangle, хранящий три координаты вершин.
// Координаты представить в виде ссылок на класс Point,
// который рассмотрен на этом занятии.
// Реализовать два конструктора: без аргументов и с шестью аргументами(по два на каждую координату).
// Создать два объекта, вывести координаты вершин по каждому объекту в консоль.

public class Triangle2_13 {
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println("Первая Координата a на первой плоскости = " + p.a +
                " \nВторая Координата b на первой плоскости = " + p.b +
                " \nТретья Координата c на первой плоскости = " + p.c);
        Point p2 = new Point(100, 200, 300);
        System.out.println("Первая Координата a1 на второй плоскости = " + p2.a1 +
                " \nВторая Координата b1 на второй плоскости = " + p2.b1 +
                " \nТретья Координата c1 на второй плоскости = " + p2.c1);


    }
}


class Point {
    int a;
    int b;
    int c;
    int a1;
    int b1;
    int c1;


    Point() {
        a = 10;
        b = 20;
        c = 30;
    }

    Point(int a1, int b1, int c1) {
        //this();
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
    }
}
//    public int getA1() {
//        return a1;
//    }
//
//    public int getB1() {
//        return b1;
//    }
//
//    public int getC1() {
//        return c1;
//    }

