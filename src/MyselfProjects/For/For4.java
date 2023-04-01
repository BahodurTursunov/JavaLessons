package MyselfProjects.For;

//Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1,
//2, . . . , 10 кг конфет

import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cost = 50.5;
        for (int i = 1; i <= 10; ++i) {
            double res = cost * i;
            System.out.println("Цена " + i + " килограмма конфет " + res);
        }
    }


}
