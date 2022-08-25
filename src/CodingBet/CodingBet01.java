package CodingBet;

public class CodingBet01 {

    public String stringBits(String str) {
        String result = "";
        if(str.length() == 2){
            return str.substring(0,1);
        }else{
            for(int i = 0; i < str.length()-1; i+=2){
                result+= str.charAt(i);
            }
        }
        return result;
    }
}
