package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingHobby {
    public static void main(String[] args) {

//        - create an ArrayList of Hobby objects
//                - create and add a couple Hobby objects

        ArrayList<Hobby> hobbies = new ArrayList<>();
        hobbies.addAll(Arrays.asList(
                new Hobby("Golf", 5000, true, false),
                new Hobby("Tennis", 1000, true, true),
                new Hobby("Dancing", 3000, false, true),
                new Hobby("Basketball", 500, true, false ),
                new Hobby("Fishing", 800, true, false),
                new Hobby("Gardening", 400, true, false)));

//        - iterate through the ArrayList and execute the doIt() method on each Hobby object

        for(Hobby each: hobbies){
            each.doIt();
        }
//        - create a copy ArrayList and remove all outdoors Hobbies

        ArrayList<Hobby> removeOutdoor = new ArrayList<>(hobbies);
        removeOutdoor.removeIf(each -> each.isOutdoor);
        System.out.println(removeOutdoor);

        System.out.println("==============================");

//        create a copy ArrayList and remove all hobbies requiring other people

        ArrayList<Hobby> requireOther = new ArrayList<>(hobbies);
        requireOther.removeIf(each -> each.requiresOthers);
        System.out.println(requireOther);

        System.out.println("================================");

//        create a copy ArrayList and remove all hobbies that cost more than $500 annually

        ArrayList<Hobby> moreThen500 = new ArrayList<>(hobbies);
        moreThen500.removeIf(each->each.annualCost > 500);
        System.out.println(moreThen500);
    }
}
