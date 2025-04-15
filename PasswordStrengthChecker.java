import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        int strengthScore = checkPasswordStrength(password);

        System.out.println("\nPassword Strength Report:");
        switch (strengthScore) {
            case 5:
                System.out.println("Very Strong Password 💪");
                break;
            case 4:
                System.out.println("Strong Password 🙂");
                break;
            case 3:
                System.out.println("Moderate Password 😐");
                break;
            case 2:
                System.out.println("Weak Password ⚠️");
                break;
            default:
                System.out.println("Very Weak Password ❌");
                break;
        }

        scanner.close();
    }

    public static int checkPasswordStrength(String password) {
        int score = 0;

        if (password.length() >= 8)
            score++;

        if (password.matches(".*[A-Z].*"))
            score++;

        if (password.matches(".*[a-z].*"))
            score++;

        if (password.matches(".*\\d.*"))
            score++;

        if (password.matches(".*[!@#$%^&*()_+=|<>?{}\\[\\]~-].*"))
            score++;

        return score;
    }
}
