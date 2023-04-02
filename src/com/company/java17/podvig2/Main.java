package com.company.java17.podvig2;

// Описать класс для представления музыкальных инструментов с полями: название, тип(целое число), габариты, цена, год производства.
// Поле "габариты" реализовать в виде внутреннего класса с полями: width, height, depth.
// Также добавить вложенный статический класс для накопления статистики по инструментам: количество объектов по типам.

import java.awt.*;

public class Main {
    public static void main(String[] args) {

    }
}

class MusicalInstrument {
    private String name;
    private int type;
    private Dimension dimensions; // габариты
    private double price; // цена
    private int year; // год производства

    public MusicalInstrument(String name, int type, double price, int year, double width, double height, double depth) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.year = year;
        //this.dimensions = new Dimension(width, height, depth);
    }
}
