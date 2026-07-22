public class Train {

    private int trainNumber;
    private String trainName;
    private String source;
    private String destination;
    private int totalSeats;
    private int availableSeats;

    public Train(int trainNumber, String trainName, String source,
                 String destination, int totalSeats, int availableSeats) {

        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void displayTrain() {

        System.out.println("\n========== Train Details ==========");
        System.out.println("Train Number   : " + trainNumber);
        System.out.println("Train Name     : " + trainName);
        System.out.println("Source         : " + source);
        System.out.println("Destination    : " + destination);
        System.out.println("Total Seats    : " + totalSeats);
        System.out.println("Available Seat : " + availableSeats);
        System.out.println("===================================");
    }

}