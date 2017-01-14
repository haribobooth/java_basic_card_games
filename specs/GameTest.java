import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import cards.*;
import enums.*;
import decks.*;
import players.*;
import rules.*;
import games.*;

public class GameTest{

  Playable game;
  Winnable highestCard;
  AbleToPlay player1;
  AbleToPlay player2;
  AbleToPlay player3;

  @Before
  public void before(){
    game = new Game();
    player1 = new Player();
    player2 = new Player();
    player3 = new Player();
    highestCard = new HighestCard();

    game.addPlayer(player1);
    game.addPlayer(player2);
    game.addPlayer(player3);
    game.setRules(highestCard);
  }

  @Test
  public void startsWithNoPlayers(){
    game = new Game();
    assertEquals(0, game.playerCount());
  }

  @Test
  public void canAddPlayers(){
    game = new Game();
    game.addPlayer(player1);
    game.addPlayer(player2);
    assertEquals(2, game.playerCount());
  }

  @Test
  public void canSetupPlayers(){
    game.setup();
    assertEquals(1, player1.cardCount());
    assertEquals(1, player2.cardCount());
    assertEquals(1, player3.cardCount());
    assertEquals(49, highestCard.getDeck().cardCount());
  }

  @Test
  public void canPlayRound(){
    game.setup();
    game.playRound();
    assertEquals(player1, highestCard.getWinner());
  }

  @Test
  public void canPlayGame(){
    game.setup();
    assertEquals(player1, game.playGame());
  }

}
