package MyselfProjects.If;

//Даны три целых числа. Найти количество положительных чисел в исходном наборе.

import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a > 0) a = 1;
        else a = 0;
        if (b > 0) b = 1;
        else b = 0;
        if (c > 0) c = 1;
        else c = 0;
        System.out.println(a + b + c);
    }
}
