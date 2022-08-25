package Practice;

import java.util.Locale;

public class Pizza {

    String size;
    int numOfToppings;

    public Pizza(String size, int numOfToppings) {
        setSize(size);
        setNumOfToppings(numOfToppings);
    }

    public void setSize(String size) {
        if(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")){
            this.size = size;
        }
    }
    public void setNumOfToppings(int numOfToppings) {
        if(numOfToppings>0){
            this.numOfToppings = numOfToppings;
        }
    }
    double totalPrice;

    public double calculatePrice(){
        switch (size.toLowerCase()){
            case "small":
             totalPrice = 4;
             break;
            case "medium":
             totalPrice = 6;
             break;
            case "large":
             totalPrice = 8;
             break;
        }
        return totalPrice + (numOfToppings * 0.75);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numOfToppings=" + numOfToppings +
                '}';
    }
}
