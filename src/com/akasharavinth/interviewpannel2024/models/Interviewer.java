package com.akasharavinth.interviewpannel2024.models;

import com.akasharavinth.interviewpannel2024.datalayer.DataManagement;

import java.util.ArrayList;

public class Interviewer {
    private DataManagement dataManagement;
    private String interviewerName;
    private static int id =0;
    private int interviewerId;
    private String interviewerPassword;
    private String interviewerEmailId;
    private boolean isInterviewerAvailable;
    private ArrayList<Canditates> allotedCanditates = new ArrayList<>();

    public String getInterviewerName() {
        return interviewerName;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        id++;
    }
    public void incrementId(){
        interviewerId++;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    public int getInterviewerId() {
        return interviewerId;
    }

    public void setInterviewerId(int interviewerId) {
        this.interviewerId = interviewerId;
    }

    public String getInterviewerPassword() {
        return interviewerPassword;
    }

    public void setInterviewerPassword(String interviewerPassword) {
        this.interviewerPassword = interviewerPassword;
    }

    public String getInterviewerEmailId() {
        return interviewerEmailId;
    }

    public void setInterviewerEmailId(String interviewerEmailId) {
        this.interviewerEmailId = interviewerEmailId;
    }

    public boolean isInterviewerAvailable() {
        return isInterviewerAvailable;
    }

    public void setInterviewerAvailable(boolean interviewerAvailable) {
        isInterviewerAvailable = interviewerAvailable;
    }


    public ArrayList<Canditates> getAllotedCanditates() {
        return allotedCanditates;
    }
    public void setAllotedCanditates(Canditates c) {
        allotedCanditates.add(c);
    }

    @Override
    public String toString() {
        return "Interviewer{" +
                "dataManagement=" + dataManagement +
                ", interviewerName='" + interviewerName + "\n" +
                ", interviewerPassword='" + interviewerPassword + "\n" +
                ", interviewerEmailId='" + interviewerEmailId + '\'' +
                ", isInterviewerAvailable=" + isInterviewerAvailable +
                ", canditatesId=" + allotedCanditates +
                '}';
    }

    public void showAllotedCanditates(){
        for (Canditates c : allotedCanditates){
            System.out.println(c.getCanditateId()+"  "+c.getCanditateScore() +" "+c.getCanditateName());
        }
    }
}
