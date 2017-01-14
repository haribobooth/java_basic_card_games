import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import cards.*;
import enums.*;
import decks.*;
import players.*;
import rules.*;

public class HighestCardTest{

  AbleToPlay player1;
  AbleToPlay player2;
  Winnable rules;

  @Before
  public void before(){
    player1 = new Player();
    player2 = new Player();
    rules = new HighestCard();
    // when running tests please comment out deck.shuffle() in HighestCard.java
  }

  @Test
  public void startsWith52Cards(){
    assertEquals(52, rules.getDeck().cardCount());
  }

  @Test
  public void canSetupPlayer(){
    rules.setup(player1);
    assertEquals(1, player1.cardCount());
  }

  @Test
  public void dealsCardsFromDeck(){
    rules.setup(player1);
    assertEquals(51, rules.getDeck().cardCount());
  }

  @Test
  public void canSetupMultiplePlayers(){
    rules.setup(player1);
    rules.setup(player2);
    assertEquals(50, rules.getDeck().cardCount());
    assertEquals(1, player1.cardCount());
    assertEquals(1, player2.cardCount());
  }

}
