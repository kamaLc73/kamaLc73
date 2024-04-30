package p1;

import java.util.ArrayList;


public class ElectionResult {
	
	private ArrayList<CandidateResult> candidatesResultsList ;
	private int nullVotes ;
	private double voteTurnOut ;
	
	
	public ElectionResult(ArrayList<CandidateResult> candidatesResults, double voteTurnOut) {
		this.candidatesResultsList = candidatesResults;
		this.voteTurnOut = voteTurnOut;
	}

	public void addVote(String voteFor) {
        boolean voteAdded = false;
        for (CandidateResult c : candidatesResultsList) {
            if (voteFor.equals(c.getCandidate().getNamePublic())) {
                  c.addVote();
                voteAdded = true;
                break;
            }
        }
        if (!voteAdded) {
        	this.nullVotes ++ ;
        }
    }

	public void print() {
		System.out.println("Résultats de l'élection:");
        for (CandidateResult c : candidatesResultsList) {
            System.out.println(c.getCandidate().getNamePublic() + " : " + c.getVoteCount() + " votes");
        }
        System.out.println("Votes nuls: " + nullVotes);
        System.out.println("Taux de participation: " + (voteTurnOut * 100) + "%");
    }
	
	public int expressVotes() {
        int expressVoteCount = 0;
        for (CandidateResult c : candidatesResultsList) {
            expressVoteCount += c.getVoteCount();
        }
        return expressVoteCount;
    }
	
	public ArrayList<CandidateResult> getCandidatesResultsList() {
		return candidatesResultsList;
	}

	public void setCandidatesResultsList(ArrayList<CandidateResult> candidatesResultsList) {
		this.candidatesResultsList = candidatesResultsList;
	}

	public int getNullVotes() {
		return nullVotes;
	}

	public void setNullVotes(int nullVotes) {
		this.nullVotes = nullVotes;
	}

	public double getVoteTurnOut() {
		return voteTurnOut;
	}

	public void setVoteTurnOut(double voteTurnOut) {
		this.voteTurnOut = voteTurnOut;
	}
	
	
	
	
	
	
	
	
	
	
    
	
	
	
	
	
	
	
	
	
	
	
	
	
}
