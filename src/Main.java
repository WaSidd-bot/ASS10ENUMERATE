import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        final int LIST_NUMBER = 10;

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

        System.out.println(" -> Here are some of the manufacturers/contractors who worked on this vehicle:");
        Vehicle.values()[userInput - 1].getManufacturers();

        System.out.println(" -> Year the vehicle was casted as an idea:");
        System.out.println(Vehicle.values()[userInput - 1].getBirthYear());

        System.out.println(" -> Year the vehicle was retired/taken out of production (if current year, vehicle still in service):");
        System.out.println(Vehicle.values()[userInput - 1].getDecommissionYear());

        System.out.println(" -> How many years the vehicle was in use/production:");
        System.out.println(Vehicle.values()[userInput - 1].YearsInService());

        System.out.println(" -> Top speed in knots:");
        System.out.println(Vehicle.values()[userInput - 1].getTopSpeed());

        System.out.println(" -> Stall speed in knots:");
        System.out.println(Vehicle.values()[userInput - 1].getStallSpeed());

        System.out.println(" -> Speed regime of the vehicle:");
        System.out.println(Vehicle.values()[userInput -1].SpeedRegime());

        System.out.println(" -> Here is brief history about the vehicle to start off (half the time a funny/true quote about it that I liked):");
        Vehicle.values()[userInput - 1].getBriefHistory();

        System.out.println("now please enter the aircraft you would like to compare statistics to!");
        int inputSecondAircraft = scan.nextInt(); // comparison vehicle, sees if there are any common manufacturers only

        scan.close();

        System.out.println(" -> Here are some of the manufacturers/contractors who worked on this vehicle:");
        Vehicle.values()[inputSecondAircraft - 1].getManufacturers();

        System.out.println(" -> Year the vehicle was casted as an idea:");
        System.out.println(Vehicle.values()[inputSecondAircraft - 1].getBirthYear());

        System.out.println(" -> Year the vehicle was retired/taken out of production (if current year, vehicle still in service):");
        System.out.println(Vehicle.values()[inputSecondAircraft - 1].getDecommissionYear());

        System.out.println(" -> How many years the vehicle was in use/production:");
        System.out.println(Vehicle.values()[inputSecondAircraft - 1].YearsInService());

        System.out.println(" -> Top speed in knots:");
        System.out.println(Vehicle.values()[inputSecondAircraft - 1].getTopSpeed());

        System.out.println(" -> Stall speed in knots:");
        System.out.println(Vehicle.values()[inputSecondAircraft - 1].getStallSpeed());

        System.out.println(" -> Speed regime of the vehicle:");
        System.out.println(Vehicle.values()[userInput -1].SpeedRegime());

        System.out.println(" -> Here is brief history about the vehicle to start off (half the time a funny/true quote about it that I liked):");
        Vehicle.values()[inputSecondAircraft - 1].getBriefHistory();

        System.out.println("<-------------------------------------------------------------------------------------------------------------------->");
        System.out.println("COMMON MANUFACTURERS/CONTRACTOR BETWEEN THE TWO SELECTED VEHICLES:\n");

        System.out.println(" -> Here is a list of common manufacturers/contractors between the two vehicles selected:");
        Vehicle.values()[userInput - 1].commonManufacturers(Vehicle.values()[inputSecondAircraft - 1]);

    }
}
