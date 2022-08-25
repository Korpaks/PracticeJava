package Practice;

import java.util.ArrayList;

public class UsingOffer {
    public static void main(String[] args) {

//        Offer obj1 = new Offer("Apple", "NY", 200000, true, 30);
//
//        System.out.println(obj1);

        ArrayList<Offer> offers = new ArrayList<>();

        offers.add(new Offer("Apple", "Ohaio", 150000, true, 10));
        offers.add(new Offer("Twitter", "Milanovac", 80000, true, 7));
        offers.add(new Offer("Costco", "SB", 150000, true, 14));
        offers.add(new Offer("Facebook", "Chicago", 140000, false, 21));
        offers.add(new Offer("LG", "LA", 130000, false, 23));
        offers.add(new Offer("Samsung", "SF", 120000, true, 17));
        offers.add(new Offer("Amazon", "SD", 110000, false, 10));


        ArrayList<Offer> onlyFullTime = new ArrayList<>(offers);
        onlyFullTime.removeIf(each-> !each.isFullTime);
        System.out.println(onlyFullTime);

    }
}
