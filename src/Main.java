import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // 선수 입장
        ArrayList<Player> players = new ArrayList<Player>(Constant.PLAYER_COUNT);
        for (int i = 0; i < Constant.PLAYER_COUNT; i++)
            players.add(new Player());

        int round = 0;

        while (true) {
            // 라운드 준비
            Dealer dealer = new Dealer();
            dealer.prepareRound();

            // 학교를 간다
            int groundMoney = 0;
            for (Player player : players){
                player.setMoney(player.getMoney() - Constant.BET_MONEY);
                groundMoney += Constant.BET_MONEY;
            }

            // 카드를 나눠준다.
            for (Player player : players) {
                for (int i = 0; i < 2; i++) {
                    Card card = dealer.drawCard();
                    player.takeCard(card);
                }
            }
        }


    }
}
