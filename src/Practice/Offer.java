package Practice;

public class Offer {

    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberPTO;

    public Offer(String company, String location) {
        this.company = company;
        this.location = location;
    }

    public Offer(String company, String location, double salary) {
        this(company, location);
        this.salary = salary;
    }

    public Offer(String company, String location, double salary, boolean isFullTime, int numberPTO) {
        this(company, location, salary);
        this.isFullTime = isFullTime;
        this.numberPTO = numberPTO;
    }

    @Override
    public String toString() {
        return "\n\nOffer{" +
                "company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberPTO=" + numberPTO +
                '}';
    }
}
