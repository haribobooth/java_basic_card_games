package cards;

import java.util.*;
import enums.*;

public class Card implements Dealable{

  private Suit suit;
  private Value value;

  public Card(Suit suit, Value value){
    this.suit = suit;
    this.value = value;
  }

  public Suit getSuit(){
    return this.suit;
  }

  public Value getValue(){
    return this.value;
  }

  public String getSummary(){
    String summary = value + " of " + suit +"S";
    return summary;
  }

}
