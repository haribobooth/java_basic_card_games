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
  ArrayList<Dealable> hand1;
  ArrayList<Dealable> hand2;

  @Before
  public void before(){
    scorer = new HighestCardScorer();
    card1 = new Card(Suit.SPADE, Value.TWO);
    card2 = new Card(Suit.SPADE, Value.SEVEN);
    hand1 = new ArrayList<Dealable>();
    hand2 = new ArrayList<Dealable>();
    hand1.add(card1);
    hand2.add(card2);
  }

  @Test
  public void canCompareCards(){
    assertEquals(hand2, scorer.compare(hand1, hand2));
  }
}
