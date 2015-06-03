
 public class Player {

	private int PlayerHand;
	private int CardHit;
	
public int HandDealt()
{
	int Card1;
	int Card2;
	
	
	Card1 = (int) (Math.random() * 11) + 1;
	Card2 = (int) (Math.random() * 11) + 1;
	PlayerHand=  Card1 + Card2;


	
	return PlayerHand;	
}


public int CardHit()
{
	CardHit = (int) (Math.random() * 11) + 1;
	return CardHit;
	
}
}
