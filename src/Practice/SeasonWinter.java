package Practice;

public class SeasonWinter extends Season{
    public SeasonWinter( double highestTemp, double lowestTemp) {
        super("Winter", 10, -20);
    }
    public String activity(){
        return "Play with snow";
    }

}
