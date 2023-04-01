package MyselfProjects.Arrays;

//Дано целое число N (> 0). Сформировать и вывести целочисленный
//массив размера N, содержащий степени двойки от первой до N-й: 2, 4,
//8, 16, . . . .

import java.util.Scanner;

public class Arr2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        a[0] = 2;
        for (int i = 1; i < n; ++i) {
            a[i] = a[i - 1] * 2;
            System.out.println("a[" + i + "]= " + a[i]);
        }
    }
}
