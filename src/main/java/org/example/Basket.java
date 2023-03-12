package org.example;
//3)Создать класс Basket, содержащий массив купленных товаров.

import java.util.ArrayList;

public class Basket extends Product {
    protected ArrayList<Product> baskList = new ArrayList<>();

    public Basket(ArrayList<Product> baskList) {
        this.baskList = baskList;
    }
    public Basket(){
    }
    public ArrayList<Product> setBasketList(ArrayList<Product> prodList, ArrayList<Product> basketList, int p){
        basketList.add(prodList.get(p));
        return basketList;
    }



}
