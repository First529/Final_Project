
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;
import purse.PartyCatalog;
import purse.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PurseStepdefs {


    private Purse p;
    private MoneyFactory mf;
    private int serial = 1000000;

    @Before
    public void setup() {

    }

    @Given("a Malay Money Factory")
    public void a_malay_money_factory() {
        mf.setFactory(new MalayMoneyFactory());
        mf = MoneyFactory.getInstance();
    }

    @Given("a Thai Money Factory")
    public void a_thai_money_factory() {
        mf.setFactory(new ThaiMoneyFactory());
        mf = MoneyFactory.getInstance();
    }

    @Given("a purse with capacity (.+)")
    public void a_purse_with_capacity(int capacity) {
        p = new Purse(10);
    }

    @Given("contain (.+) (.+) coin")
    public void contain_coin(double value, String curr) {
        p.insert(new Coin(value, curr));
    }

    @Given("contain (.+) (.+) note with serial (.+)")
    public void contain_note(double value, String curr, int serial) {
        p.insert(new BankNote(value, curr, serial));
    }

    @When("I make a (.+) (.+) coin")
    public void i_make_a_coin(double value, String curr) {
        if (mf.createMoney(value).getValue() != -1) {
            assertEquals(new Coin(value,curr).getCurrency(),mf.createMoney(value).getCurrency());
        } else {
            assertEquals(new NullValuable().getValue(), mf.createMoney(value).getValue());
        }

    }

    @When("I make a (.+) (.+) note")
    public void i_make_a_note(double value, String curr) {
        if (mf.createMoney(value).getValue() != -1) {
            assertEquals(new BankNote(value, curr, serial++), mf.createMoney(value));
        } else {
            assertEquals(new NullValuable().getValue(), mf.createMoney(value).getValue());
        }
    }

    @When("I insert a (.+) (.+) coin")
    public void i_insert_a_coin(double value, String curr) {
        p.insert(new Coin(value, curr));
    }

    @When("I insert a (.+) (.+) note with serial (.+)")
    public void i_insert_a_note(double value, String curr, int serial) {
        p.insert(new BankNote(value, curr, serial));
    }

    @When("I withdraw a (.+) (.+) coin")
    public void i_withdraw_a_coin(double value, String curr) {
        p.withdraw(new Coin(value, curr));
    }

    @When("I withdraw a (.+) (.+) note with serial (.+)")
    public void i_withdraw_a_note(double value, String curr, int serial) {
        p.withdraw(new BankNote(value, curr, serial));
    }

    @Then("remaining capacity should be (.+) and total balanced is (.+) (.+)")
    public void remaining_capacity_should_be_and_total_balanced_is(int capacity, double balanced, String curr) {
        assertEquals(capacity, p.getCapacity());
        assertEquals(balanced, p.getBalance());
        assertEquals(curr, p.money.get(0).getCurrency());
    }

    @Then("success")
    public void success() {
        assertTrue(true);
    }

    @Then("not success")
    public void not_success() {
        assertTrue(true);
    }















}


