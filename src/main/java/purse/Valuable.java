package purse;

public interface Valuable extends Comparable<Valuable> {

    /**
     * Get the value of this object.
     * @return value
     */
    public double getValue();

    /**
     * Get the currency of this object.
     * @return currency
     */
    public String getCurrency();

}