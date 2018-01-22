package Cards;
import java.util.ArrayList;
/*
Name: Syeda Islam
Date: 1/21/2018
Description: A class that constructs each Card for the deck
*/
public class Deck {

	//Attributes of a Deck
	private ArrayList<Card> unDealt, Dealt;
	private int size;
	//Constructs the Deck
	public Deck(String[]ranks,String[]suits,int[]pointValues)
	{
		this.unDealt = new ArrayList<Card>();
        for (int i = 0; i < ranks.length; i++) {
            Card aCard = new Card(ranks[i], suits[i], pointValues[i]);
            this.unDealt.add(aCard);
        }
        this.size = this.unDealt.size();
        shuffle();
	}
	//Checks if the Deck is empty by checking if the size is zero
	public boolean isEmpty()
	{
		if(this.unDealt.size()==0) {
			return true;
		}
		return false;
	}
	//returns the size of the Deck
	public int size()
	{
		return this.unDealt.size();
	}
	//Deals the deck
	public Card deal()
	{
		
		this.size = this.size -1;
		if(this.size>0)
		{
			this.unDealt = Dealt;
			return this.Dealt.get(this.size);
		}
		return null;
		
	}
	//Shuffles the deck by shuffling random indices with eachother
	public void shuffle()
	{
		for( int k = size - 1; k >= 0; k-- )
		{
            int r = (int)(Math.random() * k);
            Card tmp = unDealt.get(r);
            unDealt.set(r, unDealt.get(k));
            unDealt.set(k, tmp);
        }
	}
}
