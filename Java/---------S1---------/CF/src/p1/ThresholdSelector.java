package p1;

public class ThresholdSelector implements CandidateSelector {
	
	private double threshold;
	
	public ThresholdSelector(double threshold) {
		this.threshold = threshold;
 	}
	
	@Override
	public boolean acceptCandidate(CandidateResult candidateResult) {
		return (double) candidateResult.getVoteCount() / candidateResult.getCandidate().getVoterId() >= threshold;
 	}
}