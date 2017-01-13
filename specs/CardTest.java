import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import cards.*;
import enums.*;

public class CardTest{

  Card card;

  @Before
  public void before(){
    card = new Card(Suit.SPADE, Value.ACE);
  }

  @Test
  public void canGetSuit(){
    assertEquals(Suit.SPADE, card.getSuit());
  }

  @Test
  public void canGetValue(){
    assertEquals(Value.ACE, card.getValue());
  }

  @Test
  public void canGetSummary(){
    assertEquals("ACE of SPADES", card.getSummary());
  }

}
