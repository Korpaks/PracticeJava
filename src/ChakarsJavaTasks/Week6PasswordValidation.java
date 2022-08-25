package ChakarsJavaTasks;

public class Week6PasswordValidation {

    /*
    Password must be length 6 and no space
    at least 1 uppercase
    at least 1 lowercase
    at least one digit
    at least one special char
    return method
     */

   public static boolean passwordValidation(String password){
        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int specialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            if(Character.isUpperCase(password.charAt(i))){
                upperCase++;
            }else if(Character.isLowerCase(password.charAt(i))){
                lowerCase++;
            }else if(Character.isDigit(password.charAt(i))){
                digit++;
            }else {
                specialChar++;
            }
        }
        return (password.length() >= 6 && !password.contains(" ") && upperCase >= 1 && lowerCase >= 1 && digit >= 1 && specialChar >=1);
    }

    public static void main(String[] args) {

        System.out.println(passwordValidation("2WE%$")); //less then 6 character
        System.out.println(passwordValidation("@#$SDFAkjsdfkjb")); // no numbers
        System.out.println(passwordValidation("skdfb2342985$%#")); // no Upper case letter
        System.out.println(passwordValidation("AFH45345&^$")); // no Lower case letter
        System.out.println(passwordValidation("ADF 39485 ^$&*#fsdf")); // space included
        System.out.println(passwordValidation("jhsdfALFHD7346538")); // no special character
        System.out.println("==================================");
        System.out.println(passwordValidation("23$%sdfDFFDS")); // valid password
    }
}
