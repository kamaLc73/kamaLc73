package p1;

public class AbsoluteMajoritySelector implements CandidateSelector {
	
	private int totalVotes;
	
	public AbsoluteMajoritySelector(int totalVotes) {
	    this.totalVotes = totalVotes;
	}
	
	@Override
	public boolean acceptCandidate(CandidateResult candidateResult) {
	    return candidateResult.getVoteCount() > totalVotes / 2;
	}
}