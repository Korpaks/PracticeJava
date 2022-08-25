package Practice.MyPractice;

public class RandomClass {

    public static boolean PassValidation(String pass) {

        int loverCase = 0;
        int upperCase = 0;
        int specialChar = 0;
        int digit = 0;

        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) {
                upperCase++;
            } else if (Character.isLowerCase(pass.charAt(i))) {
                loverCase++;
            } else if (Character.isDigit(pass.charAt(i))) {
                digit++;
            } else {
                specialChar++;
            }
        }

        return (pass.length() >= 6 && !pass.contains(" ") && loverCase >= 1 && upperCase >= 1 && specialChar >= 1 && digit >= 1);
    }


    public static void main(String[] args) {

        System.out.println(PassValidation("23$%sdfDFFDS"));
    }
}
