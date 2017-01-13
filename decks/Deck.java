package decks;

import java.util.*;
import cards.*;
import players.*;

public class Deck implements AbleToDeal{

  private ArrayList<Dealable> cards;

  public Deck(){
    cards = new ArrayList<Dealable>();
  }

  public int cardCount(){
    return this.cards.size();
  }

  public Dealable getTopCard(){
    return cards.get(0);
  }

  public void addCard(Dealable card){
    cards.add(card);
  }

  public void removeCard(Dealable card){
    cards.remove(cards.indexOf(card));
  }

  public void dealCard(AbleToPlay player){
    Dealable dealtCard = getTopCard();
    player.addCard(dealtCard);
    cards.remove(cards.indexOf(dealtCard));
  }

}
