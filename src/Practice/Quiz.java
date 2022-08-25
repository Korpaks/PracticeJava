package Practice;

public class Quiz {

    String topic;
    int numOfQuestions;
    double totalPoints;

    public Quiz(String topic, int numOfQuestions, double totalPoints) {
        this.topic = topic;
        this.numOfQuestions = numOfQuestions;
        this.totalPoints = totalPoints;
    }

    public void takeTheQuiz(){
        System.out.println("Taking the " + topic + " quiz");
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "topic='" + topic + '\'' +
                ", numOfQuestions=" + numOfQuestions +
                ", totalPoints=" + totalPoints +
                '}';
    }
}
