import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        final int LIST_NUMBER = 9;

        System.out.println("Hello operater!");
        System.out.println("This is a list, in no particular order, of aircraft that the author of this program likes/knows about :)");
        System.out.println("Please enter the index of the specific vehicle you are looking for, starting from 0 to" + LIST_NUMBER);
        System.out.println("you may also select another aircraft to compare between the two!");

        

        int userInput = scan.nextInt();

        scan.close();


    }
}


