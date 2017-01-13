import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import cards.*;
import enums.*;
import decks.*;

public class DeckTest{

  AbleToDeal deck;
  Dealable card;

  @Before
  public void before(){
    deck = new Deck();
    card = new Card(Suit.SPADE, Value.ACE);
  }

  @Test
  public void startsWithNoCards(){
    assertEquals(0, deck.cardCount());
  }
}
