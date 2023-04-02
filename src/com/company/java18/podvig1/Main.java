package com.company.java18.podvig1;

// Объявите классы для описания мебели: стулья, шкафа, полка, столы. У этих классов имеются общие поля: название, габариты, цена. И уникальные для кажмого объекта:
// для стула: число ножек, высота ножек, наличие спинки.
// для шкафов: материал ручек, число створок и шкафчиков.
// для полок: число сегментов и размер каждого сегмента.
// для столов: число ножек и площадь столешницы.
// Подумайте как описать эти объекты. Создайте их и выведите значение полей в консоль
public class Main {
    public static void main(String[] args) {
        Chairs chairs = new Chairs();
        chairs.title = "Анвар Ахмедов";
        chairs.dimensions = "Средний";
        chairs.price = 2000;
        chairs.chairLegs = 4;
        chairs.heightOfLegs = 40;
        chairs.backrest = "Присутствует";
        System.out.println("| Название стула: " + chairs.title + " | Габариты: " + chairs.dimensions + "| Цена стула: " + chairs.price + " | Количество ножек: "
                + chairs.chairLegs + " | Высота ножек: " + chairs.heightOfLegs + " см " + "| Наличие спинки " + chairs.backrest);

        Wardrobe wardrobe = new Wardrobe();
        wardrobe.title = "Жирный лев";
        wardrobe.dimensions = "Большой";
        wardrobe.price = 50000;
        wardrobe.handleMaterial = "Бархатные тяги";
        wardrobe.countOfSection = 10;
        System.out.println("| Название шкафа: " + wardrobe.title + " | Габариты: " + wardrobe.dimensions + " | Цена шкафа: " + wardrobe.price + " | Материал ручек: " +
                wardrobe.handleMaterial + " | Количество секций в шкафу: " + wardrobe.countOfSection);

        Shelv shelv = new Shelv();
        shelv.title = "Полки из ИКЕА";
        shelv.dimensions = "Средний";
        shelv.price = 1399;
        shelv.countOfShelves = 3;
        shelv.size = "50 cм";
        System.out.println("| Название полки: " + shelv.title + " | Габариты: " + shelv.dimensions + " | Цена шкафа: " + shelv.price + " | Количество полок: " +
                shelv.countOfShelves + " | Размер каждой полки: " + shelv.size);

        Table table = new Table();
        table.title = "Дагестанский воин";
        table.dimensions = "Большой";
        table.price = 100000;
        table.countOfLegs = 8;
        table.a = 200;
        table.b = 1000;
        table.S = table.a * table.b;;
        System.out.println("| Название стола: " + table.title + " | Габариты: " + table.dimensions + " | Цена шкафа: " + table.price + " | Количество ножек: " +
                table.countOfLegs + " | Площадь столешницы: " + table.S);
    }
}

class Properties { //////////  общее поле для классов
    String title; // название
    String dimensions; // габариты
    double price; // цена
}

class Chairs extends Properties {
    int chairLegs; // количество ножек
    double heightOfLegs; // высота ножек
    String backrest; // наличие спинки
}

class Wardrobe extends Properties {
    String handleMaterial; // материал ручек
    int countOfSection; // количество секций в шкафу
}

class Shelv extends Properties { ////// класс полки
    int countOfShelves; // количество полок в полке
    String size; // размер полки
}

class Table extends Properties {
    // переменные для нахождения площади столешницы
    double S;
    double a;
    double b;

    int countOfLegs;
    double tableTop;
//
//    Table(double a, double b) {
//        this.a = a;
//        this.b = b;
//        S = a * b;
//    }
}

