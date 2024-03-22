package com.akasharavinth.interviewpannel2024.canditate;

import com.akasharavinth.interviewpannel2024.interviewer.InterviewerView;
import com.akasharavinth.interviewpannel2024.login.InterviewerLoginView;
import com.akasharavinth.interviewpannel2024.login.LoginView;
import com.akasharavinth.interviewpannel2024.makeinterview.AccessCanditates;

import java.util.Scanner;

public class CanditateView {
    private CanditateModel canditateModel;
    public CanditateView(){
        canditateModel = new CanditateModel(this);
    }
    public void init(){
       gettingChoice();
    }

    public void gettingChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.add Canditate \n 2.add Interviewer \n 3.Interviewer Login" +
                "\n 4.Complete \n 5.Exit ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 :{
                getCanditateInfo();
                break;
            }
            case 2 :{
                InterviewerView interviewerView = new InterviewerView();
                interviewerView.getInterviewerInfo();
                break;
            }
            case 3 : {
                InterviewerLoginView interviewerLoginView = new InterviewerLoginView();
                interviewerLoginView.gettingLoginDetails();
                break;
            }
            case 4 : {
                AccessCanditates accessCanditates = new AccessCanditates();
                accessCanditates.completeEvaluation();
                break;
            }
            case 5 :{
                System.out.println("ThankYou");
                break;
            }
            default:{
                showAlert("Please Enter Valid Choice ");
                init();
                break;
            }
        }
    }
    public void showAlert(String alert){
        System.out.println(alert);
    }
    public void getCanditateInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Canditate Name : ");
        String canditateName = scanner.next();
        System.out.println("Enter Canditate Phone No :");
        long canditatePhoneNo = scanner.nextLong();
        System.out.println("Enter Canditate EmailId : ");
        String canditateEmailId = scanner.next();
        System.out.println("Enter Canditate Address : ");
        String canditateAddress = scanner.next();
        canditateModel.giveCanditateInfo(canditateName,canditatePhoneNo,canditateEmailId,canditateAddress);
        againAddChoice();
    }
    public void againAddChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do You Want Add Another Canditate then \n" +
                "type Yes else type No ");
        String choice = scanner.next();
        if(choice.equalsIgnoreCase("Yes")){
            getCanditateInfo();
        }else{
            gettingChoice();
        }
    }
}
