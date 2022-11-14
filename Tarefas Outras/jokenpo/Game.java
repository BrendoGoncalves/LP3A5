package jokenpo;

public class Game {
    public static void main(String[] args) {
        /* 1 - Rock
         * 2 - Paper
         * 3 - Scissors
         */
        Player p1 = new Player();
        Player p2 = new Player();

        p1.setName("João");
        p2.setName("Maria");

        p1.setHand(2);
        p2.setHand(3);

        Match m1 = new Match();
        System.out.println(m1.round(p1, p2));
    }
}
