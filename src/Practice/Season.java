package Practice;

public class Season {

    String name;
    double highestTemp;
    double lowestTemp;

    public Season(String name, double highestTemp, double lowestTemp) {
        this.name = name;
        this.highestTemp = highestTemp;
        this.lowestTemp = lowestTemp;
    }

    public String activity(){
        return"";
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestTemp=" + highestTemp +
                ", lowestTemp=" + lowestTemp +
                '}';
    }
}
