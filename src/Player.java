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

    public void takeCard(Card card) {

    }
}
