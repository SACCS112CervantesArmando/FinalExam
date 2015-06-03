import java.util.Scanner;
public class MainBlackJackGame {



public static void main (String[] args)
{
	String	Answer1;
	String  Answer2;
	int total = 0;
	int dealerHandTotal = 0;
	 
	 Scanner input = new Scanner(System.in);

	 System.out.println("Do you want play a Blackjack game?");
	 Answer1 = input.nextLine();

	 if(Answer1.equalsIgnoreCase("yes"))
	 {
		 
		 Player Hand= new Player(); 
		 	int playerHand = Hand.HandDealt(); 
	 
		 		System.out.printf("Player hand value: %d", playerHand );


		 Dealer Hand2= new Dealer(); 
		 	int dealerHand = Hand2.HandDealt();
		 	
		 			System.out.printf("\nDealer hand value: %d", dealerHand );
	 
		System.out.print("\nWould you like to hit?");
		Answer2 = input.nextLine();
		
		if (Answer2.equalsIgnoreCase("Yes")&& dealerHand <17)
		{
			Player Hit = new Player();
			int CardHit = Hit.CardHit();
			 total = CardHit + playerHand;		
				
			System.out.printf("Your new hand is: %d", total);
			
		}
		
		if (Answer2 .equalsIgnoreCase("no")&& dealerHand < 17)
		{
			Dealer Hit1 = new Dealer();
			int DealerHit = Hit1.CardHit();
			dealerHandTotal = DealerHit + dealerHand;
			
			System.out.printf("The Dealer chose to hit, dealer now has: %d", dealerHandTotal);
		}
		 
		 if ( total > 21 )
		 {
			 System.out.println("\nyou lose " );
			 
		 }

		 if ( dealerHandTotal > 21 )
		 {
			 System.out.println("\ndealer lost " );
			 
		 }
		 
		 if ( total <= 21 && total > dealerHandTotal)
		 {
			 System.out.println("\nyou win " );
		 }
		 
		 if ( dealerHandTotal <= 21 && total < dealerHandTotal)
		 {
			 System.out.println("\ndealer wins " );
		 }
		 
		 if (dealerHandTotal <= 21 && total == dealerHandTotal)
		 {
			 System.out.println("\nIt's a push");
		 }
		 
	  
	 }
	 
	 else 
		 System.out.print("Sorry to see you go!");

	 }


}
	

