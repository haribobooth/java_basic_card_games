import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import cards.*;
import enums.*;
import decks.*;
import players.*;
import enums.*;
import deck_setup.*;

public class DeckSetupTest{

  DeckSetup setup;
  AbleToDeal deck;

  @Test
  public void canCreateStandard52(){
    deck = DeckSetup.standard52();
    assertEquals(52, deck.cardCount());
  }

  @Test
  public void canCreateDoubleDeck(){
    setup = new DeckSetup(2);
    setup.setRange(1, 13);
    deck = setup.buildDeck();
    assertEquals(104, deck.cardCount());
  }

}
