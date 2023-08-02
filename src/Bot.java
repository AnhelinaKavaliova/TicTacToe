import java.util.ArrayList;
import java.util.Random;
import java.util.SortedMap;

public class Bot {
    public void BotMove(char [][] table, ArrayList<Integer> botPosition, ArrayList<Integer> playerPosition){
        Random rand = new Random();
        int botPlacement;
        do{
            botPlacement = rand.nextInt(9)+1;
        } while (playerPosition.contains(botPlacement) || botPosition.contains(botPlacement) );
        System.out.println("Bot: ");
        PrintTable.fillTable(table, botPlacement, "bot");
        botPosition.add(botPlacement);
    }
}
