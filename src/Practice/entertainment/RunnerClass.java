package Practice.entertainment;

import java.util.ArrayList;

public class RunnerClass {
    public static void main(String[] args) {

        KevinHart obj1 = new KevinHart("HBO", "LA", "Kevin Hart", "12/23/2022");
        System.out.println(obj1.entertainmentType);
        System.out.println(obj1.company);
        System.out.println(obj1.date);
        System.out.println(obj1.performer);

        System.out.println("=====================");

        ArrayList<String> comments = new ArrayList<>();
        comments.add("very nice video");
        comments.add("that's a hard wank");
        comments.add("came from 9gag, not dissapointed");
        comments.add("9/11 would hit");

        Youtube obj2 = new Youtube("2girls1cup", "DirtySanchez", 10000000, comments);

        System.out.println(obj2);

        System.out.println("==========================");

        Netflix obj3 = new Netflix("BlackPeople", 100, 5);
        System.out.println(obj3.company);
        System.out.println(obj3.entertainmentType);
        System.out.println(obj3.numOfEpisodes);
        System.out.println(obj3.numOfSeasons);
        obj3.duration = 12.5;
        System.out.println(obj3.duration);
    }
}
