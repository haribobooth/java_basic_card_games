package scoring_strategies;

import cards.*;

public interface Scoring{
  public Dealable compare(Dealable hand1, Dealable hand2);
}
