package BuidClassLocation;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        double[][] a = new double[row][column];
        System.out.println("Enter the array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scanner.nextDouble();
            }
        }
        Location location = Location.locateLargest(a);
        System.out.printf("The location of the largest element is %.1f at (%d, %d) ",location.maxValue, location.row ,location.column);
    }
}
