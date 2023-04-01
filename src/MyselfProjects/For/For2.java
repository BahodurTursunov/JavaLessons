package MyselfProjects.For;

// Даны два целых числа A и B (A < B). Вывести в порядке возрастания все
//целые числа, расположенные между A и B (включая сами числа A и B), а
//также количество N этих чисел.

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = a; i <= b; ++i) {
            System.out.println(i);
        }
    }
}
