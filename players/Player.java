package players;

import java.util.*;
import cards.*;

public class Player implements AbleToPlay{

  ArrayList<Dealable> hand;

  public Player(){
    hand = new ArrayList<Dealable>();
  }

  public int cardCount(){
    return this.hand.size();
  }

  public void addCard(Dealable card){
    hand.add(card);
  }

}
