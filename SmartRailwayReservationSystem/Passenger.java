public class Passenger {

    private String pnr;
    private String name;
    private int age;
    private String gender;
    private String category;
    private String source;
    private String destination;
    private String seatPreference;
    private String seatNumber;
    private String status;

    public Passenger(String pnr, String name, int age, String gender,
                     String category, String source, String destination,
                     String seatPreference, String seatNumber, String status) {

        this.pnr = pnr;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.category = category;
        this.source = source;
        this.destination = destination;
        this.seatPreference = seatPreference;
        this.seatNumber = seatNumber;
        this.status = status;
    }

    public String getPnr() {
        return pnr;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCategory() {
        return category;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getSeatPreference() {
        return seatPreference;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayPassenger() {

        System.out.println("\n----------- Passenger Details -----------");
        System.out.println("PNR              : " + pnr);
        System.out.println("Name             : " + name);
        System.out.println("Age              : " + age);
        System.out.println("Gender           : " + gender);
        System.out.println("Category         : " + category);
        System.out.println("Source           : " + source);
        System.out.println("Destination      : " + destination);
        System.out.println("Seat Preference  : " + seatPreference);
        System.out.println("Seat Number      : " + seatNumber);
        System.out.println("Status           : " + status);
        System.out.println("-----------------------------------------");
    }
}