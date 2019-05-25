package purse;
import java.util.ArrayList;

public class Party {

    private int voteCount;
    private int constituencyBasis;
    private String name;

    public Party(String name ,int voteCount, int constituencyBasis) {
        this.voteCount = voteCount;
        this.constituencyBasis = constituencyBasis;
        this.name = name;
    }

    public int getVoteCount() {
        return this.voteCount;
    }

    public int getConstituencyBasis() {
        return this.constituencyBasis;
    }

    public String getName() {
        return this.name;
    }






}
