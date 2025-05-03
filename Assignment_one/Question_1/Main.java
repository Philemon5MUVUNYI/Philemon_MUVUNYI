package casestudy.question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contractor ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter contractor name: ");
        String name = scanner.nextLine();

        System.out.print("Enter initial balance(tons): ");
        double initialBalance = scanner.nextDouble();
        System.out.print("Enter BIJ: ");
        double bij = scanner.next();

        int choice;
        do {
            System.out.println("=== Site Construction System ===");
            System.out.println("1. Material Delivery.");
            System.out.println("2. Material Usage.");
            System.out.println("3. Cost Estimation.");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            double quantity = 0;
            if(choice < 4){
                System.out.print("Enter the material quantity: ");
                quantity = scanner.nextDouble();
            }

            switch (choice){
                case 1:
                    MaterialDelivery delivery = new MaterialDelivery(id, name, quantity, initialBalance);
                    delivery.receiveMaterial();
                    initialBalance = delivery.getMaterialBalance();
                    break;
                case 2:
                    MaterialUsage usage = new MaterialUsage(id, name, quantity, initialBalance);
                    usage.useMaterial();
                    initialBalance = usage.getMaterialBalance();
                    break;
                case 3:
                    CostEstimation estimation = new CostEstimation(id, name, quantity, initialBalance);
                    estimation.estimateCost();
                    break;
                case 4:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid input! Try again");
            }

        } while (choice != 4);
    }
}
