package org.example;

import java.util.ArrayList;

//        4)Создать класс User, содержащий логин, пароль и объект класса Basket.
//        Создать несколько объектов класса User.
public class User extends Basket {
    public String login;
    private String password;
    private Basket basek1 = new Basket(baskList);

    /**
     *
     * @param login = логин
     * @param password = пароль
     * @param basek1 = массив
     */
    public User(String login, String password, Basket basek1) {
        this.login = login;
        this.password = password;
        this.basek1 = basek1;
    }
    public User(){    }
    void setLogin(String login) {
        this.login = login;
    }
    public void setPussword(String pussword) {
        this.password = password;
    }

    public ArrayList<Product> seterBasketList(ArrayList<Product> prodList, ArrayList<Product> basketList, int p){
        basketList.add(prodList.get(p));
        return basketList;
    }


}
