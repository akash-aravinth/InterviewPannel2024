package com.akasharavinth.interviewpannel2024.datalayer;

import com.akasharavinth.interviewpannel2024.models.Canditates;
import com.akasharavinth.interviewpannel2024.models.Interviewer;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class DataManagement {
    public static DataManagement dataManagement;
    public static DataManagement getInstance(){
        if (dataManagement == null)
            dataManagement = new DataManagement();
        return dataManagement;
    }

    List<Canditates> canditatesList = new ArrayList<>();
    List<Interviewer> interviewerList = new ArrayList<>();


    public void addCanditate(Canditates canditates) {
        canditatesList.add(canditates);
    }

    public void showAllCanditates(){
        for (Canditates c : canditatesList){
            showCanditates(c);
        }
    }
    public void showCanditates(Canditates c){
        System.out.println("Canditate name : "+c.getCanditateName()+"\n" +
                "Canditate Id : " + c.getCanditateName() + "\n" +
                "Canditate PhoneNo : " + c.getCanditatePhoneNo()+"\n" +
                "CanditateEmailId : "+c.getCanditateEmailId()+"\n" +
                "CanditateAddrress : "+c.getCanditateAddress()+"" +
                "\n"+"Canditate Score : "+ c.getCanditateScore()+"\n"+
                "CanditateInterViwer Name "+c.getInterviewerName());
    }

}
