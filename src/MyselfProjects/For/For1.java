package MyselfProjects.For;


//For1. Даны целые числа K и N (N > 0). Вывести N раз число K.

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        for (int i = 1; i <= n; ++i) {
            System.out.println(k);
        }
    }
}
