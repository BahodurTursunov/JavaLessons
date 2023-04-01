package MyselfProjects.If;

import java.util.Scanner;

//. Даны два числа. Вывести вначале большее, а затем меньшее из них.

public class If8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int min = 0;
        int max = 0;
        if (a > b) max = a;
        else min = a;
        if (a < b) max = b;
        else min = b;
        System.out.println(max + " " + min);
    }
}
