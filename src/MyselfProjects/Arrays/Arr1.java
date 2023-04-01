package MyselfProjects.Arrays;

//Дано целое число N (> 0). Сформировать и вывести целочисленный
//массив размера N, содержащий N первых положительных нечетных чисел:
//1, 3, 5, . . . .


import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextShort();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = 1 + i * 2;
            System.out.println("a[" + i + "]= " + a[i]);
        }
        in.close();
    }
}
