package com.akasharavinth.interviewpannel2024.makeinterview;

import com.akasharavinth.interviewpannel2024.canditate.CanditateView;
import com.akasharavinth.interviewpannel2024.datalayer.DataManagement;
import com.akasharavinth.interviewpannel2024.models.Canditates;
import com.akasharavinth.interviewpannel2024.models.Interviewer;

import java.util.ArrayList;
import java.util.List;

public class MakeInterview {
    public void makeInterView(){
        DataManagement.getInstance().colideInterview();
        DataManagement.getInstance().showCanditate(DataManagement.getInstance().getCanditatesList());
        DataManagement.getInstance().showInterviwerList(DataManagement.getInstance().getInterviewerList());
        Interviewer interviewer = new Interviewer();
        interviewer.showAllotedCanditates();
        CanditateView canditateView = new CanditateView();
        canditateView.gettingChoice();
    }

}
