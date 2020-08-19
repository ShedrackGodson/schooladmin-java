import java.util.Scanner;

public class Operations {
    public static void chooseOperation() {
//        Lecturer lecturer = new Lecturer();

        Registering registerObj = new Registering();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Choose Operation Below: \n1. Register Course\n2. Register Module\n3. Register Student" +
                    "\n4. Register Lecturer\n5. View Students\n6. View Lecturers\n7. View Courses\n8. View Modules" +
                    "\n9. Logout ");
            System.out.print("Enter choice: ");
            int operation = input.nextInt();
            if (operation == 1) {
                registerObj.registerCourse();
            } else if (operation == 2) {
                registerObj.registerModule();
            } else if (operation == 3) {
                registerObj.registerStudent();
            } else if(operation ==4 ){
                registerObj.registerLecturer();
            } else if(operation == 5){
                System.out.println("The following are a list of Registered Students.");
                System.out.println(registerObj.getStudents()); // Returned Boolean
            } else if(operation == 6){
                System.out.println("The following are a list of Registered Lecturers.");
                System.out.println(registerObj.getLecturers()); // Returned Boolean
                //Print Lecturer module
//                System.out.println("The modules he works on are: ");
//                for(Module module: lecturer.getModules())
//                    System.out.print(module.getModule_name() + "\t");
            } else if(operation == 7){
                System.out.println("The following are a list of Registered Courses.");
                System.out.println(registerObj.getCourses());
            } else if(operation == 8){
                System.out.println("The following are a list of Registered Modules.");
                System.out.println(registerObj.getModules());
            } else if(operation == 9){
                System.out.println("\tSession Ends!");
                break;
            } else {
                System.out.println("Invalid operation. Please choose a correct operation");
            }
        }

    }
}
