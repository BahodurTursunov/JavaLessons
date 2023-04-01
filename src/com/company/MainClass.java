package com.company; // 10 видео методы в классах java перегрузка рекурсия

public class MainClass {
    public static void main(String[] args) {
//        // [модификаторы]<тип><имя метода>([аргументы]) {<тело медота>}
//        // [public | static]
//
//        int w = 5;
//        float h = 3.4f;
//
//        float P1 = perimetr(w, h);
//        float P2 = perimetr(5, 4);
//
//        System.out.println(P1);
//        System.out.println(P2);
//
//        byte[] array = {1, 3, 0, -2, 7, 9};
//        showAr(array);
//        System.out.print("\n");
//        showArr(1, 2, 3, 4, 5, 6, 7, 8, 9);
//
//        System.out.println("\n");
//        int a1 = modul(-3); // здесь из двух методов будет вызван первый метод с типом Int
//        int a2 = (int) (modul(-3.5)); // а здесь второй метод потому что входной аргумент double
//        double a3 = modul(3);
//        double a4 = modul(-3.5);
//
//        System.out.print(a1 + "\n" + a2 + "\n" + a3 + "\n" + a4);
//
//
//    }
//
//    static void showAr(byte[] ar) {
//        for (byte val : ar)
//            System.out.print(val + " ");
//    }
//
//    static void showArr(int... ar) {
//        for (int val : ar)
//            System.out.print(val + " ");
//    }
//
//    static float perimetr(float a, float b) {
//        return 2 * (a + b);
//    }
//
//    ///// перегрузка
//    static int modul(int x) {
//        if (x < 0) x = -x;
//        return x;
//    }
//
//    static double modul(double x) {
//        return (x < 0) ? -x : x;
//    }
//
//

        // рекурсивный метод
        upAndDown(1);

    }

    static void upAndDown(int n) {
        System.out.println("Уровень вниз " + n);
        if (n < 4) upAndDown(n + 1);
        System.out.println("Уровень вверх " + n);

    }
}
