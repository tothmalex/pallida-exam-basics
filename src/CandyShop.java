import java.util.ArrayList;

public class CandyShop {

    int money;
    int sugar;
    int lollipopPrice = 10;
    int candyPrice = 20;
    int CANDY = 0;
    int LOLLIPOP = 0;
    /*String nameCandy = "candies";
    String nameLollipop = "lollipops";*/


    public CandyShop(int money, int grams) {
        this.money = money;
        this.sugar = grams;
    }

    public void candyshop (){
        System.out.println("Inventory: " + CANDY + "candies, " + LOLLIPOP + "lollipops, Income: " + money +"$, Sugar:" + sugar + "gr");
    }

    public int createSweets(int type) {
       return type++;
    }

    public int sell(String name, int number) {

    }

    public void raise(int percentage){
       candyPrice *= (1 + percentage /100);
       lollipopPrice *= (1 + percentage /100);
    }

      public void buySugar(int grams){
        sugar += grams;
    }
}




