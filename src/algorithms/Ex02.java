package algorithms;

import java.util.Scanner;

public class Ex02 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Report de value of a:");
        double a = scanner.nextDouble();
        System.out.println("Report de value of b:");
        double b = scanner.nextDouble();
        System.out.println("Report de value of c:");
        double c = scanner.nextDouble();

        scanner.close();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("The roots are, x1 = %.2f e x2 = %.2f%n", x1, x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.printf("For delta = 0, we have x1 = 0 e x2 = %.2f%n", x);
        } else {
            System.out.println("For delta negative there are no real roots");
        }
    }
}
