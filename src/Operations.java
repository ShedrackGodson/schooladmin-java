import java.util.Scanner;

public class Operations {
    public static void chooseOperation() {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Choose Operation Below: \n1. Register Course\n2. Register Module\n3. Register Student" +
                    "\n4. Register Lecturer\n5. View Students\n6. View Lecturers\n7. View Courses\n8. View Modules" +
                    "\n9. Logout ");
            System.out.print("Enter choice: ");
            int operation = input.nextInt();
            if (operation == 1) {
                System.out.println("Register Course");
            } else if (operation == 2) {
                System.out.println("Register Module");
            } else if (operation == 3) {
                System.out.println("Register Student");
            } else if(operation ==4 ){
                System.out.println("Always nice working with you, :)");
                break;
            } else if(operation == 9){
                System.out.println("\tSession Ends!");
                break;
            } else {
                System.out.println("Invalid operation. Please choose a correct operation");
            }
        }

    }
}
