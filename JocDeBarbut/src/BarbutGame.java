import java.util.Scanner;

public class BarbutGame {

    private JucatorBarbut player1 = new JucatorBarbut();
    private JucatorBarbut player2 = new JucatorBarbut();

    public static void main(String[] args) {
        BarbutGame barbutGame = new BarbutGame();
        JucatorBarbut player1 = new JucatorBarbut();
        JucatorBarbut player2 = new JucatorBarbut();
        barbutGame.startGame();
        barbutGame.checkWinner(player1, player2);
    }


    public void startGame(){
        System.out.println("Player 1 ready ?");
        Scanner scanner = new Scanner(System.in);
        String answer1 = scanner.nextLine();
        if (answer1.equals("yes".toLowerCase())) {
            player1.rollDice();
            System.out.println("Player 1 rolled " + player1.rollDice());
        }
//        else {
//            System.out.println("Player 2 wins");
//        }

        System.out.println("Player 2 ready ?");
        String answer2 = scanner.nextLine();
        if (answer2.equals("yes".toLowerCase())){
            player2.rollDice();
            System.out.println("Player 2 rolled " + player1.rollDice());
        }
//        else {
//            System.out.println("Player 1 wins");
//        }
    }

    public void checkWinner(JucatorBarbut player1, JucatorBarbut player2){
        if (player1.getDiceResult() == player2.getDiceResult()){
            System.out.println("Is a draw");

        }else if (player1.getDiceResult() > player2.getDiceResult()){
            System.out.println("Player 1 wins");

        }else if (player1.getDiceResult() < player2.getDiceResult()) {
            System.out.println("Player 2 wins");
        }
    }
}
