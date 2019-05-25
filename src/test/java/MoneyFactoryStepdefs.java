
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;
import purse.PartyCatalog;
import purse.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MoneyFactoryStepdefs {


    private Purse p;
    private MoneyFactory mf;

    @Before
    public void setup() {
        mf = MoneyFactory.getInstance();
        p = new Purse(10);
    }

    @Given("a purse with capacity (.+)")
    public void a_purse_with_capacity(int capacity) {
        Purse ps = new Purse(10);
    }

    @When("I insert a (.+) (.+) coin")
    public void i_insert_a_coin(int value, String curr) {
        p.insert(new Coin(value, curr));
    }

    @When("I insert a (.+) (.+) note with serial (.+)")
    public void i_insert_a_note(int value, String curr, int serial) {
        p.insert(new BankNote(value, curr, serial));
    }

    @Then("capacity should be (.+)")
    public void capacity_should_be(int capacity) {
        assertEquals(capacity, p.getCapacity() - p.count());
    }
















}


