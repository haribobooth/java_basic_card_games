package rules;

import java.util.*;
import players.*;
import cards.*;
import decks.*;

public interface Winnable{
  public void setup(AbleToPlay player);
  public void playTurn(AbleToPlay player);
  public boolean checkWin(ArrayList<Dealable> cards);
  public AbleToPlay getWinner();
  public AbleToDeal getDeck();
  public boolean hasBeenWon();
}
