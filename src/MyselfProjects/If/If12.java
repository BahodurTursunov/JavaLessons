package MyselfProjects.If;
// . Даны три числа. Найти наименьшее из них.

import java.util.Scanner;

public class If12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int min = 0;
        if (a < b && a < c) min = a;
        else if (b < a && b < c) min = b;
        else min = c;
        System.out.println(min);
    }
}
