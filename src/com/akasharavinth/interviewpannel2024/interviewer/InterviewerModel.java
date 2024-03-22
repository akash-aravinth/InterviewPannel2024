package com.akasharavinth.interviewpannel2024.interviewer;

import com.akasharavinth.interviewpannel2024.datalayer.DataManagement;
import com.akasharavinth.interviewpannel2024.makeinterview.MakeInterview;
import com.akasharavinth.interviewpannel2024.models.Interviewer;

public class InterviewerModel {

    private InterviewerView interviewerView;
    InterviewerModel(InterviewerView interviewerView){
        this.interviewerView = interviewerView;
    }

    public void giveInterviewerInfo(String interviewerName, String password, String interviewerEmailId) {
        Interviewer interviewer = new Interviewer();
        interviewer.setInterviewerId(interviewer.getId());
        interviewer.setInterviewerName(interviewerName);
        interviewer.setInterviewerPassword(password);
        interviewer.setInterviewerEmailId(interviewerEmailId);
        interviewer.setInterviewerAvailable(true);
        DataManagement.getInstance().addInterviewer(interviewer);
        interviewer.setId();
    }
}
