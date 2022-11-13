package PracticalTime_1311;

public class Batch {
	private String batchName;
	private String batchDate;

	private Interviewer interviewer;
	private Candidate candidates;
	
	public Batch() {
		
	}

	public Batch(String batchName, String batchDate) {
		this.batchName = batchName;
		this.batchDate = batchDate;
	}
	
	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBatchDate() {
		return batchDate;
	}

	public void setBatchDate(String batchDate) {
		this.batchDate = batchDate;
	}

}
