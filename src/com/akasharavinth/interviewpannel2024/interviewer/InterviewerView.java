package com.akasharavinth.interviewpannel2024.interviewer;

import com.akasharavinth.interviewpannel2024.canditate.CanditateView;
import com.akasharavinth.interviewpannel2024.makeinterview.MakeInterview;

import java.util.Scanner;

public class InterviewerView {
    private InterviewerModel interviewerModel;
    public InterviewerView(){
        interviewerModel =  new InterviewerModel(this);
    }
    public void getInterviewerInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Interviewer Name : ");
        String interviewerName = scanner.next();
        System.out.println("Enter Interviewer password : ");
        String password = scanner.next();
        System.out.println("Enter Interviewer EmailId : ");
        String interviewerEmailId = scanner.next();
        interviewerModel.giveInterviewerInfo(interviewerName,password,interviewerEmailId);
        againAddChoice();
    }
    public void againAddChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do You Want Add Another Interviewer then \n" +
                "type Yes else type No ");
        String choice = scanner.next();
        if(choice.equalsIgnoreCase("Yes")){
            getInterviewerInfo();
        }else{
            MakeInterview makeInterview = new MakeInterview();
            makeInterview.makeInterview();
//            CanditateView canditateView = new CanditateView();
//            canditateView.gettingChoice();
        }
    }
}
