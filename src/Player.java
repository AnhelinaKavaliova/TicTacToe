import java.util.ArrayList;
import java.util.Scanner;
public class Player {
    public void playersMove(char [][] table, ArrayList<Integer> playerPosition, ArrayList<Integer> botPosition){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your placement (1-9): ");
        int playerPlacement = n.nextInt();
        while (playerPosition.contains(playerPlacement) || botPosition.contains(playerPlacement) ){
            System.out.println("This position is taken!");
            System.out.println("Enter your placement (1-9): ");
            playerPlacement = n.nextInt();
        }
        PrintTable.fillTable(table, playerPlacement, "player");
        playerPosition.add(playerPlacement);
    }


}
