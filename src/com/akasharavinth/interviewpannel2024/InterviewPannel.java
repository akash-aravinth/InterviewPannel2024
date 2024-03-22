package com.akasharavinth.interviewpannel2024;

import com.akasharavinth.interviewpannel2024.login.LoginView;

public class InterviewPannel {
    public static InterviewPannel interviewPannel;

    public static InterviewPannel getInstance() {
        if (interviewPannel == null)
            interviewPannel = new InterviewPannel();
        return interviewPannel;
    }

    private String appName = "InterViewPannel";
    private String appVersion = "0.0.1";

    public String getAppName() {
        return appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void runProject() {
        LoginView loginView = new LoginView();
        loginView.init();
    }

    public static void main(String[] args) {
        InterviewPannel.getInstance().runProject();
    }

}
