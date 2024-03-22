package com.akasharavinth.interviewpannel2024.models;

import com.akasharavinth.interviewpannel2024.datalayer.DataManagement;

import java.util.ArrayList;
import java.util.List;

public class Interviewer {
    private DataManagement dataManagement;
    private String interviewerName;
    private static int interviewerId;
    private String interviewerPassword;
    private String interviewerEmailId;
    private boolean isInterviewerAvailable;
    private ArrayList<Integer> canditatesId;

    public String getInterviewerName() {
        return interviewerName;
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

    public void insertIdNumber(int n){
        canditatesId.add(n);
    }
    public ArrayList<Integer> getInsertCanditates(){
        return canditatesId;
    }

    public void setInterviewerAvailable(boolean interviewerAvailable) {
        isInterviewerAvailable = interviewerAvailable;
    }

//    public ArrayList<Integer> getCanditatesId() {
//        return canditatesId;
//    }
//
//    public void setCanditatesId(ArrayList<Integer> canditatesId) {
//        this.canditatesId = canditatesId;
//    }
//
}
