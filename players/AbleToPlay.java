package players;

import cards.*;

public interface AbleToPlay{
  public int cardCount();
  public void addCard(Dealable card);
}
