import java.util.Scanner;

public class SammysRentalPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes rented: ");
        int minutes = scanner.nextInt();

        // Calculate hours and remaining minutes
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        // Calculate the total rental cost
        double hourlyCost = hours * 40;
        double extraMinuteCost = remainingMinutes * 1;
        double totalCost = hourlyCost + extraMinuteCost;

        // Display the results
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + remainingMinutes);
        System.out.println("Total Cost: $" + totalCost);

        // Display Sammy's motto
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    }
}