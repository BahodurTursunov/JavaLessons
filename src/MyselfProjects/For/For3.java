package MyselfProjects.For;

//Даны два целых числа A и B (A < B). Вывести в порядке убывания все
//целые числа, расположенные между A и B (не включая числа A и B), а
//также количество N этих чисел

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int count;
        for (int i = b-1; i > a; --i) {
            System.out.println(i);
        }
    }
}
