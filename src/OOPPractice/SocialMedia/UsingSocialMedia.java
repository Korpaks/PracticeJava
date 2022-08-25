package OOPPractice.SocialMedia;

public class UsingSocialMedia {
    public static void main(String[] args) {

        SocialMedia person = new Facebook("igorkorpak", "sdgsfgdf");
        System.out.println(person);

        person.personalUrl = "personal my url";
        person.accountLength = 10;
        person.username = "IgroKorpak1342";
        person.password = "IgroKorpak134242";

        ((Facebook) person).setPassword("IgroKorpak134242");
        System.out.println("=============================");

        SocialMedia person2 = new Facebook("dusan", "dusan1234");

        System.out.println(person2);
        System.out.println("=============================");

        Facebook person3 = new Facebook("cristina", "sgdfgdfgdfg", "CristinaLala");

        System.out.println(person3);
        person3.personalUrl = " asfskdf";
        person3.username = "Kristina";
        System.out.println(person3);
        System.out.println(SocialMedia.platform);

        person3.directMessaging(person3, "Hello everybody");


    }
}
