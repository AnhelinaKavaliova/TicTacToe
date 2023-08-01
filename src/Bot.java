import java.util.Random;

public class Bot {
    public void BotMove(char [][] table){
        Random rand = new Random();
        int botPlacement = rand.nextInt(9)+1;
        PrintTable.fillTable(table, botPlacement, "bot");
    }
}
