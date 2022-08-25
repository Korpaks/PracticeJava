package Practice;

import java.util.ArrayList;

public class Module {
    public ArrayList<File> files = new ArrayList<>();

    public Module(){

    }
    public Module(ArrayList<File> files){
        this();
        files.addAll(files);
    }

    public void addFile(File file){
        files.add(file);
    }

    public void removeFile(File file){
        files.remove(file);
    }

    @Override
    public String toString() {
        return "Module{" +
                "files=" + files +
                '}';
    }
}
