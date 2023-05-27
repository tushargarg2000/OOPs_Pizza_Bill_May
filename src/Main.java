import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Welcome to Btech Pizza Walla");

        //for loop out wise :-> multiple pizza

        System.out.println("Etner the type of pizza ");

        Scanner sc = new Scanner(System.in);

        String pizzaVariant = sc.nextLine();




        System.out.println("Veg or Non Veg ?");

        String pizzaType = sc.nextLine();
        boolean isVeg;

        if(pizzaType=="Veg")
            isVeg = true;
        else
            isVeg = false;

        System.out.println("Regular or Large Pizza ?");
        String pizzaSize = sc.nextLine();

        //Actual creation of Pizza starts
        Pizza pizza;
        if(pizzaVariant.equals("Farmhouse")){
            pizza = new FarmousePizza(isVeg,pizzaSize);
        }


        pizza = new Pizza(isVeg,pizzaSize);

        /* Add extra cheese */
        System.out.println("Would you like to have some extra cheese Enter Y/N");
        String ans;
        ans = sc.nextLine();

        System.out.println("The ans is "+ans);
        if(ans.equals("Y")){
            pizza.addExtraCheese();
        }

        /* Add extra Toppings */
        System.out.println("Would you like to have some extra Toppings Enter Y/N");
        ans = sc.nextLine();
        if(ans.equals("Y")){
            pizza.addExtraToppings();
        }

        /* Add extra Carry Bag */
        System.out.println("Would you like to have a Carry Bag Enter Y/N");
        ans = sc.nextLine();
        if(ans.equals("Y")){
            pizza.addExtraCarryBag();
        }

        /*
        Bill generation :
        */
        pizza.printBill();

    }
}