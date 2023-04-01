package MyselfProjects.If;

//Даны три целых числа. Найти количество положительных и количество
//отрицательных чисел в исходном наборе.

import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res1 = 0, res2 = 0;


        if (a > 0) res1++;
        else res2++;

        if (b > 0) res1++;
        else res2++;

        if (c > 0) res1++;
        else res2++;
        System.out.println("количество положительных чисел = " + res1 + "\nколичество отрицательных чисел " + res2);

    }
}
