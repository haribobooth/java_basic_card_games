package scoring_strategies;

import java.util.*;
import cards.*;

public interface Scoring{
  public ArrayList<Dealable> compare(ArrayList<Dealable> hand1, ArrayList<Dealable> hand2);
}
