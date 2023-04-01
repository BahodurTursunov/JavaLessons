package MyselfProjects.For;

// Дано вещественное число — цена 1 кг конфет. Вывести стоимость 0.1,
//0.2, . . . , 1 кг конфет.
public class For5 {
    public static void main(String[] args) {
        double cost = 125.5;
        double weight = 1;
        for (double i = 0.1; i <= weight; i+=0.1) {
            double res = cost * i;
            System.out.println("Цена " + i + " киллограма конфет = " + res);
        }
    }
}
