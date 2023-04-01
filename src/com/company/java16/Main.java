package com.company.java16;

public class Main {
    public static void main(String[] args) {
        Point pt = new Point();
        Point pt2 = new Point();
        Point pt3 = new Point();
        System.out.println(Point.cnt);
        System.out.println(Point.getCounter());
    }
}

// static metod

//class Point {
//    static int cnt;
//    int x;
//    int y;
//    int c;
//
//    static {
//        cnt = 0;
//    }
//
//    {
//        x = y = c = -1;
//    }
//
//    Point() {
//        cnt++;
//    }
//
//    public static int getCounter(){
//        return cnt;
//    }
//}

// final metod

class Point {
    static final int cnt = 5; // final - это константа!
    int x;
    int y;
    int c;

    {
        x = y = c = -1;
    }

    Point() {
    }

    public static int getCounter(){
        return cnt;
    }
}