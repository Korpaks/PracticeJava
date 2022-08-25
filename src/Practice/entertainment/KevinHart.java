package Practice.entertainment;

public class KevinHart extends LiveShow{

    String performer;
    String date;

    public KevinHart(String company, String location, String performer, String date) {
        super(company, location);
        this.performer = performer;
        this.date = date;
    }

    @Override
    public String toString() {
        return "KevinHart{" +
                "performer='" + performer + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
