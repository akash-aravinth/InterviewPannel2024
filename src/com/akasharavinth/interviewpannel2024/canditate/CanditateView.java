package com.akasharavinth.interviewpannel2024.canditate;

import java.util.Scanner;

public class CanditateView {
    private CanditateModel canditateModel;
    public CanditateView(){
        canditateModel = new CanditateModel(this);
    }
    public void init(){
       gettingChoice();
    }

    private void gettingChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.add Canditate \n 2.add Interviewer \n 3.Interviewer Login" +
                "\n 4.Logout \n 5.Exit ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 :{
                getCanditateInfo();
                break;
            }
            case 2 :{

                break;
            }
            case 3 : {
                break;
            }
            case 4 : {
                break;
            }
            case 5 :{
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
        System.out.println("Enter Your Name : ");
        String canditateName = scanner.next();
        System.out.println("Enter Canditate Phone No :");
        long canditatePhoneNo = scanner.nextLong();
        System.out.println("Enter Your EmailId : ");
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
