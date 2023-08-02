import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Winner {
    public static boolean checkWinner(ArrayList<Integer> playerPosition, ArrayList<Integer> botPosition){
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List leftCross = Arrays.asList(1, 5, 9);
        List rightCross = Arrays.asList(7, 5, 3);

        List<List> winningCond = new ArrayList<List>();
        winningCond.add(topRow);
        winningCond.add(midRow);
        winningCond.add(botRow);
        winningCond.add(leftCol);
        winningCond.add(midCol);
        winningCond.add(rightCol);
        winningCond.add(leftCross);
        winningCond.add(rightCross);

        for(List l:winningCond){
            if(playerPosition.containsAll(l)){
                System.out.println("Player is winner!");
                return false;
            } else if(botPosition.containsAll(l)){
                System.out.println("Bot is winner!");
                return false;
            } else if(playerPosition.size() + botPosition.size() == 9) {
                System.out.println("Nobody won.");
                return false;
            }
        }
        return true;
    }
}
