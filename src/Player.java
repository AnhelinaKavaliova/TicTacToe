import java.util.Scanner;
public class Player {
    public void playersMove(char [][] table){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your placement (1-9): ");
        int playerPlacement = n.nextInt();
        PrintTable.fillTable(table, playerPlacement, "player");
    }


}
