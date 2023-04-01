package MyselfProjects.If;

import java.util.Scanner;

//Дано целое число. Если оно является положительным, то прибавить к
//нему 1; в противном случае вычесть из него 2. Вывести полученное число

public class If2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (i > 0) System.out.println(i + 1);
        else System.out.println(i-2);
    }
}
