package online_reservation;

import java.util.Scanner;

public class Online_Reservation {
   
        private static final String USERNAME = "Lacchu";
        private static final String PASSWORD = "54321";

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            boolean isLoggedIn = false;

            while (!isLoggedIn) {
                System.out.println("Login Form");
                System.out.println("Please enter your username: ");
                String username = sc.nextLine();

                System.out.println("Please enter your password: ");
                String password = sc.nextLine();

                if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                    isLoggedIn = true;
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Invalid username or password. Please try again.");
                }
            }

            while (isLoggedIn) {
                System.out.println("Please select an option: ");
                System.out.println("1. Reservation Form");
                System.out.println("2. Cancellation Form");
                System.out.println("3. Logout");

                int option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 1:
                        System.out.println("Reservation Form");

                        System.out.println("Please enter your name: ");
                        String name = sc.nextLine();

                        System.out.println("Please enter your age: ");
                        int age = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Please enter the train number: ");
                        int trainNumber = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Please enter the class type: ");
                        String classType = sc.nextLine();

                        System.out.println("Please enter the date of journey (DD/MM/YYYY): ");
                        String dateOfJourney = sc.nextLine();

                        System.out.println("Please enter the Place of Journey: ");
                        String origin = sc.nextLine();

                        System.out.println("Please enter the destination: ");
                        String destination = sc.nextLine();

                        System.out.println("Reservation successful!");
                        break;
                    case 2:
                        System.out.println("Cancellation Form");

                        System.out.println("Please enter your name: ");
                        name = sc.nextLine();

                        System.out.println("Please enter the train number: ");
                        trainNumber = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Please enter the date of journey (DD/MM/YYYY): ");
                        dateOfJourney = sc.nextLine();

                        System.out.println("Cancellation successful!");
                        break;
                    case 3:
                        isLoggedIn = false;
                        System.out.println("Logout successful!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        }
    }
    

