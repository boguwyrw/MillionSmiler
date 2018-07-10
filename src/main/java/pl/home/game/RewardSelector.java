package pl.home.game;

public class RewardSelector {

    public void selector (int answerCounter){
        if ((answerCounter >= 5) && (answerCounter < 10)){
            System.out.println("Gratulacje, wygrałeś gwarantowane 1000 :-)");
        }
        if ((answerCounter >= 10) && (answerCounter < 15)){
            System.out.println("Gratulacje, wygrałeś gwarantowane 32000 :-)");
        }
        if (answerCounter == 15){
            System.out.println("Gratulacje. Jesteś posiadaczem 1000000 :-)");
        }
    }

}
