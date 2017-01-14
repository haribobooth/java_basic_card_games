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

  @Test
  public void canPlayTurnAndDecideWinner(){
    rules.setup(player1);
    rules.setup(player2);
    rules.playTurn(player1);
    rules.playTurn(player2);

    assertEquals(player1, rules.getWinner());
  }

}
