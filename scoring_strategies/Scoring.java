package scoring_strategies;

import cards.*;

public interface Scoring{
  public Dealable compare(Dealable card1, Dealable card2);
}
