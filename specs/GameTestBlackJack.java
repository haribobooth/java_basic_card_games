import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import decks.*;
import players.*;
import rules.*;
import games.*;

public class GameTestBlackJack{

  Playable game;
  Winnable blackjack;
  AbleToPlay player1;
  AbleToPlay player2;
  AbleToPlay player3;

  @Before
  public void before(){
    game = new Game();
    player1 = new Player();
    player2 = new Player();
    player3 = new Player();
    blackjack = new BlackJack();

    game.addPlayer(player1);
    game.addPlayer(player2);
    game.addPlayer(player3);
    game.setRules(blackjack);
  }

  @Test
  public void canPlayRound(){
    game.setup();
    game.playRound();
    assertEquals(player1, blackjack.getWinner());
  }

  @Test
  public void canPlayGame(){
    game.setup();
    assertEquals(player1, game.playGame());
  }

}
