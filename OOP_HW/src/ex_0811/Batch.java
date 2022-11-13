package ex_0811;

public class Batch {
    private String batchName;
    private String batchDate;
    private Interviewer interviewer;
    private Candidate[] candidates;

    public Batch(String batchName, String batchDate) {
        this.batchName = batchName;
        this.batchDate = batchDate;
    }

    public String getBatchName() {
        return batchName;
    }

    public boolean setBatchName(String batchName) {
        if (batchName != null) {
            this.batchName = batchName;
            return true;
        } else {
            return false;
        }
    }

    public String getBatchDate() {
        return batchDate;
    }

    public boolean setBatchDate(String batchDate) {
        if (batchDate != null) {
            this.batchName = batchDate;
            return true;
        } else {
            return false;
        }
    }

    public Interviewer getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(Interviewer interviewer) {
        this.interviewer = interviewer;
    }

    public Candidate[] getCandidates() {
        return candidates;
    }

    public void setCandidates(Candidate[] candidates) {
        this.candidates = candidates;
    }
}
