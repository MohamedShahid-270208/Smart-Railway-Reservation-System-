public class Ticket {

    private String ticketId;
    private Passenger passenger;
    private Train train;
    private String bookingStatus;
    private String seatNumber;
    private String bookingDate;

    public Ticket(String ticketId, Passenger passenger, Train train,
                  String bookingStatus, String seatNumber, String bookingDate) {

        this.ticketId = ticketId;
        this.passenger = passenger;
        this.train = train;
        this.bookingStatus = bookingStatus;
        this.seatNumber = seatNumber;
        this.bookingDate = bookingDate;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Train getTrain() {
        return train;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void displayTicket() {

        System.out.println("\n========== Ticket Details ==========");
        System.out.println("Ticket ID      : " + ticketId);
        System.out.println("Passenger Name : " + passenger.getName());
        System.out.println("PNR            : " + passenger.getPnr());
        System.out.println("Train          : " + train.getTrainName());
        System.out.println("Train Number   : " + train.getTrainNumber());
        System.out.println("Seat Number    : " + seatNumber);
        System.out.println("Booking Status : " + bookingStatus);
        System.out.println("Booking Date   : " + bookingDate);
        System.out.println("====================================");
    }

}