import java.util.ArrayList;

public class StupidCardScoreCalculator implements CardScoreCalculator {
    @Override
    public int calculate(ArrayList<Card> cards) {
        return cards.get(0).getNo() + cards.get(1).getNo();
    }
}
