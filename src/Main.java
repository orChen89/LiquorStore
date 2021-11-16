
public class Main {

    public static void main(String[] args) {

        final String [] productList = {"Beer", "Whisky", "Rum", "Campari", "Vodka", "Red Wine", "Gin"};
        final double [] prices = {20.0, 120.25, 85.5, 70.0, 95.9, 30.0, 105.5};
        LiquorStore store1 = new LiquorStore("Or", productList, prices,0);

        store1.purchaseDrink("Gin",150);
        store1.purchaseDrink("Beer",150);
        store1.purchaseDrink("Rum",10);
        store1.purchaseDrink("Arak",150);
        System.out.println();
        System.out.println(store1.toString());
    }

}
