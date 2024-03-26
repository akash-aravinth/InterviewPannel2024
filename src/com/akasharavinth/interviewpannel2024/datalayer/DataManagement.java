package com.akasharavinth.interviewpannel2024.datalayer;

import com.akasharavinth.interviewpannel2024.models.Canditates;
import com.akasharavinth.interviewpannel2024.models.Interviewer;


import java.util.ArrayList;
import java.util.List;

public class DataManagement {
    public static DataManagement dataManagement;


    public static DataManagement getInstance() {
        if (dataManagement == null)
            dataManagement = new DataManagement();
        return dataManagement;
    }

    List<Canditates> canditatesList = new ArrayList<>();
    List<Interviewer> interviewerList = new ArrayList<>();

    public List<Canditates> getCanditatesList() {
        return canditatesList;
    }

    public List<Interviewer> getInterviewerList() {
        return interviewerList;
    }

    //adding canditate and Interviewer
    public void addCanditate(Canditates canditates) {
        canditatesList.add(canditates);
    }

    public void addInterviewer(Interviewer interviewer) {
        interviewerList.add(interviewer);
    }

    //show All Interviewer and Canditates

    public void showCanditate(List<Canditates> canditatesList){
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("%-20s %-20s %-40s %-10s","Canditate Id","Canditate Name ","Canditate EmailId","Canditate Score");
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println();
        for(Canditates c : canditatesList){
            System.out.format("%-20s  %-20s  %-40s  %-10s  ",c.getCanditateId(),c.getCanditateName(),c.getCanditateEmailId(),c.getCanditateScore());
            System.out.println();
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------");
    }

    public void showInterviwerList(List<Interviewer> interviewerList){
        System.out.printf("%-20s %-20s %-40s %-10s","Interviewer Id","Interviewer Name","Interviewer Available","Interviewr EmailId");
        System.out.println();
        for (Interviewer i : interviewerList ){
            System.out.format("%-20s  %-20s  %-40s  %-10s ",i.getInterviewerId(),i.getInterviewerName(),i.isInterviewerAvailable(),i.getInterviewerEmailId());
            System.out.println();
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------");
    }


    //show allotted Canditaes List
    public void colideInterview(){
        for (int i =0;i<canditatesList.size();i++){
            Canditates c = canditatesList.get(i);
            int temp = i%interviewerList.size();
            Interviewer interviewers = interviewerList.get(temp);
            interviewers.setAllotedCanditates(c,interviewers);
        }
    }

}
