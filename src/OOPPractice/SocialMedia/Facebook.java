package OOPPractice.SocialMedia;

import java.util.ArrayList;
import java.util.List;


public class Facebook extends SocialMedia implements HasGroups{

    int age;
    int numberOfFriends;
    ArrayList<Post> allPost;
    private int numberOfGroups;
    static {
        platform = "Facebook";
    }

    public Facebook(String username, String password) {
        this.username = username;
        setPassword(password);
        personalUrl = "Facebook.com/" + username;
        allPost = new ArrayList<>();
    }

    public Facebook(String username, String password, String fullName){
        this(username, password);
        setFullName(fullName);
    }

    public Facebook(String username, String password, String fullName, int age, int numOfFriends){
        this(username, password, fullName);
        setAge(age);
        setNumberOfFriends(numOfFriends);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18 && age < 130){
            this.age = age;
        } else {
            System.out.println("This is invalid age");
        }
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        if(numberOfFriends >= 0 && numberOfFriends <= 5000){
            this.numberOfFriends = numberOfFriends;
        } else {
            System.out.println("Invalid number of friends");
        }
    }

    public List<Post> getAllPost() {
        return allPost;
    }

    public void setAllPost(List<Post> allPost) {
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }


    @Override
    public void directMessaging(SocialMedia other, String message) {

    }

    @Override
    public void post(Object media) {

    }

    @Override
    public void notification() {

    }

    @Override
    public void joinGroup(String group) {

    }

    @Override
    public void leaveGroup(String group) {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.contains(username)) {
            System.out.println("Password should not contain the username, default password set");
            this.password = "default";
        } else {
            this.password = password;
        }
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", allPost=" + allPost +
                ", numberOfGroups=" + numberOfGroups +
                ", personalUrl='" + personalUrl + '\'' +
                ", accountLength=" + accountLength +
                 " password = " + password + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public void setFullName(String fullName) {

        boolean isValidName = true;

        for(int i = 0; i < fullName.length(); i++){
            if(!Character.isLetter(fullName.charAt(i)) && fullName.charAt(i) != ' '){
                System.out.println("Name is invalid");
                isValidName = false;
                break;
            }
        }

        this.fullName = isValidName ? fullName : "No Name";





        /*
            if(isValidName){
                this.fullName = fullName;
            } else {
                this.fullName = "No Name;
            }
         */

    }
}





