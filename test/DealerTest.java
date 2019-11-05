import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DealerTest {

    @Test
    void 광이_3장_들어있어야_함() {
        Dealer.getInstance().prepareRound();

        ArrayList<Card> cards = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            cards.add(Dealer.getInstance().drawCard());
        }

        long kwangCount = cards.stream().filter(x -> x.isKwang()).count();

        assertEquals(3, kwangCount);
    }
}