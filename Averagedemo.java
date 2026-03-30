import java.util.Scanner;

// User-defined exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class AverageDemo {
    public static void main(String[] args) {

        // try-with-resources ensures scanner is automatically closed
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter number of values: ");
            int n = scanner.nextInt();

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter number " + i + ": ");
                int num = scanner.nextInt();

                if (num < 0) {
                    throw new NegativeNumberException("Negative number not allowed: " + num);
                }

                sum += num;
            }

            double avg = (double) sum / n;
            System.out.println("Average = " + avg);

        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}