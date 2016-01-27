/**
 * @author Melissa Page
 * Date: Jan 20
 */
package cashregister;

import java.util.Scanner;

public class CashRegister {

    /**
     * Take input (amount due and amount received)
     *  Calculate what the change would be and print it out
     */
    public static void main(String[] args) {
        final int HUNDRED = 100;
        final int FIFTY = 50;
        final int TWENTY = 20;
        final int TEN = 10;
        final int FIVE = 5;
        final int TWOONIE = 2;
        final int LOONIE = 1;
        final double QUARTER = 0.25;
        
        int numHundred;
        int numFifty;
        int numTwenty;
        int numTen;
        int numFive;
        int numTwoonie;
        int numLoonie;
        int numQuarter;
        double change;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the cost:");
        double cost = scan.nextDouble();
        
        System.out.println("Please enter the amount recieved:");
        double recieved = scan.nextDouble();
        
        change = recieved - cost;
        System.out.println("Your change is: " + change);
        
        numHundred = (int)(change/HUNDRED);
        change = change - HUNDRED * numHundred;
        
        numFifty = (int)(change/FIFTY);
        change = change - FIFTY * numFifty;
        
        numTwenty = (int)(change/TWENTY);
        change = change - TWENTY * numTwenty;
        
        numTen = (int)(change/TEN);
        change = change - TEN * numTen;
        
        numFive = (int)(change/FIVE);
        change = change - FIVE * numFive;
        
        numTwoonie = (int)(change/TWOONIE);
        change = change - TWOONIE * numTwoonie;
        
        numLoonie = (int)(change/LOONIE);
        change = change - LOONIE * numLoonie;
        
        numQuarter = (int)(change/QUARTER);
        cost = change - QUARTER * numQuarter;
        
        System.out.println("Which is:\n" + numHundred + " hundreds\n" + numFifty + " fifties\n" + numTwenty + " twenties\n" + numTen + " tens\n" + numFive + " fives\n" + numTwoonie + " twoonies\n" + numLoonie + " loonies\n" + numQuarter + " quarters");
    }
    
}
