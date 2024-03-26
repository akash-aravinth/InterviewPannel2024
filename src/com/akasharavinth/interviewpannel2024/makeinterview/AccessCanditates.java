package com.akasharavinth.interviewpannel2024.makeinterview;

import com.akasharavinth.interviewpannel2024.canditate.CanditateView;
import com.akasharavinth.interviewpannel2024.datalayer.DataManagement;
import com.akasharavinth.interviewpannel2024.models.Canditates;
import com.akasharavinth.interviewpannel2024.models.Interviewer;

import java.util.List;
import java.util.Scanner;

public class AccessCanditates {
    Scanner scanner = new Scanner(System.in);
    public void takeEvaluation(Interviewer i) {
        List<Canditates> canditatesList = i.getAllotedCanditates();
        for (Canditates c : canditatesList){
            System.out.println("How About The "+c.getCanditateName()+" Performence and give a ratings within 10 ");
            int ratings = scanner.nextInt();
            if(ratings < 0 || ratings > 10){
                System.out.println("Please Give Ratings Within 10");
                takeEvaluation(i);
            }
            c.setCanditateScore(ratings);
        }
        CanditateView canditateView = new CanditateView();
        canditateView.gettingChoice();
    }
    public void completeEvaluation(){
        System.out.printf("%20s %20s %20s %20s","Canditate Id","Canditate Name ","Canditate EmailId","Canditate Score");
        System.out.println();
        for(Canditates c : DataManagement.getInstance().getCanditatesList()){
            if (c.getCanditateScore() > 7){
                System.out.format("%20s %20s %20s %20s",c.getCanditateId(),c.getCanditateName(),c.getCanditateEmailId(),c.getCanditateScore());
                System.out.println();
            }
        }
    }
}
