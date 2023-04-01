package MyselfProjects.If;

import java.util.Scanner;

// Дано целое число. Если оно является положительным, то прибавить к
//нему 1; в противном случае не изменять его. Вывести полученное число.

public class If1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (i > 0) System.out.println((int) (i + 1));
        else System.out.println(i);
    }
}
