package games;

import java.util.*;
import rules.*;
import players.*;

public interface Playable{
  public void setRules(Winnable rules);
  public int playerCount();
  public void addPlayer(AbleToPlay player);
  public void setup();
  public void playRound();
  public AbleToPlay playGame();
}
