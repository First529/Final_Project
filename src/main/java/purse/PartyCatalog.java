package purse;
import java.util.ArrayList;
import java.util.List;

public class PartyCatalog {

    private List<Party> parties;

    public PartyCatalog() {
        parties = new ArrayList<>();
    }

    public void addParty(String name ,int voteCount, int constituencyBasis) {
        parties.add(new Party(name, voteCount, constituencyBasis));
    }

    public int getTotalVote() {
        int total = 0;
        for (int i = 0; i < parties.size(); i++) {
            total += parties.get(i).getVoteCount();
        }

        return total;
    }

    public int getVoteCount(String x) {
        int c = 0;
        for (int i = 0; i < parties.size(); i++) {
            if (x.equals(parties.get(i).getName())) {
                c = parties.get(i).getVoteCount();
            }
        }
        return c;
    }


    public int getConstituencyBasis(String x) {
        int c = 0;
        for (int i = 0; i < parties.size(); i++) {
            if (x.equals(parties.get(i).getName())) {
                c = parties.get(i).getConstituencyBasis();
            }
        }
        return c;
    }

    public int getNumberOfHR(int totalVoteCount) {
        return totalVoteCount / 500;
    }

    public double getPreliminaryNumberOfHR(int voteCount,int numberOfHR) {
        return voteCount / numberOfHR;
    }

    public double getPreliminaryNumberOfHRPartyList(double preliminary, double constituencyBasis) {
        if (preliminary - constituencyBasis < 0) return 0;
        return preliminary - constituencyBasis;
    }

}
