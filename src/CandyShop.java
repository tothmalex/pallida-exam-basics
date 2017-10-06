public class CandyShop {

    int money;
    int sugar;

    public CandyShop(int money, int sugar) {
        this.money = money;
        this.sugar = sugar;
    }

    public CandyShop(int money) {
        this.money += money;
    }

    public void candyshop (){
        System.out.println("Inventory: " + candyNumber + "candies, " + lollipopNumber + "lollipops, Income: " + money +"$, Sugar:" + sugar + "gr");
    }

    public void CANDY (){

    }

    public void LOLLIPOP() {

    }

    public int createSweets(int type) {
       return type++;
    }

    public int sell(String name, int number) {
        if (name == "")
    }

    public void raise(int percentage){
       candyPrice *= (1 + percentage /100);
       lollipopPrice *= (1 + percentage /100);
    }

      public int buySugar(int grams){
         return sugar += grams;
    }
}




