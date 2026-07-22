public class Validation {

    public boolean validateAge(int age) {

        return age > 0 && age <= 120;

    }

    public boolean validateGender(String gender) {

        return gender.equalsIgnoreCase("Male") ||
               gender.equalsIgnoreCase("Female") ||
               gender.equalsIgnoreCase("Other");

    }

    public boolean validateName(String name) {

        return name != null && !name.trim().isEmpty();

    }

}