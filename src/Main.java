import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static ArrayList<Admin> admins = new ArrayList<Admin>();

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        // Admin Object
        Admin adminObj = new Admin(1, "Shedrack Godson", "Admin", "newpass123");
        Admin adminObj2 = new Admin(2, "Seth Godson", "Admin", "newpass1234");
        admins.add(adminObj);
        admins.add(adminObj2);

        System.out.println("\t\t*****WELCOME TO OUR SCHOOL*****\t\t");

        System.out.println("\t\tEnter Credentials To Start Session\t");
        System.out.print("User ID: ");
        int adminId = input.nextInt();

        System.out.print("User Password: ");
        String adminPassword = input.next();
        int counter = 0;
        for(int i = 0; i <admins.size(); i++){
            if(admins.get(i).id == adminId ){
                if(admins.get(i).getPassword().equals(adminPassword)){
                    System.out.println("\tSession Started!");
                    System.out.println("Welcome " + admins.get(i).name );
                }else{
                    System.out.println("Invalid Credentials");
                    System.exit(1);
                }
                break;
            }

            counter++;
            if(counter == (admins.size()) ){
                System.out.println("Invalid ID");
                System.out.println("Invalid Credentials");
                System.exit(0);
            }
        }
        // If the credentials are valid

        Operations.chooseOperation();

    }
}