import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import cards.*;
import enums.*;
import decks.*;
import players.*;

public class DeckTest{

  AbleToDeal deck;
  Dealable card;
  AbleToPlay player;

  @Before
  public void before(){
    deck = new Deck();
    card = new Card(Suit.SPADE, Value.ACE);
    player = new Player();
  }

  @Test
  public void startsWithNoCards(){
    assertEquals(0, deck.cardCount());
  }

  @Test
  public void canAddCards(){
    deck.addCard(card);
    assertEquals(card, deck.getTopCard());
    assertEquals(1, deck.cardCount());
  }

  @Test
  public void canRemoveCard(){
    deck.addCard(card);
    deck.removeCard(card);
    assertEquals(0, deck.cardCount());
  }

  @Test
  public void canDealCard(){
    deck.addCard(card);
    deck.addCard(card);
    deck.dealCard(player);

    assertEquals(1, deck.cardCount());
    assertEquals(1, player.cardCount());
  }
}
