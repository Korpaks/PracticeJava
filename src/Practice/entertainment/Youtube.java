package Practice.entertainment;

import java.util.ArrayList;

public class Youtube  extends Streaming{

    String videoName;
    String channelName;
    int viewCount;
    ArrayList<String> comments;

    @Override
    public String toString() {
        return "Youtube{" +
                "videoName='" + videoName + '\'' +
                ", channelName='" + channelName + '\'' +
                ", viewCount=" + viewCount +
                ", comments=" + comments +
                '}';
    }

    public Youtube(String videoName, String channelName, int viewCount, ArrayList<String> comments) {
        super("Youtube");
        this.videoName = videoName;
        this.channelName = channelName;
        this.viewCount = viewCount;
        this.comments = comments;


    }
}
