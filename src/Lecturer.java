import java.util.ArrayList;

public class Lecturer extends User{
//    private final int id;
//    private final String name;
//    private final String role;
    protected ArrayList<Module> lecturer_modules;

    Lecturer(int id, String name, String role, ArrayList<Module> modules){
        super.id = id;
        super.name = name;
        super.roles = role;
        this.lecturer_modules = modules;
    }

    public ArrayList<Module> getModules() {
        return this.lecturer_modules;
    }

    public void addModule(Module module) {
        this.lecturer_modules.add(module);
    }

    @Override
    public int getId() {
        return 0;
    }

    //    @Override
//    public int getId() {
//        return this.id;
//    }
//
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getRoles() {
        return null;
    }

    @Override
    public int getID() {
        return 0;
    }

//    @Override
//    public String getRole() {
//        return this.role;
//    }

    @Override
    public String toString() {
        return this.getName();
    }
}
