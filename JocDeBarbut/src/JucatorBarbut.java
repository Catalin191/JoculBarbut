import java.util.Random;

public class JucatorBarbut {

    private Zar dice1 = new Zar();
    private Zar dice2 = new Zar();
    private int diceResult = rollDice();

    public JucatorBarbut() {

    }
    public int randomDice(){
        int max = 5;
        int min = 0;
        int range = max - min + 1;
        int rand = 0;
        for (int i = 0; i < 1; i++){
            rand = (int)(Math.random() * range) + min;

        }
        return rand;
    }


    public int rollDice(){
       int dice1Result = getDice1().getValues(randomDice());
       int dice2Result = getDice2().getValues(randomDice());

        return dice1Result + dice2Result;
    }

    public Zar getDice1() {
        return dice1;
    }

    public void setDice1(Zar dice1) {
        this.dice1 = dice1;
    }

    public Zar getDice2() {
        return dice2;
    }

    public void setDice2(Zar dice2) {
        this.dice2 = dice2;
    }

    public int getDiceResult() {
        return diceResult;
    }

    public void setDiceResult(int diceResult) {
        this.diceResult = diceResult;
    }
}
