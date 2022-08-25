package Practice.entertainment;

public class Netflix extends Streaming {

    String showName;
    int numOfEpisodes;
    int numOfSeasons;


    public Netflix( String showName, int numOfEpisodes, int numOfSeasons) {
        super("Netflix");
        this.showName = showName;
        this.numOfEpisodes = numOfEpisodes;
        this.numOfSeasons = numOfSeasons;
    }

    @Override
    public String toString() {
        return "Netflix{" +
                "showName='" + showName + '\'' +
                ", numOfEpisodes=" + numOfEpisodes +
                ", numOfSeasons=" + numOfSeasons +
                '}';
    }
}
