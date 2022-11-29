package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeAway;
    private int addExtraCheese;
    private int addExtraToppings;
    private int TakeAwayPrice;
    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isTakeAway = false;
        this.addExtraCheese = 80;
        if(isVeg == true)
        {
            this.price = 300;
            this.addExtraToppings = 70;
        }
        else{
            this.price = 400;
            this.addExtraToppings = 120;
        }
        this.TakeAwayPrice = 20;
        this.isBillGenerated = false;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false)
        {
            this.price = this.price + this.addExtraCheese;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded == false)
        {
            this.price = this.price + this.addExtraToppings;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAway == false){
            this.price = this.price + this.TakeAwayPrice;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false)
        {
            isBillGenerated = true;
            if(isCheeseAdded == true)
            {
                this.bill += "Extra Cheese Added: " + this.addExtraCheese + "\n";
            }
            if(isToppingsAdded == true)
            {
                this.bill += "Extra Toppings Added: " + this.addExtraToppings + "\n";
            }
            if(isTakeAway == true)
            {
                this.bill += "Paperbag Added: " + this.TakeAwayPrice + "\n";
            }
            this.bill += "Total Price: " + this.price + "\n";
        }
        return this.bill;
    }
}
