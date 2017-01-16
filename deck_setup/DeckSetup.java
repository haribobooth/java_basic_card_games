package deck_setup;

import java.util.*;
import cards.*;
import enums.*;
import decks.*;

public class DeckSetup{

  private ArrayList<Suit> suits;
  private ArrayList<Value> values;
  private ArrayList<Value> rangedValues;
  private int numberOfDecks;

  public DeckSetup(int numberOfDecks){
    suits = new ArrayList<Suit>();
    values = new ArrayList<Value>();
    rangedValues = new ArrayList<Value>();
    this.numberOfDecks = numberOfDecks;

    suits.add(Suit.SPADE);
    suits.add(Suit.CLUB);
    suits.add(Suit.HEART);
    suits.add(Suit.DIAMOND);

    values.add(Value.ACE);
    values.add(Value.TWO);
    values.add(Value.THREE);
    values.add(Value.FOUR);
    values.add(Value.FIVE);
    values.add(Value.SIX);
    values.add(Value.SEVEN);
    values.add(Value.EIGHT);
    values.add(Value.NINE);
    values.add(Value.TEN);
    values.add(Value.JACK);
    values.add(Value.QUEEN);
    values.add(Value.KING);
  }

  public void setSuits(boolean spades, boolean clubs, boolean hearts, boolean diamonds){
    ArrayList<Suit> toRemove = new ArrayList<Suit>();
    if(spades == false){toRemove.add(Suit.SPADE);}
    if(clubs == false){toRemove.add(Suit.CLUB);}
    if(hearts == false){toRemove.add(Suit.HEART);}
    if(diamonds == false){toRemove.add(Suit.DIAMOND);}

    suits.removeAll(toRemove);
  }

  public void setRange(int min, int max){
    for(int i = min - 1; i < max - 1; i++){
      rangedValues.add(values.get(i));
    }
  }

  public AbleToDeal buildDeck(){
    Dealable card;
    AbleToDeal deck = new Deck();
    for(int i = 0; i < numberOfDecks; i++){
      for(Suit suit : suits){
        for(Value value : values){
          card = new Card(suit, value);
          deck.addCard(card);
        }
      }
    }
    return deck;
  }

  public static AbleToDeal standard52(){
    DeckSetup setup = new DeckSetup(1);
    setup.setSuits(true, true, true, true);
    setup.setRange(1, 13);
    return setup.buildDeck();
  }

}
