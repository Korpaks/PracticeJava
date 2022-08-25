package Practice;

public class DebitCard {

    long cardNum;
    String holderName;
    String cardType;
    int pin;
    double balance;

    static {
        String accountType = "Debit";
    }

    public DebitCard(long cardNum, String holderName, double balance) {
        if(String.valueOf(cardNum).length() == 16){
            this.cardNum = cardNum;
        }else{
            System.out.println("Invalid card number");
        }
        this.holderName = holderName;
        this.balance = balance;
    }

    public DebitCard(long cardNum, String holderName, String cardType, int pin, double balance) {
        this(cardNum, holderName, balance);
       if(cardType.equals("MasterCard") || cardType.equals("Visa")){
           this.cardType = cardType;
       }else {
           System.out.println("Invalid card type");
       }
       if(String.valueOf(pin).length() == 4){
           this.pin = pin;
       }else {
           System.out.println("Invalid pin length");
       }

    }

    @Override
    public String toString() {
        return "\nDebitCard:" +
                "\ncardNum=" + cardNum +
                "\nholderName='" + holderName +
                "\ncardType='" + cardType +
                "\nbalance=" + balance;
    }
}
