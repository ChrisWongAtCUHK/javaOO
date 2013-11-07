import static java.lang.System.out;

public class MyDisplayDeck {
	public static void main(String[] args){
		int numSuits = 4;
		int numRanks = 13;
		Deck deck = new Deck();
		
		for(int i = 1; i <= numSuits; i++){
			for(int j = 1; j <= numRanks; j++){
				out.print(Card.suitToString(deck.getCard(i, j).getSuit()) + " " + Card.rankToString(deck.getCard(i, j).getRank()) + "       ");
			}
			out.println();
		}
	}
}