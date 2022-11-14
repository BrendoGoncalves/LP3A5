package jokenpo;

public class Match {
    public String round(Player p1, Player p2){
        if(p1.getHand() == 1 && p2.getHand() == 1
        || p1.getHand() == 2 && p2.getHand() == 2
        || p1.getHand() == 3 && p2.getHand() == 3){
            return "Draw";
        }else if(p1.getHand() == 1 && p2.getHand() == 3
        || p1.getHand() == 2 && p2.getHand() == 1
        || p1.getHand() == 3 && p2.getHand() == 2){
            return p1.getName() +" Won";
        }else if(p2.getHand() == 1 && p1.getHand() == 3
                || p2.getHand() == 2 && p1.getHand() == 1
                || p2.getHand() == 3 && p1.getHand() == 2){
            return p2.getName() +" Won";
        }else{
            return "Invalid Option";
        }
    }
}
