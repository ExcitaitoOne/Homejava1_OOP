package org.example;
 //1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
public class Product {
    private String name;
    private int price;
    private double rating;

     public Product(String name, int price, double rating) {
         this.name = name;
         this.price = price;
         this.rating = rating;
     }
     public Product(){
     }
     public String setName(String name) {
         this.name = name;
         return name;
     }

     public int setPrice(int price) {
         this.price = price;
         return price;
     }

     public double setRating(double rating) {
         this.rating = rating;
         return rating;
     }

     public void getName() {
         System.out.println("Имя: " + name);
     }

     public void getPrice() {

         System.out.println("Цена: " + price);
     }

     public void getRating() {

         System.out.println("Рейтинг: " + rating);

     }
 }

