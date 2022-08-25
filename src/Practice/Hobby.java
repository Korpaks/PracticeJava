package Practice;

public class Hobby {

    String name;
    double annualCost;
    boolean isOutdoor;
    boolean requiresOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoor, boolean requiresOthers) {
        this.name = name;
        this.annualCost = annualCost;
        this.isOutdoor = isOutdoor;
        this.requiresOthers = requiresOthers;
    }
    public void doIt(){
        System.out.println("Doing " + name + " and is it outdoor: " + isOutdoor);
    }

    @Override
    public String toString() {
        return "\nHobby:" +
                "\nname" + name  +
                "\nannualCost: " + annualCost +
                "\nisOutdoor: " + isOutdoor +
                "\nrequiresOthers: " + requiresOthers + "\n";
    }
}
