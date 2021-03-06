package scoring_strategies;

import java.util.*;
import cards.*;
import enums.*;

public class HighestCardScorer implements Scoring{

  private HashMap<Value, Integer> valueMap = new HashMap<Value, Integer>();

  public HighestCardScorer(){
    valueMap.put(Value.ACE, 14);
    valueMap.put(Value.TWO, 2);
    valueMap.put(Value.THREE, 3);
    valueMap.put(Value.FOUR, 4);
    valueMap.put(Value.FIVE, 5);
    valueMap.put(Value.SIX, 6);
    valueMap.put(Value.SEVEN, 7);
    valueMap.put(Value.EIGHT, 8);
    valueMap.put(Value.NINE, 9);
    valueMap.put(Value.TEN, 10);
    valueMap.put(Value.JACK, 11);
    valueMap.put(Value.QUEEN, 12);
    valueMap.put(Value.KING, 13);
    valueMap.put(Value.JOKER, 0);
  }

  public ArrayList<Dealable> compare(ArrayList<Dealable> hand1, ArrayList<Dealable> hand2){
    Dealable card1 = hand1.get(0);
    Dealable card2 = hand2.get(0);
    Integer card1Score = valueMap.get(card1.getValue());
    Integer card2Score = valueMap.get(card2.getValue());
    return card1Score > card2Score ? hand1 : hand2;
  }

}
