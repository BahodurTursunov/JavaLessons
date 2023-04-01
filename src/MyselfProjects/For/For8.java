package MyselfProjects.For;

import java.util.Scanner;

//Даны два целых числа A и B (A < B). Найти произведение всех целых
//чисел от A до B включительно.
public class For8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int res = 1;
        for (int i = a; i <= b; ++i) {
            res*=i;
        }
        System.out.println(res);
    }
}
