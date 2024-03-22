package com.akasharavinth.interviewpannel2024.login;

import com.akasharavinth.interviewpannel2024.datalayer.DataManagement;
import com.akasharavinth.interviewpannel2024.makeinterview.AccessCanditates;
import com.akasharavinth.interviewpannel2024.models.Interviewer;

import java.sql.DatabaseMetaData;

public class InterviewerLoginModel {
    private InterviewerLoginView interviewerLoginView;
    InterviewerLoginModel(InterviewerLoginView interviewerLoginView){
        this.interviewerLoginView = interviewerLoginView;
    }

    public void validateNamePassword(String interviewerUserName, String interviewerPassword) {
        if(validInterviewerUserName(interviewerUserName)){
            if(validInterviewerPassword(interviewerPassword)){
                System.out.println("Now You are Access the Canditates");
                AccessCanditates accessCanditates = new AccessCanditates();
                Interviewer i = getInterviewerDetails(interviewerUserName,interviewerPassword);
                accessCanditates.takeEvaluation(i);
            }else{
                System.out.println("Please Enter Valid Password");
                interviewerLoginView.gettingLoginDetails();
            }
        }else{
            System.out.println("Please Enter Valid UserName");
            interviewerLoginView.gettingLoginDetails();
        }
    }
    private Interviewer getInterviewerDetails(String interviewerUserName,String interviewerPassword){
        for (Interviewer i : DataManagement.getInstance().getInterviewerList()){
            if (i.getInterviewerName().equals(interviewerUserName) &&
            i.getInterviewerPassword().equals(interviewerPassword)){
                return i;
            }
        }
        return null;
    }

    private boolean validInterviewerPassword(String interviewerPassword) {
        for(Interviewer i : DataManagement.getInstance().getInterviewerList()){
            if(i.getInterviewerPassword().equals(interviewerPassword))
                return true;
        }
        return false;
    }

    private boolean validInterviewerUserName(String interviewerUserName) {
        for (Interviewer i : DataManagement.getInstance().getInterviewerList()){
            if(i.getInterviewerName().equals(interviewerUserName))
                return true;
        }
        return false;
    }
}
