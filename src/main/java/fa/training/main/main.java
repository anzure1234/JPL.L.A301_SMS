package fa.training.main;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Choose your option-----");
        System.out.println("1. Add new customer");
        System.out.println("2. Update customer");
        System.out.println("3. Delete customer");
        System.out.println("4. Get all customer");
        System.out.println("5. Exit");
        while(true){
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add new customer");
                    break;
                case 2:
                    System.out.println("Update customer");
                    break;
                case 3:
                    System.out.println("Delete customer");
                    break;
                case 4:
                    System.out.println("Get all customer");
                    break;
                case 5:
                    System.out.println("Exit");
                    System.exit(choice);
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

    }

}
