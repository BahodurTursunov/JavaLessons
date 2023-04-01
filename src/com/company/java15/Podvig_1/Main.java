package com.company.java15.Podvig_1;

import com.company.java15.Podvig_2.Wardrobe;

public class Main {
    public static void main(String[] args) {
        TV inf = new TV();
        inf.setTV("Samsung", 37.5, 2022, 30000);
        System.out.println("Марка телевизора -> " + inf.getMark() + "\nРазмер диагонали -> " + inf.getSizeOfDiagonal() + "\nГод производства -> " +
                inf.getYearOfProduction() + "\nЦена телевизора -> " + inf.getCost());

        Wardrobe wardrobe1 = new Wardrobe();
        wardrobe1.setWardrobe("Кухонный", 15000, "Эпл", 2023);

        System.out.println("Задайте габариты шкафа -> " + wardrobe1.Calc(2,3,4));
        System.out.println("\nГабариты шкафа -> " + wardrobe1.dimensions + "\nТип шкафа -> " + wardrobe1.typeOfWardrobe + "\nЦена шкафа -> " +
                wardrobe1.cost + "\nПроизводитель -> " + wardrobe1.manufactured + "\nГод производства -> " + wardrobe1.yearOfProduction);
    }
}

