public class TryThisAtHome {
    public static void main(String[] args) {
        String firstName = "rayden";
        String lastName = "pasigado";
        int birthYear = 2008;

        int currentYear = 2026;
        int currentAge = currentYear - birthYear;

        System.out.println("Enter Firstname: " + firstName);
        System.out.println("Enter Lastname: " + lastName);
        System.out.println("Enter Birthyear: " + birthYear);
        System.out.println("Hello " + firstName + lastName + "! Your current age is " + currentAge + ".");
    }
}