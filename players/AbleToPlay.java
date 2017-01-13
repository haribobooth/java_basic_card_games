package players;

import java.util.*;
import cards.*;

public interface AbleToPlay{
  public int cardCount();
  public void addCard(Dealable card);
  public ArrayList<Dealable> getHand();
}
