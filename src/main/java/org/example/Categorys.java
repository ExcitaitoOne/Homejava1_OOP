package org.example;

import java.util.ArrayList;

public class Categorys extends Product {
    private String name;
    public ArrayList<Product> prodList = new ArrayList<>();

    public Categorys(String name, ArrayList<Product> prodList) {
        this.name = name;
        this.prodList = prodList;
    }
    public Categorys(){    }

    public String setName1(String name) {
        this.name = name;
        return name;
    }
    public void getName1() {
        System.out.println("имя категории " + name);
    }

    public ArrayList<Product> addsProdList(Product p) {
        prodList.add(p);
        return prodList;
    }
    public ArrayList<Product> getProdList(int p){
        prodList.remove(p);
        return prodList;
    }
    public void printProdList() {
        System.out.println("cаписок товаров: "+prodList);
    }
}

