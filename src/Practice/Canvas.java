package Practice;

import java.util.ArrayList;

public class Canvas {

    String topic;
    ArrayList<Quiz> quizzes;
    ArrayList<Module> modules;

    public Canvas(String topic) {
        this.topic = topic;
        this.quizzes = new ArrayList<>();
        this.modules = new ArrayList<>();
    }

    public Canvas(String topic, ArrayList<Quiz> quizzes, ArrayList<Module> modules) {
        this(topic);
        this.quizzes.addAll(quizzes);
        this.modules.addAll(modules);
    }

    @Override
    public String toString() {
        return "Canvas{" +
                "topic='" + topic + '\'' +
                ", quizzes=" + quizzes +
                ", modules=" + modules +
                '}';
    }
}
