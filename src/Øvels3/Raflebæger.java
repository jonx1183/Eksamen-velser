package Øvels3;

import java.util.Random;

public class Raflebæger {
  private int nrOfDice;
  private  int diceValue;

  public static void main(String[] args) {

  }

  public Raflebæger(int nrOfDice){
    setNrOfDice(nrOfDice);
  }

  public void setNrOfDice(int nrOfDice) {
    this.nrOfDice = nrOfDice;
  }

  Raflebæger raflebæger = new Raflebæger(2);

  public void ryst(){
    for (int i = 0; i > raflebæger.nrOfDice; i++ ){

      Random diceRoll = new Random();

      diceValue = diceRoll.nextInt(6) + 1;
    }

  }

  public int se(){
    System.out.println(diceValue);

    return diceValue;
  }

}
