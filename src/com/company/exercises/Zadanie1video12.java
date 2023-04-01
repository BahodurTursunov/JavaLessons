package com.company.exercises;

// Объявить класс Point3D для хранения координат трехмерного пространства. Создать три таких объекта, записать в них различные координаты и вывести в консоль

public class Zadanie1video12 {
    public static void main(String[] args) {
        Point3D pd = new Point3D();
        pd.x = 10;
        pd.y = 5;
        pd.z = 3;

        Point3D pd1 = new Point3D();
        pd1.x = 12;
        pd1.y = 53;
        pd1.z = 32;

        Point3D pd2 = new Point3D();
        pd2.x = 101;
        pd2.y = 52;
        pd2.z = 31;

        System.out.println("Первый объект -> x = " + pd.x + " y = " + pd.y + " z = " + pd.z);
        System.out.println("Второй объект -> x = " + pd1.x + " y = " + pd1.y + " z = " + pd1.z);
        System.out.println("Третий объект -> x = " + pd2.x + " y = " + pd2.y + " z = " + pd2.z);
    }
}

class Point3D {
    int x, y, z;
}
