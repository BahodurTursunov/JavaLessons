package MyselfProjects.If;

import java.util.Scanner;

//If7. Даны два числа. Вывести порядковый номер меньшего из них.

public class If7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) System.out.println(a + " это 1 порядковый номер");
        else System.out.println(b + " это второй порядковый номер");
    }
}
