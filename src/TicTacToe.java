import java.util.ArrayList;

public class TicTacToe {
    public static void main(String[] args) {
        char [][] table = {{' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '}};

        ArrayList<Integer> playerPosition = new ArrayList<Integer>();
        ArrayList<Integer> botPosition = new ArrayList<Integer>();
        boolean check = true;
        Player player = new Player();
        PrintTable.printTable(table);
        Bot bot = new Bot();
        Winner win = new Winner();

        while (check == true){
            player.playersMove(table, playerPosition, botPosition);
            PrintTable.printTable(table);
            bot.BotMove(table, botPosition, playerPosition);
            PrintTable.printTable(table);
            check = win.checkWinner(playerPosition, botPosition);
        }

    }
}
