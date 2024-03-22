package com.akasharavinth.interviewpannel2024.login;

import com.akasharavinth.interviewpannel2024.canditate.CanditateView;

public class LoginModel {
    private LoginView loginView;
    LoginModel(LoginView loginView){
        this.loginView = loginView;
    }

    public void validateUser(String userName, String password) {
        if(validUserName(userName)){
            if(validPassword(password)){
                CanditateView canditateView = new CanditateView();
                canditateView.init();
            }else{
                loginView.showAlert("Please Enter Valid Password");
                loginView.reLoginInfo();
            }
        }else{
            loginView.showAlert("Please Enter Valid UserName ");
            loginView.reLoginInfo();
        }
    }
    private boolean validUserName(String name){
        return name.equals("zsgs");
    }
    private boolean validPassword(String password){
        return password.equals("admin");
    }
}
