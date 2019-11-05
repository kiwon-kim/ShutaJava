import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {
    private static List<Integer> kwangNumbers = List.of(1, 3, 8);

    //region singleton
    private Dealer() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                int no = i + 1;
                boolean kwang = kwangNumbers.contains(no) && j == 0;
                Card card = new Card(no, kwang);
                cards.add(card);
            }
        }
    }

    private static Dealer instance;

    public static Dealer getInstance() {
        if (instance == null)
            instance = new Dealer();
        return instance;
    }
    //endregion

    private ArrayList<Card> cards = new ArrayList<>();

    private int index = 0;

    public Card drawCard() {
        return cards.get(index++);
    }

    public void prepareRound() {
        Collections.shuffle(cards);
        index = 0;
    }
}
