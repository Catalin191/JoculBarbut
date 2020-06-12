package JocBarbut;

import java.util.Scanner;

public class BarbutGame {

    public Player player1 = new Player();
    public Player player2 = new Player();

    public static void main(String[] args) {
        BarbutGame barbutGame = new BarbutGame();
        barbutGame.startGame();
    }

    public void startGame(){
        System.out.println("Player 1 ready?");
        Scanner scanner = new Scanner(System.in);
        String player1Input = scanner.nextLine();
        if (player1Input.equals("yes".toLowerCase())) {
            player1.rollDices();
            System.out.println("Player 1 rolled " + player1.getDicesResult());
        }else {
            startGame();
        }

        System.out.println("Player 2 ready?");
        String player2Input = scanner.nextLine();
        if (player2Input.equals("yes".toLowerCase())){
            player2.rollDices();
            System.out.println("Player 2 rolled " + player2.getDicesResult());
        } else {
            startGame();
        }
        checkWinner(player1,player2);
    }

    private void checkWinner(Player player1, Player player2){
        if (player1.getDicesResult() == player2.getDicesResult()){
            System.out.println("Is a draw!");
        } else if (player1.getDicesResult() > player2.getDicesResult()){
            System.out.println("Player 1 wins!");
        } else if (player1.getDicesResult() < player2.getDicesResult()){
            System.out.println("Player 2 wins!");
        }
    }
}
