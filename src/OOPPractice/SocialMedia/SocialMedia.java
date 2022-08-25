package OOPPractice.SocialMedia;

public abstract class SocialMedia {

    protected String personalUrl;
    protected int accountLength;
    protected String username;
    protected String password;
    protected String fullName;
    protected static String platform ;

    public abstract void directMessaging(SocialMedia other, String message);
    public abstract void post(Object media);
    public abstract void notification();



}
