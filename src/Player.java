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

    public void calculateCardScore() {
        if (cards.get(0).isKwang() && cards.get(1).isKwang())
            cardScore = 200;
        else if (cards.get(0).getNo() == cards.get(1).getNo())
            cardScore = cards.get(0).getNo() * 10;
        else
            cardScore = (cards.get(0).getNo() + cards.get(1).getNo()) % 10;
    }

    public void prepareRound(){
        cards.clear();
        cardScore = 0;
    }
}
