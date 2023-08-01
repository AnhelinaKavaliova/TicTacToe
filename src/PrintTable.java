public class PrintTable {
    public static void printTable(char [][] table){
        for(char[] row : table){
            for(char col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void fillTable(char [][] table, int position, String user){
        char symbol = 'O';
        if(user.equals("player")){
            symbol = 'X';
        }

        switch (position){
            case 1:
                table [0][0] = symbol;
                break;
            case 2:
                table [0][2] = symbol;
                break;
            case 3:
                table [0][4] = symbol;
                break;
            case 4:
                table [2][0] = symbol;
                break;
            case 5:
                table [2][2] = symbol;
                break;
            case 6:
                table [2][4] = symbol;
                break;
            case 7:
                table [4][0] = symbol;
                break;
            case 8:
                table [4][2] = symbol;
                break;
            case 9:
                table [4][4] = symbol;
                break;
        }
    }
}
