public class PredictionService {

    public String predictConfirmation(int waitingPosition) {

        if (waitingPosition <= 2) {
            return "HIGH";
        }

        else if (waitingPosition <= 5) {
            return "MEDIUM";
        }

        else {
            return "LOW";
        }

    }

}