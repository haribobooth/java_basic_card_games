import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import cards.*;
import enums.*;
import decks.*;
import players.*;

public class PlayerTest{

  AbleToPlay player;
  Dealable card;

  @Before
  public void before(){
    player = new Player();
    card = new Card(Suit.SPADE, Value.ACE);
  }

  @Test
  public void canAddCard(){
    player.addCard(card);
    assertEquals(1, player.cardCount());
  }

}
