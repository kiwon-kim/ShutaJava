import java.util.ArrayList;

public class Player {
    public Player(int id) {
        this(id, Constant.SEED_MONEY);
    }

    public Player(int id, int money) {
        this.money = money;
        this.id = id;
    }

    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    private int id;

    public int getId() {
        return id;
    }

    private int cardScore;

    public int getCardScore() {
        return cardScore;
    }

    private ArrayList<Card> cards = new ArrayList<>();

    public void takeCard(Card card) {
        cards.add(card);
    }

    public void calculateCardScore(CardScoreCalculator calculator) {
        cardScore = calculator.calculate(cards);
    }

    public void prepareRound(){
        cards.clear();
        cardScore = 0;
    }

    @Override
    public String toString() {
        return String.format("Player %d has %d won, (%s, %s) = %d", id, money, cards.get(0), cards.get(1), cardScore);
    }
}
