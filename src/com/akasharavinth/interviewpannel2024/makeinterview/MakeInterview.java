package com.akasharavinth.interviewpannel2024.makeinterview;

import com.akasharavinth.interviewpannel2024.datalayer.DataManagement;
import com.akasharavinth.interviewpannel2024.models.Canditates;
import com.akasharavinth.interviewpannel2024.models.Interviewer;

import java.util.ArrayList;
import java.util.List;

public class MakeInterview {
    public void makeInterView(){
        DataManagement.getInstance().colideInterview();
        Interviewer interviewer = new Interviewer();
        interviewer.showAllotedCanditates();
    }

}
