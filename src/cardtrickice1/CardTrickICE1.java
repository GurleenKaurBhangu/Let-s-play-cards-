/*
 
 */
package cardtrickice1;
import java.util.Arrays;
     import java.util.Scanner;
        import java.util.Random;
        

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */

public class CardTrickICE1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        Random r= new Random();
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(r.nextInt(13) +  2);
            c1.setSuits(Card.SUITS[r.nextInt(2)]);//use a method to generate random *13
            magicHand[i]= c1;//random method suit 
        }
        //step 2:take input 
        Card userCard = new Card(); 
        int value;
        String suit;
        boolean found= false;
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a digit from 1 to 12: ");
        value= input.nextInt();
        
        //step 3: match with array 
    System.out.print(" Choose a suit " + Arrays.toString(Card.SUITS) + ": ");
    suit= input.next();
    userCard.setValue(value);
    userCard.setSuits(suit);
    for(int i= 0; i<magicHand.length; i++) {
        if(magicHand[i].getValue()==userCard.getValue() &&
                magicHand[i].getSuits().equalsIgnoreCase(userCard.getSuits())) {
            found= true;
            break;
        }
    }
    if(found)
        System.out.println("User card found in magic hand");
        else
        System.out.println("User card not found");
    }
    
}
