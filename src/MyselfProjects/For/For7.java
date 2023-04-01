package MyselfProjects.For;

import java.util.Scanner;

//Даны два целых числа A и B (A < B). Найти сумму всех целых чисел
//от A до B включительно.
public class For7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        for (int i = a; i <= b; ++i) {
            sum += i;
            //System.out.println(sum);

        }
        System.out.println(sum);
    }
}
