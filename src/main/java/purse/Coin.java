package purse;

public class Coin extends Money {

    /**
     * Initializing parameters.
     *
     * @param value
     * @param currency
     */
    public Coin(double value, String currency) {
        super(value, currency);
    }

    /**
     * Value and currency of coin.
     *
     * @return String in a specific format
     */
    public String toString() {
        if (this.getCurrency().equals("Ringgit"))
            return String.format("%.2f-%s coin", this.getValue() * 100, "Sen");
        else if (this.getCurrency().equals("Baht"))
            return String.format("%.2f-%s coin", this.getValue(), "Baht");
        else
            return String.format("%.2f-%s coin", this.getValue(), this.getCurrency());
    }

}