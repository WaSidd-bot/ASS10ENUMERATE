import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        final int LIST_NUMBER = 8;

        System.out.println("Hello operater!");
        System.out.println(
                "This is a list, in no particular order, of military aircraft that the author of this program likes/knows about :)");
        System.out.println("Please enter the index of the specific vehicle you are looking for, starting from 1 to "
                + LIST_NUMBER + ".");
        System.out.println("you may also select another aircraft to compare between the two!");

        for (int i = 0; i < LIST_NUMBER; i++) {
            System.out.println(Vehicle.values()[i]);
        }

        int userInput = scan.nextInt(); // original selected vehicle

        System.out.println(" -> Here is brief history about the vehicle to start off:");
        Vehicle.values()[userInput - 1].getBriefHistory();

        System.out.println(" -> Next, are some of the manufacturers who worked on this vehicle:");
        Vehicle.values()[userInput - 1].getManufacturers();

        System.out.println(" -> Year the vehicle was put into production:");
        Vehicle.values()[userInput - 1].getBirthYear();

        System.out.println(" -> Year the vehicle was retired/taken out of production:");
        Vehicle.values()[userInput - 1].getDecommissionYear();

        System.out.println(" -> How many years the vehicle was in use/production:");
        Vehicle.values()[userInput - 1].YearsInService();

        System.out.println(" -> Top seepd in knots:");
        Vehicle.values()[userInput - 1].getTopSpeed();

        System.out.println(" -> Stall speed in knots:");
        Vehicle.values()[userInput - 1].getStallSpeed();

        System.out.println("now please enter the aircraft you would like to compare statistics to!");
        int inputSecondAircraft = scan.nextInt(); // comparison vehicle

        scan.close();

        System.out.println(" -> Here is a list of common manufacturers between the two vehicles selected:");
        Vehicle.values()[userInput - 1].commonManufacturers(Vehicle.values()[inputSecondAircraft - 1]);

    }
}
