package rules;

import java.util.*;
import cards.*;
import deck_setup.*;
import decks.*;
import enums.*;
import players.*;
import scoring_strategies.*;

public class BlackJack implements Winnable{

  private Scoring scorer;
  private AbleToDeal deck;
  private boolean hasBeenWon;
  private AbleToPlay winner;
  private ArrayList<Dealable> winningCards;

  public BlackJack(){
    this.scorer = new BlackJackScorer();
    this.deck = DeckSetup.standard52();
    winningCards = new ArrayList<Dealable>();
    // when running tests please comment out deck.shuffle() in HighestCard.java
    // deck.shuffle();
    Dealable startCard = new Card(Suit.SPADE, Value.JOKER);
    winningCards.add(startCard);
  }

  public void setup(AbleToPlay player){
    deck.dealCard(player);
    deck.dealCard(player);
  }

  public void playTurn(AbleToPlay player){
    boolean isPlayerWinning;
    isPlayerWinning = checkWin(player.getHand());
    if(isPlayerWinning == true){winner = player;}
    hasBeenWon = true;
  }

  public boolean checkWin(ArrayList<Dealable> hand){
    winningCards = scorer.compare(hand, winningCards);
    return winningCards == hand;
  }

  public AbleToPlay getWinner(){
    return this.winner;
  }

  public AbleToDeal getDeck(){
    return this.deck;
  }

  public boolean hasBeenWon(){
    return this.hasBeenWon;
  }

}
