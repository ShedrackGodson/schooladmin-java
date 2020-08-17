import java.util.ArrayList;

public class Course {
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private String name;

    Course(String name, ArrayList<Module> modules) {
        this.name = name;
        this.modules = modules;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return this.modules;
    }

    public void setModules(Module module) {
        this.modules.add(module);
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }
}
