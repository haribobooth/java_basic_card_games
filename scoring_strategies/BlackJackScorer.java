package scoring_strategies;

import java.util.*;
import cards.*;
import enums.*;

public class BlackJackScorer implements Scoring{

  private HashMap<Value, Integer> valueMap = new HashMap<Value, Integer>();

  public BlackJackScorer(){
    valueMap.put(Value.TWO, 2);
    valueMap.put(Value.THREE, 3);
    valueMap.put(Value.FOUR, 4);
    valueMap.put(Value.FIVE, 5);
    valueMap.put(Value.SIX, 6);
    valueMap.put(Value.SEVEN, 7);
    valueMap.put(Value.EIGHT, 8);
    valueMap.put(Value.NINE, 9);
    valueMap.put(Value.TEN, 10);
    valueMap.put(Value.JACK, 10);
    valueMap.put(Value.QUEEN, 10);
    valueMap.put(Value.KING, 10);
    valueMap.put(Value.ACE, 11);
    valueMap.put(Value.JOKER, 0);
  }

  public ArrayList<Dealable> compare(ArrayList<Dealable> hand1, ArrayList<Dealable> hand2){
    int hand1Total = 0;
    int hand2Total = 0;

    for(Dealable card : hand1){hand1Total += valueMap.get(card.getValue());}
    for(Dealable card : hand2){hand2Total += valueMap.get(card.getValue());}

    if(hand1Total > 21){hand1Total = 0;}
    if(hand2Total > 21){hand2Total = 0;}

    return hand1Total > hand2Total ? hand1 : hand2;
  }

}
