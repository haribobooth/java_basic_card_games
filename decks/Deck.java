package decks;

import java.util.*;

public class Deck{

  ArrayList<Card> cards;

  public Deck(){
    cards = new ArraList<Card>();
  }

  public int cardCount(){
    return this.cards.size();
  }

}
