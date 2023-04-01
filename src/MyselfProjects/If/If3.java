package MyselfProjects.If;

// Дано целое число. Если оно является положительным, то прибавить к
//нему 1; если отрицательным, то вычесть из него 2; если нулевым, то
//заменить его на 10. Вывести полученное число.

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (i > 0) System.out.println(i + 1);
        else if (i == 0) System.out.println(i = 10);
        else System.out.println(i - 2);

    }

}
