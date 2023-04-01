package com.company; // 8-9 video https://youtu.be/ORmumFHvn-Q?list=PLA0M1Bcd0w8ylU5QOQvRhS7TaaWCgnys3

import java.util.Scanner;


public class MainString {
    public static void main(String[] args) {

//        int a, b, c = 0; // codewars
//        Scanner in = new Scanner(System.in);
//        a = in.nextShort();
//        b = in.nextShort();
//        for (int i = a; i <= b; ++i) {
//            c += i;
        //System.out.println(c);
//        }


        // прочитать документацию про строки в Java!!!!

//        String str1 = "Java";
//        String str2 = new String(); // пустая строка
//        String str3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
//        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}); // здесь цифра 3 и 4 значат что начиная с третьего значения берем 4 последующих
//
//
//        String str1 = "Java";
//        String str2 = "Hello world!";
//
//        System.out.println(str1.length());
//        char [] helloArray = str2.toCharArray();
//
//        String s = null; // Null Значит что строка s ни на что не указывает
//
//        if(s ==  null || s.length() == 0) System.out.println("string is empty");
//        if(s == null || s.isEmpty()) System.out.println("string is empty");

//        String str1 = "Java";
//        String str2 = "Hello";
//        String str3 = str1 + str2;
//
//        String str4 = String.join(" ", str2, str1);
//        System.out.println(str4);
//
//
//        String str = "Java";
//        char c = str.charAt(2);
//
//        System.out.println(c);


//        String str = "Hello world!";
//        int start = 6;
//        int end = 11;
//        char[] dst = new char [end - start];
//        str.getChars(start,end,dst,0); // пояснение метода https://sun9-63.userapi.com/impg/AjVIufRGmPgqOWlpf03-Dqz4jrNap7FC7ob0bw/mlmCF3F_8yg.jpg?size=1920x1080&quality=96&sign=4462bc4ff3694be2a7c3fc2b9ed4dfa1&type=album
//        System.out.println(dst);


//        String str1 = "Hello";
//        String str2 = "hello";
//
//        System.out.println(str1.equals(str2)); // false
//        System.out.println(str1.equalsIgnoreCase(str2)); // true
//        // в йаве вместо оператора сравнивания (==) лучше использовать метод equals

//
//        String str1 = "hello";
//        String str2 = "world";
//        String str3 = "hell";
//
//        System.out.println(str1.compareTo(str2));
//        System.out.println(str1.compareTo(str3));
//        System.out.println(str1.compareTo(str1));


//-------------------------------------------------- https://sun9-28.userapi.com/impg/CBjv-tNkoH5btSXTtpJbPCJCo9ltQRPckSCzvg/bqcCozfVhSE.jpg?size=1920x1080&quality=96&sign=ab57bad89c9765b10e3d1175f68c61b8&type=album
//        String str1 = "Hello world";
//        String str2 = "I work";
//        boolean result = str1.regionMatches(6, str2, 2, 3);
//
//        System.out.println(result); // пояснение
//        String str = "Hello world";
//        int index1 = str.indexOf('l'); //2
//        int index2 = str.indexOf("wo"); // 6
//        int index3 = str.lastIndexOf('l'); // 9
//
//        System.out.println(index1 + " " + index2 + " " + index3);

//
//        String str = "myfile.exe";
//        boolean start = str.startsWith("my"); //true
//        boolean end = str.endsWith("exe"); //true
//
//        System.out.println(start + " " + end);

//      String str = "Hello world";
//      String replStr1 = str.replace('l', 'd'); // заменяет в строке все буквы l на d
//      String replStr2 = str.replace("Hello", "Bye");
//
//      System.out.println(replStr1);
//      System.out.println(replStr2);

//        String str = "  hello world  ";
//        str = str.trim(); // hello world // метод trim позволяет обрезать все пробелы слева и справа у строки
//        System.out.println(str);

//        String str = "Hello/world";
//        String substr1 = str.substring(6); // world
//        String substr2 = str.substring(3,5); // lo
//        System.out.println(substr1);
//        System.out.println(substr2);
//
//        String str = "Hello world";
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//
//        String text = "Я люблю язык Java!";
//        String[] words = text.split(" ");
//        for (String word : words)
//            System.out.println(word);
//------------------------------------------------------
        // String 2

//        String str =  "Java";
//        StringBuffer strBuffer = new StringBuffer(str);
//        System.out.println("Емкость: " + strBuffer.capacity()); // 20
//        strBuffer.ensureCapacity(32);
//        System.out.println("Емкость: " + strBuffer.capacity()); // 42
//        System.out.println("Длина: " + strBuffer.length()); // 42

//        String str = "Java";
//        StringBuffer strBuffer = new StringBuffer(str);
//        System.out.println(strBuffer.toString()); // Java
//
//        StringBuffer strBuffer = new StringBuffer("Java");
//        char c = strBuffer.charAt(0); // J
//        System.out.println(c);
//        strBuffer.setCharAt(0, 'c');
//        System.out.println(strBuffer.toString()); // cava


        // Создайте супер класс Shape и его наследники Circle, Rectangle. Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
        // Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры. В цикле нарисовать их (вызвать метод draw).
        // Добавить метод equals() для классов Shape, Circle, Rectangle.
//
//        StringBuffer strBuffer = new StringBuffer("world");
//        int startIndex = 1;
//        int endIndex = 4;
//        char[] buffer = new char[endIndex - startIndex];
//        strBuffer.getChars(startIndex, endIndex, buffer, 0);
//        System.out.println(buffer);

//        StringBuffer strBuffer = new StringBuffer("hello");
//        strBuffer.append(" world");
//        System.out.println(strBuffer.toString());

//        StringBuffer strBuffer = new StringBuffer("word");
//        strBuffer.insert(3, 'l');
//        System.out.println(strBuffer.toString());
//
//        strBuffer.insert(0, 's');
//        System.out.println(strBuffer.toString());
//
//
//        StringBuffer strBuffer = new StringBuffer("assembler");
//        strBuffer.delete(0, 2); // (0, 2) - не включая 2 индекс
//        System.out.println(strBuffer.toString());
//
//        strBuffer.deleteCharAt(6);
//        System.out.println(strBuffer.toString());

//        StringBuffer stringBuffer = new StringBuffer("hello java!");
//        String str1 = stringBuffer.substring(6); // обрезк строки с 6 символа до конца
//        System.out.println(str1);
//
//        String str2 = stringBuffer.substring(3, 9); // обрезка строки с 3 по 9 символ
//        System.out.println(str2);
//

//        StringBuffer stringBuffer = new StringBuffer("hello");
//        stringBuffer.setLength(10);
//        System.out.println(stringBuffer.toString());
//
//        stringBuffer.setLength(4);
//        System.out.println(stringBuffer.toString());
//
//        StringBuffer stringBuffer = new StringBuffer("hello world!");
//        stringBuffer.replace(6, 11, "java");
//        System.out.println(stringBuffer.toString());

//        StringBuffer stringBuffer = new StringBuffer("assembler");
//        stringBuffer.reverse();
//        System.out.println(stringBuffer.toString());

        // битовые операции и или не xor

//        int var = 121;
//        int not_v = ~var;
//        System.out.println(not_v);

//        byte flags = 5;
//        byte mask = 4;
//        int res = flags&mask;
//        System.out.println(res);

//
//        byte flags = 5;
//        byte mask = 4;
//
//        if((flags&mask) == mask) System.out.println("Включен 2-й бит числа");
//        else System.out.println("2-й бит выключен");
//
//        byte flags = 13;
//        byte mask = 5;
//
//        flags = (byte) (flags & ~mask);
//        System.out.println(flags);

//
//        byte flags = 8;
//        byte mask = 5;
//        flags = (byte)(flags | mask);
//        System.out.println(flags);


//        byte flags = 9;
//        byte mask = 1;
//        flags = (byte) (flags ^ mask);
//        System.out.println(flags);
//        flags ^= mask;
//        System.out.println(flags);

//        String msg = "Салом алейкум брат";
//        byte key = 111;
//        System.out.println(msg);
//
//        char[] str = msg.toCharArray();
//        for (int i = 0; i < msg.length(); ++i)
//            str[i] ^= key;
//
//        msg = new String(str);
//        System.out.println(msg);
//
//        for (int i = 0; i < msg.length(); ++i)
//            str[i] ^= key;
//
//        msg = new String(str);
//        System.out.println(msg);
//
//        ///// сдвиг вправо
//
//        int x = 160;
//        System.out.println(x);
//        x = x >> 1;
//        System.out.println(x);
//        x = x >> 1;
//        System.out.println(x);
//        x = x >> 1;
//        System.out.println(x);
//        x = x >> 1;
//        System.out.println(x);
//        x = x >> 1;
//        System.out.println(x);
//        x = x >> 1;
//        System.out.println(x);
//        x = x >> 1;

        ////// сдвиг влево - умножение на 2

//        byte x = 5;
//        System.out.println(x);
//        x = (byte) (x << 1);
//        System.out.println(x);


    }
}
