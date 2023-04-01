package com.company;

public class Java13 {
    public static void main(String[] args) {
        Point pt = new Point();
        //Point pt1 = new Point(10, 20);
        Point pt2 = new Point(10, 20);
        System.out.println("x = " + pt.x + ", y = " + pt.y + ", color = " + pt.color);
        //System.out.println("x = " + pt1.x + ", y = " + pt1.y);
        System.out.println("x = " + pt2.x + ", y = " + pt2.y + ", color = " + pt2.color);
    }
}

// и когда мы задаем в классе несколько конструкторов, то это называется перегрузкой конструктора.
//class Point { // класс Point // конструктор по умолчанию
//    int x, y;
//    int color;
//
//    Point() { // конструктор класса Point // явно заданный конструктор
//        x = -1;
//        y = -1;
//        color = 0;
//    }
//
////    Point(int argx, int argy) {
////        x = argx;
////        y = argy;
////    }
//
//    Point(int x, int y) {
//        this(); // вызов первого конструктора без аргументов
//        this.x = x;
//        this.y = y;
//    }
//}

class Point {
    int x;
    int y;
    int color;

    {
        x = -1;
        y = -2;
        color = 100;
    }

    Point() {
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}










