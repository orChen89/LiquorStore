import java.util.Arrays;
import java.util.Objects;

public class LiquorStore {

    private String ownerName;
    private final String[] availableDrinks;
    private final double[] drinksPriceList;
    private float cashInRegister;

    public void purchaseDrink(String drinkName, double amountOfMoney) {

                for (int i = 0; i < availableDrinks.length; i++) {

            if (availableDrinks[i].equals(drinkName) && drinksPriceList[i] <= amountOfMoney) {

                System.out.println(drinkName + " is available and you have the sufficient amount for it!");
                System.out.println(drinkName + " Purchased!");
                cashInRegister += amountOfMoney;
                System.out.println("Current amount of cash in register after last purchase: " + cashInRegister);
                return;
                }
            if (availableDrinks[i].equals(drinkName) && drinksPriceList[i] > amountOfMoney) {
                System.out.println("You don't have the sufficient money to purchase " + drinkName + ".");
                return;
            }
            }
        for (int j = 0; j < availableDrinks.length ; j++) {
            if (!Objects.equals(availableDrinks[j], drinkName)){
                System.out.println("You can't buy this drink! " + drinkName + " is not in our menu!");
                System.out.println();
                printDrinks();
                return;
            }

        }
        }
            public void printDrinks () {

                System.out.println("Our current drinks menu: ");
                System.out.println(Arrays.toString(availableDrinks));
            }


    @Override
    public String toString() {
        return "LiquorStore{" +
                "ownerName='" + ownerName + '\'' +
                ", availableDrinks=" + Arrays.toString(availableDrinks) +
                ", drinksPriceList=" + Arrays.toString(drinksPriceList) +
                ", cashInRegister=" + cashInRegister +
                '}';
    }

    public LiquorStore(String name, String[]availableDrinks, double[] drinksPriceList, float cashInRegister){

                this.ownerName = name;
                this.availableDrinks = availableDrinks;
                this.drinksPriceList = drinksPriceList;
                this.cashInRegister = cashInRegister;
            }
        }
