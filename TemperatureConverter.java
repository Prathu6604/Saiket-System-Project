import java.util.Scanner;

public class TemperatureConverter {

    // Method: Celsius to Fahrenheit
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method: Fahrenheit to Celsius
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Temperature Converter ---");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = sc.nextDouble();
                    double fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.println("Result: " + fahrenheit + " °F");
                    break;

                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheitInput = sc.nextDouble();
                    double celsiusResult = fahrenheitToCelsius(fahrenheitInput);
                    System.out.println("Result: " + celsiusResult + " °C");
                    break;

                case 3:
                    System.out.println("Converter Closed.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
