import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args)
    {
        double gallonsOfGas = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        double hundredMilesCost;
        double milesLeft;
        double hundredMiles;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.println("How many gallons of gas are in your tank?");
        if (in.hasNextDouble())
        {
            gallonsOfGas = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for gas: " + trash);
        }

        System.out.println("How many miles can your car go per gallon?");
        if (in.hasNextDouble())
        {
            fuelEfficiency = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for miles per gallon: " + trash);
        }

        System.out.println("How much does each gallon cost?");
        if (in.hasNextDouble())
        {
            pricePerGallon = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for dollars per gallon: " + trash);
        }

        milesLeft = gallonsOfGas * fuelEfficiency;
        hundredMiles = 100/fuelEfficiency;
        hundredMilesCost = pricePerGallon * hundredMiles;

        System.out.println("The cost to travel 100 miles is " + hundredMilesCost);
        System.out.println("You can drive " + milesLeft + " more miles with the current gas in your tank.");
    }

}
