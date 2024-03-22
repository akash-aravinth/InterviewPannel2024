package com.akasharavinth.interviewpannel2024.makeinterview;

import com.akasharavinth.interviewpannel2024.datalayer.DataManagement;
import com.akasharavinth.interviewpannel2024.models.Canditates;
import com.akasharavinth.interviewpannel2024.models.Interviewer;

import java.util.List;

public class MakeInterview {
    public void makeInterView(){
        DataManagement.getInstance().showAllCanditates();
        System.out.println("\n \n \n");
        DataManagement.getInstance().showAllInterviewer();
    }
    public void makeInterview(){
        List<Canditates> canditatesList = DataManagement.getInstance().getCanditatesList();
        List<Interviewer> interviewerList = DataManagement.getInstance().getInterviewerList();
        Interviewer interviewer = new Interviewer();
        for (int i = 0;i<canditatesList.size();i++){
            int temp = i%interviewerList.size();
            Interviewer list = DataManagement.getInstance().getInterviewerIdList(temp);
            list.insertIdNumber(temp);
        }
    }
}
