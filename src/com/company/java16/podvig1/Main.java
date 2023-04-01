package com.company.java16.podvig1;

// Объявите класс ShopItem для представления продуктов в магазине с полями: id (идентификатор - целое число), название товара,
// габариты, вес, цена. Поле id должно быть уникальным для каждого объекта класса. Это следует реализовать через статическую
// переменную, которая подсчитывает количество создаваемых экземпляров.
public class Main {
    public static void main(String[] args) {
        ShopItem product1 = new ShopItem("Кокос", "Средний", .7, 400);
        ShopItem product2 = new ShopItem("Банан", "Большой", .3, 99);
        ShopItem product3 = new ShopItem("Яблоко", "Средний", .2, 110);
        ShopItem product4 = new ShopItem("Мандарин", "Маленький", .1, 120);

        System.out.println("Идентификатор товара -> " + ShopItem.getCounter() + "\nНазвание продукта -> " + product1.nameOfProduct + "\nРазмер продукта -> " +
                product1.size + "\nВес продукта -> " + product1.weight + "\nЦена продукта -> " + product1.cost + "\n");

        System.out.println("Идентификатор товара -> " + ShopItem.getCounter() + "\nНазвание продукта -> " + product2.nameOfProduct + "\nРазмер продукта -> " +
                product2.size + "\nВес продукта -> " + product2.weight + "\nЦена продукта -> " + product2.cost + "\n");

        System.out.println("Идентификатор товара -> " + ShopItem.getCounter() + "\nНазвание продукта -> " + product3.nameOfProduct + "\nРазмер продукта ->" +
                product3.size + "\nВес продукта -> " + product3.weight + "\nЦена продукта -> " + product3.cost + "\n");

        System.out.println("Идентификатор товара -> " + ShopItem.getCounter() + "\nНазвание продукта -> " + product4.nameOfProduct + "\nРазмер продукта ->" +
                product4.size + "\nВес продукта -> " + product4.weight + "\nЦена продукта -> " + product4.cost + "\n");
    }

    static class ShopItem {
        static int id;
        String nameOfProduct;
        String size;
        double weight;
        double cost;

        ShopItem(String nameOfProduct, String size, double weight, double cost) {
            this.nameOfProduct = nameOfProduct;
            this.size = size;
            this.weight = weight;
            this.cost = cost;
        }

        static {
            id = 1;
        }
        static int getCounter() {
            return id++;
        }

    }

}

