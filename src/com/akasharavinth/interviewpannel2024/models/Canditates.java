package com.akasharavinth.interviewpannel2024.models;

public class Canditates {

    private String canditateName;
    private static int id = 0;
    private int canditateId;
    private long canditatePhoneNo;
    private String canditateEmailId;
    private String canditateAddress;
    private int canditateScore;
    private String interviewerName;

    public int getId(){
        return id;
    }
    public void setId(){
        id++;
    }

    public String getCanditateName() {
        return canditateName;
    }

    public void setCanditateName(String canditateName) {
        this.canditateName = canditateName;
    }
    public int getCanditateId(){
        return canditateId;
    }

    public void incrementId(){
        canditateId++;
    }

    public void setCanditateId(int canditateId) {
        this.canditateId = canditateId;
    }

    public long getCanditatePhoneNo() {
        return canditatePhoneNo;
    }

    public void setCanditatePhoneNo(long canditatePhoneNo) {
        this.canditatePhoneNo = canditatePhoneNo;
    }

    public String getCanditateEmailId() {
        return canditateEmailId;
    }

    public void setCanditateEmailId(String canditateEmailId) {
        this.canditateEmailId = canditateEmailId;
    }

    public String getCanditateAddress() {
        return canditateAddress;
    }

    public void setCanditateAddress(String canditateAddress) {
        this.canditateAddress = canditateAddress;
    }

    public int getCanditateScore() {
        return canditateScore;
    }

    public void setCanditateScore(int canditateScore) {
        this.canditateScore = canditateScore;
    }

    public String getInterviewerName() {
        return interviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    @Override
    public String toString() {
        return "Canditates{" +
                "canditateName='" + canditateName + '\'' +
                ", canditatePhoneNo=" + canditatePhoneNo +
                ", canditateEmailId='" + canditateEmailId + '\'' +
                ", canditateAddress='" + canditateAddress + '\'' +
                ", canditateScore=" + canditateScore +
                ", interviewerName='" + interviewerName + '\'' +
                '}';
    }
}
