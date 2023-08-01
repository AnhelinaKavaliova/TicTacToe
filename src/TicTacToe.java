public class TicTacToe {
    public static void main(String[] args) {
        char [][] table = {{' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '}};

        PrintTable.printTable(table);
        Player player = new Player();
        player.playersMove(table);
        PrintTable.printTable(table);
        Bot bot = new Bot();
        bot.BotMove(table);
        PrintTable.printTable(table);

    }
}
