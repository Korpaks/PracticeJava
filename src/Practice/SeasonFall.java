package Practice;

public class SeasonFall extends Season {

    public SeasonFall(double highestTemp, double lowestTemp) {
        super("Fall", 25, 7);
    }

    public String activity() {
        return "Play with leafs";
    }
}

