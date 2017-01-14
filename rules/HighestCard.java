package rules;

import java.util.*;
import cards.*;
import deck_setup.*;
import decks.*;
import enums.*;
import players.*;
import scoring_strategies.*;

public class HighestCard implements Winnable{

  private Scoring scorer;
  private AbleToDeal deck;
  private boolean hasBeenWon;
  private AbleToPlay winner;
  private Dealable winningCard;

  public HighestCard(){
    this.scorer = new HighestCardScorer();
    this.deck = DeckSetup.standard52();
    // when running tests please comment out deck.shuffle() in HighestCard.java
    // deck.shuffle();
    this.winningCard = new Card(Suit.SPADE, Value.JOKER);
  }

  public void setup(AbleToPlay player){
    deck.dealCard(player);
  }

  public void playTurn(AbleToPlay player){
    boolean isPlayerWinning;
    isPlayerWinning = checkWin(player.getHand());
    if(isPlayerWinning == true){winner = player;}
    hasBeenWon = true;
  }

  public boolean checkWin(ArrayList<Dealable> cards){
    Dealable card = cards.get(0);
    winningCard = scorer.compare(card, winningCard);
    return winningCard == card;
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
