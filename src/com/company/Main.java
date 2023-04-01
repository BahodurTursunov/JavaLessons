package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////
////        System.out.print("Input name: ");
////        String name = in.nextLine();
////        System.out.print("Input age: ");
////        int age = in.nextInt();
////        System.out.print("Input weight: ");
////        float weight = in.nextFloat();
////        System.out.printf("Name: %s Age: %d Weight: %.2f", name, age, weight);
////        in.close();
////        Scanner in = new Scanner(System.in);
////        int x = in.nextInt();
////
////        if(x < 0) x = x*-1;
////        else {
////            x=x*2;
////        }
////        System.out.println(x);
////        in.close();
////        float x;
////        Scanner in = new Scanner(System.in);
////        System.out.println("Введите число: "); x = in.nextFloat();
////
////        if(x < 0) System.out.println("Введенное число "+x+" является отрицательным.");
////        else if(x > 0) System.out.println("Введенное число "+x+" является положительным.");
////        else System.out.println("Число равно 0.");
////        short item = -1;
////        Scanner in = new Scanner(System.in);
////        System.out.print("1 - площадь треугольника\n2 - площадь прямоугольника\n");
////        item = in.nextShort();
////
////        double h, a, S = 0;
////        if (item == 1) {
////            System.out.print("Введите высоту и основание треугольника: ");
////            h = in.nextDouble();
////            a = in.nextDouble();
////            S = 0.5*h*a;
////        }
////        else if (item == 2){
////            System.out.println("Введите стороны прямоугольника: ");
////            h = in.nextDouble();
////            a = in.nextDouble();
////            S = h * a;
////        }
////        System.out.println("Площадь равна: " + S);
////        double a;
////        Scanner in = new Scanner(System.in);
////        a = in.nextDouble();
////
////        if (a >= -2 && a <= 4)
////            System.out.println("a принадлежит [-2; 5]");
////
////        if (a < -2 || a > 5)
////            System.out.println("a не принадлежит [-2; 5]");
////
////        if (!(a < -2 || a > 5))
////            System.out.println("a непринадлежит [-2; 5]");
////
////        boolean fl = true;
////        if (fl) System.out.println("fl = true");
////        if (!fl) System.out.println("fl = false");
////
////        int x = -1, y = 5;
////        if ((x < 0 || x > 2) && y >= 5 && y <= 7)
////            System.out.println("x не принадлежит [0;2], y принадлежит [5;7]");
//    // оператор Switch
////        short item;
////        System.out.print("0 - выход из программы\n1 - площадь треугольника" +
////                "\n2 - площадь прямоугольника" +
////                "\n3 - площадь круга" +
////                "\n4 - площадь трапеции\n");
////        Scanner in = new Scanner(System.in);
////        item = in.nextShort();
////
////        switch(item) {
////            case 0:System.out.println("Выход из программы"); break;
////            case 1:System.out.println("Выбрана площадь треугольника"); break;
////            case 2:System.out.println("Выбрана площадь прямоугольника"); break;
////            case 3:System.out.println("Выбрана площадь круга"); break;
////            case 4:System.out.println("Выбрана площадь трапеции"); break;
////            default:System.out.println("не выбран ни один из пунктов меню");
////        }
////        in.close();
//        ///////////////////////
//        Scanner in = new Scanner(System.in);
//
//        int x = in.nextInt();
//        int y = in.nextInt();
//        int z = in.nextInt();
//        int countP = 0;
//        int countM = 0;
//
//        if (x > 0) countP++;
//        else countM++;
//        if (y > 0) countP++;
//        else countM++;
//        if (z > 0) countP++;
//        else countM++;
//        System.out.println("Положительных чисел: " + countP);
//        System.out.println("Отрицательных чисел: " + countM);

        // Операторы циклов while, for, do, while
//        Scanner in = new Scanner(System.in);
//        double s = 0;
//        int i = 1;

//        while (n<=1000){
//            s += 1.0 / n;
//            n++;
//        }
//        while (s < 100 && n != 0){
//            System.out.print("Введите число: ");
//            n = in.nextInt();
//            s += n;
//        }
//        while ((s += ++i) < 50);
//        System.out.println(s);

//
//        for (int n = 1; n <= 1000; ++n) s += 1.0/n;
//        System.out.println(s);


//        final int sercetCode = 13;
//        int codeEnt;
//
//        do{
//            System.out.print("Введите секретный код: ");
//            codeEnt = in.nextInt();
//        } while (codeEnt != sercetCode);
//        System.out.print("Вы ввели верный код!");


//        int N = 7, M = 7, S = 0;
//        for (int i = 0; i < N; ++i)
//            for (int j = 0; j < M; ++j)
//                S += i * j;
//        System.out.println(S);
//        // break
//        double f, k = 0.5, b = 2, x = 0;
//        for (; ; ) {
//            if (x > 1) break;
//            f = k * x + b;
//            System.out.println(f + " ");
//            x += 0.1;
//        // continue
//        float x, S = 0;
//        int n = 0;
//        Scanner in = new Scanner(System.in);
//        do {
//            System.out.print("Введите число: ");
//            x = in.nextFloat();
//            if (x < 0) continue;
//            n++;
//            S += x;
//            System.out.println("Текущая сумма : " + S);
//        } while (n < 5);
//        short day = 0;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Выберите день недели: " +
//                "\n1 - Понедельник" +
//                "\n2 - Вторник" +
//                "\n3 - Среда" +
//                "\n4 - Четверг" +
//                "\n5 - Пятница" +
//                "\n6 - Суббота" +
//                "\n7 - Воскресенье");
//        day = in.nextShort();
//        switch (day){
//            case 1: System.out.print("Выбран понедельник"); break;
//            case 2: System.out.print("Выбран вторник"); break;
//            case 3: System.out.print("Выбрана среда"); break;
//            case 4: System.out.print("Выбран четверг"); break;
//            case 5: System.out.print("Выбрана пятница"); break;
//            case 6: System.out.print("Выбрана суббота"); break;
//            case 7: System.out.print("Выбрана воскресенье"); break;
//            default:
//                System.out.println("Такого дня недели не существует долбаеб!!");
//        }

//        // массивы

//        float y[] = new float[100];
//        float k = 0.5f, b = 2.0f;
//
//        for (int x = 0; x < 100; ++x)
//            y[x] = k * x + b;
//
//        for (int x=0;x<100;++x)
//            System.out.println(y[x] + " ");
//        int powers[] = new int[]{1, 2, 4, 6};
//        for (int x = 0; x < powers.length; ++x)
//            System.out.print(powers[x] + " ");
//        System.out.println(powers[powers.length - 1]);


//        final int N = 10;
//        int[][] e = new int[N][N];
//
//        for (int i = 0; i < N; ++i)
//            for (int j = 0; j < N; ++j)
//                if (i == j) e[i][j] = 1;
//                else e[i][j] = 0;
//
//        for (int i = 0; i < N; ++i) {
//            for (int j = 0; j < N; ++j)
//                System.out.print(e[i][j] + " ");
//            System.out.print("\n");
//
//        }
//        short[][] z = new short[5][];//<-------------------------// элемент первого значения двумерного массива
//        z[0] = new short[3];                                    //
//        z[1] = new short[4];                                    //
//        z[2] = new short[2];                                    //
//        z[3] = new short[3];                                    //
//        z[4] = new short[1];                                    //
//                                                                //
//        short cnt = 1;                                          //
//        for (int i = 0; i < z.length; ++i) // здесь z.length это
//            for (int j = 0; j < z[i].length; ++j) {
//                z[i][j] = cnt;
//                cnt++;
//            }
//        for (int i = 0; i < z.length; ++i) {
//            for (short val : z[i])// for(<тип данных>:<коллекция>{тело цикла} // такой цикл позволяет перебирать все i-тые строки массива z
//                System.out.print(val + " ");
//            System.out.print("\n");
//        }
//        final int n = 9;
//        short[] a = new short[n];
//
//        for (int i = 0; i < n; ++i) a[i] = (short) (i + 1);
//
//        for (int i = 3; i < n - 1; ++i)
//            a[i] = a[i + 1];
//
//        for (short val : a) System.out.print(val + " ");


//        short[] a = new short[]{1, 2, 3, 5, 6, 7, 8, 9, 9};
//        for (int i = 8; i > 3; --i)
//            a[i] = a[i - 1];
//        a[3] = 4;
//
//        for (short val : a) System.out.print(val + " ");
//        // метод пузырька
//        byte[] a = {3, 5, 1, 6, 2, 4, 5, 4, 3, 6, 8, 7, 6, 4, 3};
//        for (int i = 0; i < a.length - 1; ++i) {
//            byte min = a[i];
//            int pos = i;
//
//            for (int j = i + 1; j < a.length; ++j)
//                if (min > a[j]) {
//                    pos = j;
//                    min = a[j];
//                }
//            byte t = a[i];
//            a[i] = a[pos];
//            a[pos] = t;
//        }
//        for (short val : a) System.out.print(val + " ");
    }
}


