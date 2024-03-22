package com.akasharavinth.interviewpannel2024.login;

import com.akasharavinth.interviewpannel2024.InterviewPannel;

import java.util.Scanner;

public class LoginView {
    private LoginModel loginModel;
    public LoginView(){
        loginModel = new LoginModel(this);
    }
    public void init() {
        getLoginInfo();
    }

    private void getLoginInfo() {
        System.out.println("Welcome To "+ InterviewPannel.getInstance().getAppName()
                +" Version "+InterviewPannel.getInstance().getAppVersion());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your User Name ");
        String userName = scanner.next();
        System.out.println("Enter Your Password ");
        String password = scanner.next();
        loginModel.validateUser(userName,password);
    }
    public void showAlert(String alert){
        System.out.println(alert);
    }
    public void reLoginInfo(){
        System.out.println("Please Type Yes for Re-login or no for Exit ");
        Scanner scanner = new Scanner(System.in);
        String opinion = scanner.next();
        if(opinion.equalsIgnoreCase("yes")){
            getLoginInfo();
        } else if (opinion.equalsIgnoreCase("no")) {
            System.out.println("Thankyou So Much");
        }else{
            showAlert("Please Enter Valid Option Yes or No only");
            reLoginInfo();
        }
    }

}
