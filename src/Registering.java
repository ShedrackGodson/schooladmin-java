import java.util.ArrayList;
import java.util.Scanner;

public class Registering {
    ArrayList<Module> modules = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Lecturer> lecturers = new ArrayList<>();

    // Register A New Course
    protected void registerCourse() {

        Scanner input = new Scanner(System.in);

        System.out.print("Course Name: ");
        String course_name = input.next();

        // Number of Modules a course will have
        System.out.print("Number of modules: ");
        int modules_number = input.nextInt();

        if(modules_number > modules.size()){
            System.out.println("There are only " + modules.size() + " modules.");
            System.out.println("Enter the correct number of modules.");
            return;
        }

        System.out.println("Modules Available. Enter module code to assign to " + course_name);
        for(int i = 0; i<modules.size() ; i++ )
            System.out.println((i + 1) + " Module name: " + modules.get(i).getModule_name());
        //An array to hold the initial modules that course will have
        ArrayList<Module> modules_assign_to_course = new ArrayList<>();

        // Populate the array
        for(int i = 0; i<modules_number; i++) {
            System.out.print("Enter number for module " + (i + 1) + ": ");
            int module_number = input.nextInt();
            modules_assign_to_course.add(modules.get((module_number - 1)));
        }

        // Add Course
        Course new_course = new Course(course_name, modules_assign_to_course);
        courses.add(new_course);
        System.out.println("The course: "+ course_name + " has been registered");
    }

    // Register A New Module
    protected void registerModule() {
        Scanner input = new Scanner(System.in);

        // Ask for module Information
        System.out.print("Enter Module Name: ");
        String name = input.next();

        System.out.print("Enter Module Code: ");
        String code = input.next();

        // Create new Module
        Module module = new Module(name, code);
        modules.add(module);
        System.out.println("\nYou have successfully registered a new module.");
    }

    // Register A New Student
    protected void registerStudent() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = input.nextInt();

        System.out.print("Enter Student Name: ");
        String name = input.next();

        // Choose Student Course
        if(courses.size() > 0) {
            System.out.println("\tCourses Available");
            for (int i = 0; i < courses.size(); i++) {
                System.out.println((i + 1) + ": " + courses.get(i).getName());
            }
            System.out.print("Enter Course choice: ");
            int choice = input.nextInt();

            // Create new Student
            Student student = new Student(id, name, "Student");
            students.add(student);
            student.student_course = courses.get(choice-1);
            System.out.println("\nYou have successfully registered a new Student.");
        } else {
            System.out.println("Add A Course In Order to Register A Student.");

        }


    }

    // Registering Lecturer
    protected void registerLecturer() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Lecturer ID: ");
        int id = input.nextInt();

        System.out.print("Enter Lecturer Name: ");
        String lecturer_name = input.next();

        // Assign Modules To Lecturer
        System.out.println("How many modules will "+lecturer_name+" teach?");
        int modules_number = input.nextInt();

        if(modules_number > modules.size()){
            System.out.println("There are only: " + modules.size());
        } else{
            // Modules Available
            for(int i = 0; i<modules.size() ; i++ )
                System.out.println((i+1) + " Module name: " + modules.get(i).getModule_name() );

            //An array to hold the initial modules that lecturer will work upon
            ArrayList<Module> lecturer_modules = new ArrayList<>();

            //Populate the array
            for(int i = 0; i<modules_number; i++){
                System.out.print("Enter number for module " + (i+1) + ": ");
                int module_number = input.nextInt();
                lecturer_modules.add(modules.get((module_number -1)));
            }

            // Create the lecturer object
            Lecturer new_lecturer = new Lecturer(id, lecturer_name, "Lecturer", lecturer_modules);
            lecturers.add(new_lecturer);
            System.out.println("New lecturer created.");

        }

    }

    public boolean getStudents() {
        for(int i=0;i<students.size();i++) {
            System.out.println("\t\tStudent " + (i+1));
            System.out.println("Student ID: " +students.get(i).getId());
            System.out.println("Student Name: " +students.get(i).getName());
            System.out.println("\tStudent Courses: " + students.get(i).getStudentCourse().getName());
            System.out.println();
        }
        return false;
    }

    public boolean getCourses(){
        for (Course course : courses) {
            System.out.println("Course Name: " + course.getName());
            System.out.println("Course Modules: " + course.getModules().toString());
            System.out.println();
        }
        return false;
    }

    public boolean getModules(){
        for (Module module : modules) {
            System.out.println("Module Code: " + module.getModule_code());
            System.out.println("Module Name: " + module.getModule_name());
            System.out.println();
        }
        return false;
    }

    public boolean getLecturers() {
        if (lecturers.size() > 0) {
        for (int i = 0; i < lecturers.size(); i++) {
            System.out.println("\t\tLecturer " + (i + 1));
            System.out.println("Lecturer ID: " + lecturers.get(i).getId());
            System.out.println("Lecturer Name: " + lecturers.get(i).getName());
            System.out.println("\tModules Teaching: " + lecturers.get(i).lecturer_modules);
            System.out.println();
        }
    } else {
            System.out.println("There is no registered lecturer.");
        }
        return false;
    }
}
