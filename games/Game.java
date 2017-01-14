package games;

import java.util.*;
import players.*;
import rules.*;

public class Game implements Playable{

  Winnable rules;
  ArrayList<AbleToPlay> players;
  AbleToPlay winner;

  public Game(){
    players = new ArrayList<AbleToPlay>();
  }

  public void setRules(Winnable rules){
    this.rules = rules;
  }

  public int playerCount(){
    return this.players.size();
  }

  public void addPlayer(AbleToPlay player){
    players.add(player);
  }

  public void setup(){
    for(AbleToPlay player : players){
      rules.setup(player);
    }
  }

  public void playRound(){
    for(AbleToPlay player : players){
      rules.playTurn(player);
    }
  }

  public AbleToPlay playGame(){
    while(rules.hasBeenWon() == false){
      playRound();
    }
    return rules.getWinner();
  }

}
