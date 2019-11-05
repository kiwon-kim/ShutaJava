import java.util.ArrayList;

public class BasicCardScoreCalculator implements CardScoreCalculator {
    @Override
    public int calculate(ArrayList<Card> cards) {
        if (cards.get(0).isKwang() && cards.get(1).isKwang())
            return 200;
        else if (cards.get(0).getNo() == cards.get(1).getNo())
            return cards.get(0).getNo() * 10;
        else
            return  (cards.get(0).getNo() + cards.get(1).getNo()) % 10;
    }
}
