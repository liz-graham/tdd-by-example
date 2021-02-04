package guru.springframework;

public class Dollar extends Money {

    public Dollar(int amount) {
        super();
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
