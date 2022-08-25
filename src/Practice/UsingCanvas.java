package Practice;

import java.util.ArrayList;

public class UsingCanvas {
    public static void main(String[] args) {

        Canvas canvas = new Canvas("Java quiz");
        System.out.println(canvas.topic);
        System.out.println(canvas.quizzes);
        System.out.println(canvas.modules);

        Quiz quiz1 = new Quiz("java1", 10, 100);
        quiz1.takeTheQuiz();
        System.out.println(quiz1.topic);
        System.out.println(quiz1.numOfQuestions);
        System.out.println(quiz1.totalPoints);

        Quiz quiz2 = new Quiz("java2", 10, 100);
        Quiz quiz3 = new Quiz("java3", 10, 100);

        File file1 = new File("java file", 4.5);
        file1.openFile();
        System.out.println(file1);
        File file2 = new File("oop file", 18.4);
        File file3 = new File("array file", 32.5);

        Module module = new Module();
        module.addFile(file1);
        module.addFile(file2);
        module.addFile(file3);
        System.out.println(module.files);

        module.removeFile(file2);
        System.out.println(module.files);

        ArrayList<Quiz> quizzes = new ArrayList<>();
        quizzes.add(quiz1);
        quizzes.add(quiz2);
        quizzes.add(quiz3);

        ArrayList<Module> modules = new ArrayList<>();
        module.addFile(file1);
        module.addFile(file2);
        module.addFile(file3);

        Canvas canvas1 = new Canvas("All stuff", quizzes,modules);
        System.out.println("============================");
        System.out.println(canvas1);
        System.out.println(canvas1.quizzes);
        System.out.println(canvas1.modules);

    }
}
