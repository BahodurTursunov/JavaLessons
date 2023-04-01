package com.company; // 12 видео https://youtu.be/G-doz__RavI?list=PLA0M1Bcd0w8ylU5QOQvRhS7TaaWCgnys3

// классы и экземлпяры классов
public class MainOOP {
    public static void main(String[] args) {
        Point pt = new Point();
        System.out.println("x = " + pt.x + ", y = " + pt.y);
    }

    static class Point {
        int x, y;
        Point(){
            x = -1; y = -1;
        }
    }



}
