import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        final int LIST_NUMBER = 2;

        System.out.println("Hello operater!");
        System.out.println("This is a list, in no particular order, of aircraft that the author of this program likes/knows about :)");
        System.out.println("Please enter the index of the specific vehicle you are looking for, starting from 1 to" + LIST_NUMBER);
        System.out.println("you may also select another aircraft to compare between the two!");

        for(int i = 0; i < LIST_NUMBER; i++) {
            System.out.println(Vehicle.values()[i]);
        }

        int userInput = scan.nextInt();

        scan.close();

        Vehicle.values()[userInput - 1].getBriefHistory();
        Vehicle.values()[userInput - 1].getManufacturers();
        Vehicle.values()[userInput - 1].commonManufacturers(Vehicle.values()[1]);

        
    }
}


