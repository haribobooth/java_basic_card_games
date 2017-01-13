import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import cards.*;
import enums.*;

public class HighestCardScorerTest{

  Scoring scorer;
  Dealable card1;
  Dealable card2;

  @Before
  public void before(){
    scorer = new HighestCardScorer();
    card1 = new Card(Suit.ACE, Value.TWO);
    card1 = new Card(Suit.ACE, Value.SEVEN);
  }

  @Test
  public void canCompareCards(){
    scorer.compare(card1, card2);
  }

}
