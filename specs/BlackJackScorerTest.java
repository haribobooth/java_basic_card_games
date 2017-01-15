import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import cards.*;
import enums.*;
import scoring_strategies.*;
import players.*;

public class BlackJackScorerTest{

  Scoring scorer;
  AbleToPlay player1;
  AbleToPlay player2;
  Dealable card1;
  Dealable card2;

  @Before
  public void before(){
    scorer = new BlackJackScorer();
    player1 = new Player();
    player2 = new Player();
    card1 = new Card(Suit.SPADE, Value.ACE);
    card2 = new Card(Suit.SPADE, Value.TEN);
  }

  @Test
  public void canCompareNormalHands(){
    player1.addCard(card1);
    player1.addCard(card2);
    player2.addCard(card2);
    player2.addCard(card2);
    ArrayList<Dealable> hand1 = player1.getHand();
    ArrayList<Dealable> hand2 = player2.getHand();
    assertEquals(hand1, scorer.compare(hand1, hand2));
  }

  @Test
  public void canCompareHandsWithOneBust(){
    player1.addCard(card1);
    player1.addCard(card1);
    player2.addCard(card2);
    player2.addCard(card2);
    ArrayList<Dealable> hand1 = player1.getHand();
    ArrayList<Dealable> hand2 = player2.getHand();
    assertEquals(hand2, scorer.compare(hand1, hand2));
  }
}
