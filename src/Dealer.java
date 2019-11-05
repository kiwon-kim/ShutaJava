import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private static List<Integer> kwangNumbers = List.of(1, 3, 8);

    private ArrayList<Card> cards = new ArrayList<>();

    public Dealer() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                int no = i + 1;
                boolean kwang = kwangNumbers.contains(no) && j == 0;
                Card card = new Card(no, kwang);
                cards.add(card);
            }
        }
    }

    public Card drawCard() {
        return null;
    }

    public void prepareRound() {

    }
}
