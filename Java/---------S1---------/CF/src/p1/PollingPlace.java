package p1;

import java.util.ArrayList;

public class PollingPlace {
	
	private ArrayList<Citizen> registeredVoters, participatingVoters ;
	private ArrayList<String> ballots ;
	
	
	public PollingPlace(ArrayList<Citizen> possibleVoters) {
		this.registeredVoters = new ArrayList<Citizen>();
        this.participatingVoters = new ArrayList<Citizen>();
        this.ballots = new ArrayList<String>(); 
        for (Citizen c : possibleVoters) {
            if (c.canVote()) {
                this.registeredVoters.add(c);
            }
        } 
	}
	
	public boolean acceptVoteFrom(Citizen c) {
		return c.canVote() && (!participatingVoters.contains(c) || registeredVoters.contains(c)) ;
	}
	
	public boolean castBallot(Citizen c, String b){
		if(acceptVoteFrom(c)) {
			ballots.add(b);
			participatingVoters.add(c) ;
			return true;
		}
		return false ;	
	}

	public double voterTurnOut() {
		if (registeredVoters.isEmpty()) {
            return 0.0;
        }
		return (double) participatingVoters.size() / registeredVoters.size();
	}
	
	public ElectionResult countTheVotes( ArrayList<CandidateResult> c) {
		ElectionResult electRes = new ElectionResult(c, voterTurnOut()) ;
		for (String b : ballots) {
            electRes.addVote(b);
        }
		return electRes ;
    } 

	
	
	
	
	
	
	
	
	
	
	
	
}
