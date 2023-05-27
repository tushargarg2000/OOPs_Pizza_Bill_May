

public class Pizza {

    private int basePrice;

    private boolean isVeg;

    private int toppingsPrice;

    private int cheesePrice;

    private String size;

    private int carryBagPrice;

    private boolean isCarryBagAdded;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isBillGenerated;

    private String bill;

    private int totalAmount;

    //Initalize the values of the pizza
    public Pizza(boolean isVeg,String size){

        if(size=="Regular"){
            if(isVeg)
                basePrice = 100;
            else
                basePrice = 130;
        }else{ //Else if it is a large pizza
            if (isVeg)
                basePrice = 200;
            else
                basePrice = 250;
        }

        this.toppingsPrice = 50;
        this.cheesePrice = 40;
        this.carryBagPrice = 20;

        totalAmount = basePrice;
        bill = "The base of the selected pizza is : "+basePrice+"\n";
    }

    public void addExtraCheese(){

        if(isCheeseAdded==false) {
            isCheeseAdded = true;
            totalAmount = totalAmount + cheesePrice;
            bill = bill + "Extra cheese added : " + cheesePrice + "\n";
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded) {
            isToppingsAdded = true;
            totalAmount = totalAmount + toppingsPrice;
            bill = bill + " Extra toppings added : " + toppingsPrice + "\n";
        }
    }

    public void addExtraCarryBag(){

        if(!isCarryBagAdded) {
            isCarryBagAdded = true;
            totalAmount = totalAmount + carryBagPrice;
            bill = bill + "Extra carry bag added : " + carryBagPrice + "\n";
        }
    }

    public void printBill(){

        if(isBillGenerated==false){
            isBillGenerated = true;
            bill = bill + "Total bill is equals : "+totalAmount + "\n";
        }

        System.out.println(bill);
    }

}
