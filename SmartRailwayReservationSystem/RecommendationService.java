public class RecommendationService {

    public String recommendSeat(Passenger passenger) {

        if (passenger.getAge() >= 60) {
            return "Lower Berth";
        }

        if (passenger.getCategory().equalsIgnoreCase("Differently Abled")) {
            return "Lower Berth";
        }

        if (passenger.getSeatPreference().equalsIgnoreCase("Window")) {
            return "Window Seat";
        }

        if (passenger.getSeatPreference().equalsIgnoreCase("Upper")) {
            return "Upper Berth";
        }

        if (passenger.getSeatPreference().equalsIgnoreCase("Middle")) {
            return "Middle Berth";
        }

        return "Any Available Seat";
    }

}