package MyselfProjects.switchCase;

import java.util.Scanner;

// Арифметические действия над числами пронумерованы следующим
//образом: 1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление. Дан
//номер действия N (целое число в диапазоне 1–4) и вещественные числа A
//и B (В не равно 0). Выполнить над числами указанное действие и вывести
//результат
public class case5 {
    public static void main(String[] args) {
        System.out.println("""
                Выберите операцию:
                1 - сложение
                2 - вычитание
                3 - умножение
                4 - деление""");
        Scanner in = new Scanner(System.in);
        int var = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        switch (var) {
            case 1 -> System.out.println("Вы выбрали сложение, ваш результат: " + (a + b));
            case 2 -> System.out.println("Вы выбрали вычитание, ваш результат: " + (a - b));
            case 3 -> System.out.println("Вы выбрали умножение, ваш результат: " + (a * b));
            case 4 -> System.out.println("Вы выбрали деление, ваш результат: " + (a / b));
        }
    }
}
