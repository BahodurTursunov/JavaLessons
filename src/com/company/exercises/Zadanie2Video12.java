package com.company.exercises;

// Объявить класс line который бы хранил две координаты: начало, и конец линии. Создать два таких объекта, записать и вывести их в консоль
public class Zadanie2Video12 {
    public static void main(String[] args) {
        Line x = new Line();
        x.startX = 10;
        x.endY = 5;

        System.out.println();

    }
}

class Line {
    int startX, endY;
}


