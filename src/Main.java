import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        // 선수 입장
        ArrayList<Player> players = new ArrayList<Player>(Constant.PLAYER_COUNT);
        for (int i = 0; i < Constant.PLAYER_COUNT; i++)
            players.add(new Player(i + 1));

        int round = 0;

        while (true) {
            // 오링된 플레이어는제거
            players.removeIf(x -> x.getMoney() == 0);

            if (players.size() == 1)
                break;

            // 라운드 준비
            Dealer dealer = new Dealer();
            dealer.prepareRound();

            // 학교를 간다
            int groundMoney = 0;
            for (Player player : players) {
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

            // 승자를 찾는다.
            Player winner = findWinner(players);

            // 승자가 상금을 가진다.
            winner.setMoney(winner.getMoney() + groundMoney);

            // 결과를 출력한다.
            for (Player player : players)
                System.out.println(player);

            System.out.println();
        }

        System.out.println("The final winner is Player " + players.get(0).getId());
    }

    private static Player findWinner(ArrayList<Player> players) {
        return null;
    }
}
