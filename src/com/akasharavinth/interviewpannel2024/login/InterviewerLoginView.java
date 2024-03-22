package com.akasharavinth.interviewpannel2024.login;

import java.util.Scanner;

public class InterviewerLoginView {
    Scanner scanner = new Scanner(System.in);
    private InterviewerLoginModel interviewerLoginModel;
    public InterviewerLoginView(){
        interviewerLoginModel = new InterviewerLoginModel(this);
    }

    public void gettingLoginDetails(){
        System.out.println("Enter Interviewer UserName");
        String interviewerUserName = scanner.next();
        System.out.println("Enter Interviewer Password");
        String interviewerPassword = scanner.next();
        interviewerLoginModel.validateNamePassword(interviewerUserName,interviewerPassword);
    }
    public void showAlert(String alert){
        System.out.println(alert);
    }
}
