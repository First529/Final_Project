package purse;

public class NullValuable implements Valuable {

    @Override
    public double getValue() {
        return -1;
    }

    @Override
    public String getCurrency() {
        return "Not available in this currency";
    }


    @Override
    public int compareTo(Valuable o) {
        return 0;
    }
}
