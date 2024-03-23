package com.akasharavinth.interviewpannel2024.datalayer;

import com.akasharavinth.interviewpannel2024.models.Canditates;
import com.akasharavinth.interviewpannel2024.models.Interviewer;

import javax.xml.crypto.Data;
import java.sql.Array;
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
    public void showAllCanditates() {
        for (Canditates c : canditatesList) {
            showCanditates(c);
        }
    }

    public void showAllInterviewer() {
        for (Interviewer i : interviewerList) {
            showInterviewer(i);
        }
    }

    public void show(){

    }

    //show single canditate and interviewer
    public void showCanditates(Canditates c) {
        System.out.println("Canditate name : " + c.getCanditateName() + "\n" +
                "Canditate Id : " + c.getCanditateId() + "\n" +
                "Canditate PhoneNo : " + c.getCanditatePhoneNo() + "\n" +
                "CanditateEmailId : " + c.getCanditateEmailId() + "\n" +
                "CanditateAddrress : " + c.getCanditateAddress() + "" +
                "\n" + "Canditate Score : " + c.getCanditateScore() + "\n" +
                "CanditateInterViwer Name : " + c.getInterviewerName());
    }

    public void showInterviewer(Interviewer i) {
        System.out.println("Interviewer Name : " + i.getInterviewerName() + " " +
                "InterviewerPassword : " + i.getInterviewerEmailId() + " " + "\n " +
                "Interviewer Available : " + i.isInterviewerAvailable() + " "
        );
    }

    //show allotted Canditaes List
    public void colideInterview(){
        for (int i =0;i<canditatesList.size();i++){
            Canditates c = canditatesList.get(i);
            int temp = i%interviewerList.size();
            Interviewer interviewers = interviewerList.get(temp);
            interviewers.setAllotedCanditates(c);
        }
        for (Interviewer c : interviewerList){
            System.out.println("ji");
            c.showAllotedCanditates();
            c.getAllotedCanditates().size();
        }
        showAllCanditates();
        showAllInterviewer();
    }

}
