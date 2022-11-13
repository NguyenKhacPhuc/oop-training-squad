/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Batch {

    private String batchName;
    private String batchDate;
    private Interviewer interviewer;
    private Candidate[] candidate;

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

    public Interviewer getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(Interviewer interviewer) {
        this.interviewer = interviewer;
    }

    public Candidate[] getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate[] candidate) {
        this.candidate = candidate;
    }

    public Batch(String batchName, String batchDate) {
        this.batchName = batchName;
        this.batchDate = batchDate;

    }
}
