package com.company.java18;

public class Main {
    public static void main(String[] args) {
//        Line l1 = new Line();
//        l1.width = 1;
//        l1.x1 = 5;
//        Properties p = l1;
//        p.color = 5;
//        p.width = 10;
//        System.out.println(l1.width);
        Properties[] geom = new Properties[4];
        geom[0] = new Line();
        geom[1] = new Triangle();
        geom[2] = new Rectangle();
        geom[3] = new Ellipse();

    }
}

class Geom {
    int id;
}
class Properties extends Geom {
    int width, color;

    Properties() {
        System.out.println("Конструктор Properties");
    }
}

class Line extends Properties {
    double x1, y1;
    double x2, y2;

    Line() {
        System.out.println("Конструктов Line");
    }
}

class Triangle extends Properties {
    double x1, y1;
    double x2, y2;
    double x3, y3;
}

class Rectangle extends Properties {
    double x1, y1;
    double x2, y2;
}

class Ellipse extends Properties {
    double x1, y1;
    double x2, y2;
}