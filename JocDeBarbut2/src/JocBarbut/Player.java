package JocBarbut;

public class Player {

    private int dicesResult;
    private Zar dice1;
    private Zar dice2;

    public Player(){
        this.dice1 = new Zar();
        this.dice2 = new Zar();
    }

    public void rollDices(){
        int randomResult = (int) (Math.random() * (6));
        int dice1Result = dice1.getValues(randomResult);
        int dice2Result = dice2.getValues(randomResult);

        dicesResult = dice1Result + dice2Result;
    }

    public int getDicesResult() {
        return dicesResult;
    }

    public Zar getDice1() {
        return dice1;
    }

    public Zar getDice2() {
        return dice2;
    }
}
