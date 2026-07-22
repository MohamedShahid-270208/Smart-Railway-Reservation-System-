import java.util.Scanner;

public class Menu {

    private ReservationService reservationService = new ReservationService();
    private Scanner sc = new Scanner(System.in);

    public void start() {

        int choice;

        do {

            System.out.println("\n==============================================");
            System.out.println(" SMART RAILWAY RESERVATION SYSTEM ");
            System.out.println("==============================================");
            System.out.println("1. View Train Details");
            System.out.println("2. Book Ticket");
            System.out.println("3. Search Ticket");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. Display All Tickets");
            System.out.println("6. Exit");
            System.out.println("==============================================");

            System.out.print("Enter Your Choice : ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    reservationService.displayTrainDetails();
                    break;

                case 2:

                    reservationService.bookTicket(sc);
                    break;

                case 3:

                    System.out.print("Enter PNR : ");
                    String pnrSearch = sc.nextLine();

                    reservationService.searchTicket(pnrSearch);
                    break;

                case 4:

                    System.out.print("Enter PNR : ");
                    String pnrCancel = sc.nextLine();

                    reservationService.cancelTicket(pnrCancel);
                    break;

                case 5:

                    reservationService.displayAllTickets();
                    break;

                case 6:

                    System.out.println("\nThank You for using Smart Railway Reservation System!");
                    break;

                default:

                    System.out.println("\nInvalid Choice!");

            }

        } while (choice != 6);

    }

}