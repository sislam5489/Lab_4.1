package Cards;

/*
 Name: Syeda Islam
 Date: 1/21/2018
 Description: A class that constructs each Card for the deck
 */
public class Card {

	// The attributes of a Card
	private String rank, suit;
	private int pointValue;
	//The constructor Class that will construct the Card
	public Card(String rank, String suit, int pointValue)
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	//Gets the rank of the Card
	public String getRank()
	{
		return this.rank;
	}
	//Gets the suite of the Card
	public String getSuit()
	{
		return this.suit;
	}
	//Gets the point Value of the Card
	public int getPointValue()
	{
		return this.pointValue;
	}
	//Checks if another card is equal to this card
	public boolean equals(Card otherCard)
	{
		if(((this.rank.equals(otherCard.getRank()))&&(this.suit.equals(otherCard.getSuit())))&&(this.pointValue==otherCard.getPointValue()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//When this method is called, lists the attributes of the card
	public String toString()
	{
		return "Rank: " + this.rank + "Suite: " + this.suit + "PointValue: " + this.pointValue;
	}
}
