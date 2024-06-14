package p1;

public class CandidateResult {
	private Citizen candidate ;
	private int voteCount = 0 ;
	
	
	public CandidateResult(Citizen candidate) {
		this.candidate = candidate;
	}
	public int getVoteCount() {
		return voteCount;
	} 
	
	public Citizen getCandidate() {
		return candidate;
	}

	public void addVote() {
		voteCount ++ ;
	}



	


}
