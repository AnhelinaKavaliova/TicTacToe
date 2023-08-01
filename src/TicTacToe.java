public class TicTacToe {
    public static void main(String[] args) {
        char [][] table = {{' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '}};
        for(char[] row : table){
            for(char col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
