package purse.strategy;

import java.util.List;
import purse.Valuable;

public interface WithdrawStrategy {

    public List<Valuable> withdraw(Valuable amount, List<Valuable> money);

}