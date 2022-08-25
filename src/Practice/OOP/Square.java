package Practice.OOP;

public class Square {

   private int side;

    public Square(int side) {
        setSide(side);    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
       if(side>0){
           this.side = side;
       }else{
           System.out.println("Invalid side size");
       }
    }
    public int calculateArea(){
        return 4*side;
    }




}
