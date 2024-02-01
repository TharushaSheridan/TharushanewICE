/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Tharusha Liyanage
 */
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        
        // Generate random cards for magicHand
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(c.randomValue());
            c.setSuit(Card.SUITS[c.randomSuit()]);
            magicHand[i] = c;
        }
//        Card luckyCard = new Card();
//        luckyCard.setValue(7);
//        luckyCard.setSuit("Hearts");
        
        // Print the cards in magicHand
        for (Card magicHandx : magicHand) {
            System.out.println((magicHandx.getSuit() + " " + magicHandx.getValue()));
        }
//        System.out.println("Lucky Card: " + luckyCard.getSuit() + " " + luckyCard.getValue());
        
        // Ask the user for a card
        System.out.println("Enter a card value (1-13):");
        int value = input.nextInt();
        System.out.println("Enter a suit (0-3 where 0 = Hearts, 1 = Diamonds, 2 = Clubs, 3 = Spades):");
        int suit = input.nextInt();
        System.out.println("Your card is: " + value + " of " + suit);
        
        // Check if the user's card matches any card in magicHand
        boolean found = false;
        for (Card magicHandx : magicHand) {
            if (value == magicHandx.getValue() && suit == magicHandx.getSuitIndex()) {
                found = true;
                break;
            }
//this is a comment to check
        }
//         if (!found && value == luckyCard.getValue() && suit == luckyCard.getSuitIndex()) {
//            found = true;
//        }
        
 //        Report the result
         if (found) {
         System.out.println("Well done! Your card is in the magic hand.");
         } else
         {System.out.println("Sorry, your card is not in the magic hand.");
        }
        
        input.close();
    }
}

