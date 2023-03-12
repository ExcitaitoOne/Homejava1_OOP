package org.example;
//Домашнее задание на закрепление:
//
//        1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//        2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.

//        3)Создать класс Basket, содержащий массив купленных товаров.
//        4)Создать класс User, содержащий логин, пароль и объект класса Basket.
//        Создать несколько объектов класса User.

//        5)Вывести на консоль каталог продуктов. (все продукты магазина)
//        6)Вывести на консоль покупки посетителей магазина.
//        (После покупки у пользователя добавляется товар, а из магазина - удаляется)

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int p = 1; // id товара
        Categorys cater = new Categorys();
        Product prod = new Product();
        Product prod2 = new Product();
        Product prod3 = new Product();
        Basket basket = new Basket();
        User user1 = new User();

        prod.setName("Сигареты");
        prod.setPrice(183);
        prod.setRating(9.9);

        prod2.setName("Книги");
        prod2.setPrice(500);
        prod2.setRating(8.9);

        prod3.setName("Конфеты");
        prod3.setPrice(50);
        prod3.setRating(5.0);

        cater.setName1("Товар1");
        cater.addsProdList(prod);
        cater.addsProdList(prod2);
        cater.addsProdList(prod3);

        cater.printProdList();

        user1.setLogin("Roma");
        user1.setPussword("123");

        // перемещение товара
        cater.getProdList(p);
        user1.seterBasketList(cater.prodList,basket.baskList,p);
        cater.printProdList();
        System.out.println(user1);
    }
}
