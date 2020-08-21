public class Student extends User {

    Course student_course;
    public Student(int id, String name, String role, Course student_course){
        super.id = id;
        super.name = name;
        super.roles = role;
        this.student_course = student_course;
    }
    public Student(int id, String name, String role){
        this.id = id;
        this.name = name;
        this.roles = role;
    }

    @Override
    public int getId() {
        return this.id;
    }

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
    public String getRole() {
        return this.roles;
    }

    public Course getStudentCourse(){
        return this.student_course;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
