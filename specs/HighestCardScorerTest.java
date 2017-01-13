import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import cards.*;
import enums.*;
import scoring_strategies.*;

public class HighestCardScorerTest{

  Scoring scorer;
  Dealable card1;
  Dealable card2;

  @Before
  public void before(){
    scorer = new HighestCardScorer();
    card1 = new Card(Suit.SPADE, Value.TWO);
    card2 = new Card(Suit.SPADE, Value.SEVEN);
  }

  @Test
  public void canCompareCards(){
    assertEquals(card2, scorer.compare(card1, card2));
  }

}
