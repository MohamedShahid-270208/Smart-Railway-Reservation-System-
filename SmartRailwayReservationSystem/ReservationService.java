import java.util.ArrayList;
import java.util.Scanner;

public class ReservationService {

    private ArrayList<Ticket> tickets = new ArrayList<>();

    private RecommendationService recommendationService = new RecommendationService();
    private PredictionService predictionService = new PredictionService();

    private int pnrCounter = 1001;
    private int ticketCounter = 1;

    private Train train = new Train(
            12637,
            "Pandian Express",
            "Chennai",
            "Madurai",
            50,
            50
    );

    public void bookTicket(Scanner sc) {

        System.out.println("\n========= Ticket Booking =========");

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Gender : ");
        String gender = sc.nextLine();

        System.out.print("Enter Category (General/Senior Citizen/Differently Abled) : ");
        String category = sc.nextLine();

        System.out.print("Enter Source : ");
        String source = sc.nextLine();

        System.out.print("Enter Destination : ");
        String destination = sc.nextLine();

        System.out.print("Seat Preference (Window/Lower/Upper/Middle) : ");
        String preference = sc.nextLine();

        String pnr = "PNR" + pnrCounter++;
        String ticketId = "T" + ticketCounter++;

        Passenger passenger = new Passenger(
                pnr,
                name,
                age,
                gender,
                category,
                source,
                destination,
                preference,
                "",
                ""
        );

        String recommendedSeat = recommendationService.recommendSeat(passenger);

        System.out.println("\nRecommended Seat : " + recommendedSeat);

        String status;
        String seatNumber;

        if (train.getAvailableSeats() > 0) {

            status = "CONFIRMED";

            seatNumber = "S" + train.getAvailableSeats();

            train.setAvailableSeats(train.getAvailableSeats() - 1);

        }

        else {

            status = "WAITING";

            int waiting = tickets.size() - train.getTotalSeats() + 1;

            seatNumber = "WL" + waiting;

            String prediction =
                    predictionService.predictConfirmation(waiting);

            System.out.println("Confirmation Chance : " + prediction);

        }

        passenger.setSeatNumber(seatNumber);
        passenger.setStatus(status);

        Ticket ticket = new Ticket(
                ticketId,
                passenger,
                train,
                status,
                seatNumber,
                java.time.LocalDate.now().toString()
        );

        tickets.add(ticket);

        System.out.println("\nTicket Booked Successfully!");

        ticket.displayTicket();

    }
        public void searchTicket(String pnr) {

        boolean found = false;

        for (Ticket ticket : tickets) {

            if (ticket.getPassenger().getPnr().equalsIgnoreCase(pnr)) {

                ticket.displayTicket();
                found = true;
                break;

            }

        }

        if (!found) {

            System.out.println("Ticket Not Found.");

        }

    }

    public void cancelTicket(String pnr) {

        boolean found = false;

        for (int i = 0; i < tickets.size(); i++) {

            Ticket ticket = tickets.get(i);

            if (ticket.getPassenger().getPnr().equalsIgnoreCase(pnr)) {

                tickets.remove(i);

                train.setAvailableSeats(train.getAvailableSeats() + 1);

                System.out.println("\nTicket Cancelled Successfully!");

                found = true;

                break;

            }

        }

        if (!found) {

            System.out.println("Invalid PNR!");

        }

    }

    public void displayAllTickets() {

        if (tickets.isEmpty()) {

            System.out.println("\nNo Tickets Booked.");

            return;

        }

        for (Ticket ticket : tickets) {

            ticket.displayTicket();

        }

    }

    public void displayTrainDetails() {

        train.displayTrain();

    }
}