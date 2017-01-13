package decks;

import cards.*;
import players.*;

public interface AbleToDeal{
  public int cardCount();
  public Dealable getTopCard();
  public void addCard(Dealable card);
  public void removeCard(Dealable card);
  public void dealCard(AbleToPlay player);
}
